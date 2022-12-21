import java.sql.SQLException;

public class DB_abfrage {
    
    DB_Connection dp_connection = new DB_Connection();

    public double getSalary(String iD_Worker) throws SQLException{
        String übergabe;
        String sql = "SELECT Salary FROM workertabele WHERE ID_Worker = '" + iD_Worker + "'";
        übergabe = dp_connection.getter("double", "Salary", sql);
        double salary = Double.parseDouble(übergabe);
        return salary;
    }

    public int getPosition(String iD_Worker) throws SQLException{
        String result;
        String sql = "SELECT Position FROM workertabele WHERE ID_Worker = '" + iD_Worker + "'";
        result = dp_connection.getter("int", "Position", sql);
        int position = Integer.parseInt(result);
        return position;
    }

    public String getName(String iD_Worker) throws SQLException {
        String result;
        String sql = "SELECT Name FROM workertabele WHERE ID_Worker = '" + iD_Worker + "'";
        result = dp_connection.getter("String", "Name", sql);
        return result;
    }

    public String getFirstName(String iD_Worker) throws SQLException {
        String result;
        String sql = "SELECT FirstName FROM workertabele WHERE ID_Worker = '" + iD_Worker + "'";
        result = dp_connection.getter("String", "FirstName", sql);
        return result;
    }

    public boolean isWorkerStatus(String iD_Worker) throws SQLException {
        String result;
        String sql = "SELECT WorkerStatus FROM workertabele WHERE ID_Worker = '" + iD_Worker + "'";
        result = dp_connection.getter("boolean", "WorkerStatus", sql);
        boolean workerStatus = Boolean.parseBoolean(result);
        return workerStatus;
    }

    public String getAdress(String iD_Worker) throws SQLException {
        String result;
        String sql = "SELECT Adress FROM workertabele WHERE ID_Worker = '" + iD_Worker + "'";
        result = dp_connection.getter("String", "Adress", sql);
        return result;
    }
    
    public int getEstimatedTime(String iD_Task) throws SQLException{
        String result;
        String sql = "SELECT estimatedTime FROM tasktabele WHERE ID_Task = '" + iD_Task + "'";
        result = dp_connection.getter("int", "estimatedTime", sql);
        int estimatedTime = Integer.parseInt(result);
        return estimatedTime;
    }

    public boolean isTaskStatus(String iD_Task) throws SQLException {
        String result;
        String sql = "SELECT Status FROM tasktabele WHERE ID_Task = '" + iD_Task + "'";
        result = dp_connection.getter("boolean", "Status", sql);
        return Boolean.parseBoolean(result);
    }

    public String getTaskTag(String iD_Task) throws SQLException {
        String result;
        String sql = "SELECT taskTag FROM tasktabele WHERE ID_Task = '" + iD_Task + "'";
        result = dp_connection.getter("String", "taskTag", sql);
        return result;
    }

    public int getCorrespondingWorkerID(String iD_Task) throws SQLException {
        String übergabe;
        String sql = "SELECT ID_Worker FROM tasktabele WHERE ID_Task = '" + iD_Task + "'";
        übergabe = dp_connection.getter("String", "ID_Worker", sql);
        int correspondingWorkerID = Integer.parseInt(übergabe); 
        return correspondingWorkerID;
    }

    public void setSalary(double salary, String iD_Worker) throws SQLException{
        String sql = "UPDATE workertabele SET Salary = '" + salary + "' WHERE ID_Worker = '" + iD_Worker + "'";
        dp_connection.setter(Double.toString(salary), sql);
    }

    public void setPosition(int position, String iD_Worker) throws SQLException {
    String sql = "UPDATE workertabele SET Position = '" + position + "' WHERE ID_Worker = '" + iD_Worker + "'";
    dp_connection.setter(Integer.toString(position), sql);
    }

    public void setName(String name, String iD_Worker) throws SQLException {
        String sql = "UPDATE workertabele SET Name = '" + name + "' WHERE ID_Worker = '" + iD_Worker + "'";
        dp_connection.setter(name, sql);
    }

    public void setLastName(String lastName, String iD_Worker) throws SQLException {
        String sql = "UPDATE workertabele SET LastName = '" + lastName + "' WHERE ID_Worker = '" + iD_Worker + "'";
        dp_connection.setter(lastName, sql);
    }

    public void setWorkerStatus(boolean workerStatus, String iD_Worker) throws SQLException {
        String sql = "UPDATE workertabele SET WorkerStatus = '" + workerStatus + "' WHERE ID_Worker = '" + iD_Worker + "'";
        dp_connection.setter(Boolean.toString(workerStatus), sql);
    }

    public void setAdress(String adressOwner, String iD_Worker) throws SQLException {
        String sql = "UPDATE workertabele SET AdressOwner = '" + adressOwner + "' WHERE ID_Worker = '" + iD_Worker + "'";
        dp_connection.setter(adressOwner, sql);
    }


    public void setEstimatedTime(int estimatedTime, String iD_Task) throws SQLException {
        String sql = "UPDATE tasktabele SET estimatedTime = '" + estimatedTime + "' WHERE ID_Task = '" + iD_Task + "'";
        dp_connection.setter(Integer.toString(estimatedTime), sql);
    }

    public void setTaskStatus(boolean taskStatus, String iD_Task) throws SQLException {
        String sql = "UPDATE tasktabele SET taskStatus = '" + taskStatus + "' WHERE ID_Task = '" + iD_Task + "'";
        dp_connection.setter(Boolean.toString(taskStatus), sql);
    }

    public void setTaskTag(String taskType, String iD_Task) throws SQLException {
        String sql = "UPDATE tasktabele SET taskType = '" + taskType + "' WHERE ID_Task = '" + iD_Task + "'";
        dp_connection.setter(taskType, sql);
    }

    public void setCorrespondingWorkerID(int correspondingWorkerID, String iD_Task) throws SQLException {
        String sql = "UPDATE workertasktable SET ID_Worker = '" + correspondingWorkerID + "' WHERE ID_Task = '" + iD_Task + "'";
        dp_connection.setter(Integer.toString(correspondingWorkerID), sql);
    }
    
    
}
