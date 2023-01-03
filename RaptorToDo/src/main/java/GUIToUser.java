
import java.util.List;

public class GUIToUser extends javax.swing.JFrame {
    //Globale Variable
    ControlGUI ControlGUI1;
    private String[] selectedUsersSpaghetti;
    //Konstruktor
    public GUIToUser(ControlGUI aControlGUI) {
        ControlGUI1 = aControlGUI;
        initComponents();
    }
    
    //Die Liste aller Namen an die der User Aufgaben verteilen darf eintragen
    public void setlstAllUsers(String[] sAllUsers){
        lstAllUsers.setListData(sAllUsers);
    }
    
        //get alle ausgewählten User
    public String[] getlstAllUseresSelected(){
        List<String> selectedValuesList = lstAllUsers.getSelectedValuesList();
        String[] sSelectedUsers = selectedValuesList.toArray(String[]::new);
        return sSelectedUsers;
    }
    
    //in lstSelectedUsers alle neuen User eintragen
    public void setlstSelectedUseres(String[] sSelectedUsers){
        lstSelectedUseres.setListData(sSelectedUsers);
        selectedUsersSpaghetti = sSelectedUsers;
    }
    
    public String getSelectedUsersSelected(){
        return lstSelectedUseres.getSelectedValue();
    }
    
    public String[] getSelectedUsersAll(){
        return selectedUsersSpaghetti;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scpLSTAllUseres = new javax.swing.JScrollPane();
        lstAllUsers = new javax.swing.JList<>();
        scpLSTSelcetedUseres = new javax.swing.JScrollPane();
        lstSelectedUseres = new javax.swing.JList<>();
        btnAbbrechen = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        btnAn = new javax.swing.JButton();
        btnEntfernen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mitarbeiter oder Dienstleister auswählen");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(854, 480));

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setMaximumSize(new java.awt.Dimension(854, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(854, 480));

        lstAllUsers.setBackground(new java.awt.Color(18, 110, 99));
        lstAllUsers.setForeground(new java.awt.Color(145, 237, 228));
        lstAllUsers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scpLSTAllUseres.setViewportView(lstAllUsers);

        lstSelectedUseres.setBackground(new java.awt.Color(18, 110, 99));
        lstSelectedUseres.setForeground(new java.awt.Color(145, 237, 228));
        lstSelectedUseres.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstSelectedUseres.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        scpLSTSelcetedUseres.setViewportView(lstSelectedUseres);

        btnAbbrechen.setBackground(new java.awt.Color(18, 110, 99));
        btnAbbrechen.setForeground(new java.awt.Color(145, 237, 228));
        btnAbbrechen.setText("Abbrechen");
        btnAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbbrechenActionPerformed(evt);
            }
        });

        btnOK.setBackground(new java.awt.Color(18, 110, 99));
        btnOK.setForeground(new java.awt.Color(145, 237, 228));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnAn.setBackground(new java.awt.Color(18, 110, 99));
        btnAn.setForeground(new java.awt.Color(145, 237, 228));
        btnAn.setText("    An:    ");
        btnAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnActionPerformed(evt);
            }
        });

        btnEntfernen.setBackground(new java.awt.Color(18, 110, 99));
        btnEntfernen.setForeground(new java.awt.Color(145, 237, 228));
        btnEntfernen.setText("Entfernen");
        btnEntfernen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntfernenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpLSTAllUseres, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbbrechen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAn)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEntfernen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(scpLSTSelcetedUseres, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scpLSTAllUseres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnAn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntfernen))
                    .addComponent(scpLSTSelcetedUseres))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbbrechen)
                    .addComponent(btnOK))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbbrechenActionPerformed
        //GUIToUser unsichtbar machen;  
        ControlGUI1.setGUIToUserInvisible();
        String[] asEmpty = new String[1];
        selectedUsersSpaghetti = asEmpty;
    }//GEN-LAST:event_btnAbbrechenActionPerformed

    private void btnAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnActionPerformed
        ControlGUI1.btnAnFunktion();
    }//GEN-LAST:event_btnAnActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        //GUIToUser unsichtbar machen;  
        ControlGUI1.setGUIToUserInvisible();
        //GUIToUser Namen in "GUINewTask.txfToSubject" eintragen
        ControlGUI1.IstSelectedUseresIntotxfToUser();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnEntfernenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntfernenActionPerformed
        //Selected Listen Elemente aus "lstSelectedUseres" in "lstSelectedUseres" entfernen
        ControlGUI1.deleteOneSelectedUser();
    }//GEN-LAST:event_btnEntfernenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbbrechen;
    private javax.swing.JButton btnAn;
    private javax.swing.JButton btnEntfernen;
    private javax.swing.JButton btnOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> lstAllUsers;
    private javax.swing.JList<String> lstSelectedUseres;
    private javax.swing.JScrollPane scpLSTAllUseres;
    private javax.swing.JScrollPane scpLSTSelcetedUseres;
    // End of variables declaration//GEN-END:variables
}
