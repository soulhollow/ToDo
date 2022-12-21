import java.sql.*;

public class DB_Connection {

   static final String DB_URL ="jdbc:mysql://127.0.0.1:3306/todo"; //name der datenbank bei todo einfügen
   static final String DB_DRV ="com.mysql.jdbc.Driver"; //vielleicht unnötig
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";
   
   public String getter (String ausgabe_type, String zeile, String befehl) throws SQLException{
      
      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;
      String wert = "";
      try{
        connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
      
        statement=connection.createStatement();
        String sql = befehl; // sqlabfrage hier verarbeiten
        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            switch (ausgabe_type) {
                case "int":
                    int ausgabe1 = resultSet.getInt(zeile);
                    wert = Integer.toString(ausgabe1);
                    break;
                case "String":
                    String ausgabe2 = resultSet.getString(zeile);
                    wert = ausgabe2;
                    break;
                case "boolean":
                    boolean ausgabe3 = resultSet.getBoolean(zeile);
                    wert = Boolean.toString(ausgabe3);
                    break;
            }

        }
         

      }catch(SQLException ex){
          throw new SQLException();
      }
      
     try {
        statement.close();
        connection.close();
     } catch (SQLException ex) { 
         throw new SQLException();
     }
     return wert;
    
   }
   public void setter(String wert, String befehl) throws SQLException {
       
    Connection connection = null;
    PreparedStatement statement = null;
    
    try {
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
        String sql = befehl; // sql update statement here
        statement = connection.prepareStatement(sql);
        statement.setString(1, wert);
        statement.executeUpdate();
        
    } catch (SQLException ex) {
        throw new SQLException();
        
    } finally {
        
        try {
            statement.close();
            connection.close();
            
        } catch (SQLException ex) {
            throw new SQLException();
            
        }
    }
}
   
    
}

