//author florian.gorshoefer
package com.mycompany.raptortodo;
public class GUITaskAnsicht extends javax.swing.JFrame {
    ControlGUI ControlGUI1;
    Brain brain;
    //Konstruktor
    public GUITaskAnsicht(ControlGUI aControlGUI) {
        ControlGUI1 = aControlGUI;
        initComponents();
    }
    
    //Holt die vom User eingetragene Bearbeitungszeit
    //Es fehlt noch das Try Catch damit nur Zahlen eingetragen werden können.
    public int getBearbeitungszeit(){
        int iBearbeitungszeit;
        try{
        iBearbeitungszeit = Integer.parseInt(txfTatsaechlicheZeit.getText());
        //hier könnte auch eine Exception geworfen werden
        if(0 == iBearbeitungszeit| 0 > iBearbeitungszeit){
            iBearbeitungszeit = -1;
        }
        }catch(NumberFormatException e){
            iBearbeitungszeit = -1;
        }
        return iBearbeitungszeit;
    }
    
    //Setzt das txfVonUser auf den User von dem die Aufgabe kommt
    public void setVonUser(String sUser){
        txfVonUser.setText(sUser);
    }
    
    //Setzt die Eingeschätzte Zeit auf den Wert der in der DB steht
    public void setEstimatedTime(int iEstimatedTime){
        if(iEstimatedTime != 0){
            txfEingeschätzteZeit.setText(iEstimatedTime+"");
        }else{
            txfEingeschätzteZeit.setText("");
        }
        
    }
    
    //Liste wird in die Taskübersicht eingetragen
    public void setlstAllTasks(String[] listData){
        lstAllTasks.setListData(listData);
    }
    
    //Setzt die TaskDescription auf die Ausgewählte Task
    public void setTaskDescription(String sTaskDescription){
        txaTaskDescription.setText(sTaskDescription);
    }
    public void setTxfTatsaechlicheZeit(int iTime){
        //Ich geh mal einfach davon aus das es keine Task gibt die 0 Minuten brauchen. Wär ja sonst Sinnlos
        if(iTime !=0){
            txfTatsaechlicheZeit.setText(iTime+"");
        }else{
            txfTatsaechlicheZeit.setText("");
        }
        
    }
    //bekommt das selektierte Feld zurück
    public int getListAllTasksSelection(){
        return lstAllTasks.getSelectedIndex();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngFinishQuestion = new javax.swing.ButtonGroup();
        PanelTaskBackground = new javax.swing.JPanel();
        btnTaskAnsichtExit = new javax.swing.JButton();
        btnNewTask = new javax.swing.JButton();
        btnMyTasks = new javax.swing.JButton();
        scpTXATaskDescription = new javax.swing.JScrollPane();
        txaTaskDescription = new javax.swing.JTextArea();
        btnTaskFinish = new javax.swing.JButton();
        scpLSTAllTasks = new javax.swing.JScrollPane();
        lstAllTasks = new javax.swing.JList<>();
        btnShowTask = new javax.swing.JButton();
        btnaction = new javax.swing.JButton();
        lblVonUser = new javax.swing.JLabel();
        lblEingeschätzteZeit = new javax.swing.JLabel();
        txfVonUser = new javax.swing.JTextField();
        txfEingeschätzteZeit = new javax.swing.JTextField();
        txfTatsaechlicheZeit = new javax.swing.JTextField();
        lblTatsaechlicheZeit = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnBenutzerErstellen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Programm Name] Meine Aufgaben");
        setMinimumSize(new java.awt.Dimension(1024, 580));

        PanelTaskBackground.setBackground(new java.awt.Color(40, 40, 40));
        PanelTaskBackground.setMaximumSize(new java.awt.Dimension(1024, 580));
        PanelTaskBackground.setMinimumSize(new java.awt.Dimension(1024, 580));
        PanelTaskBackground.setPreferredSize(new java.awt.Dimension(1024, 580));

        btnTaskAnsichtExit.setBackground(new java.awt.Color(18, 110, 99));
        btnTaskAnsichtExit.setForeground(new java.awt.Color(145, 237, 228));
        btnTaskAnsichtExit.setText("EXIT");
        btnTaskAnsichtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskAnsichtExitActionPerformed(evt);
            }
        });

        btnNewTask.setBackground(new java.awt.Color(18, 110, 99));
        btnNewTask.setForeground(new java.awt.Color(145, 237, 228));
        btnNewTask.setText("Neue Aufgabe");
        btnNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTaskActionPerformed(evt);
            }
        });

        btnMyTasks.setBackground(new java.awt.Color(18, 110, 99));
        btnMyTasks.setForeground(new java.awt.Color(145, 237, 228));
        btnMyTasks.setText("Meine Aufgaben Refresh");
        btnMyTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyTasksActionPerformed(evt);
            }
        });

        txaTaskDescription.setEditable(false);
        txaTaskDescription.setBackground(new java.awt.Color(18, 110, 99));
        txaTaskDescription.setColumns(20);
        txaTaskDescription.setForeground(new java.awt.Color(145, 237, 228));
        txaTaskDescription.setRows(5);
        scpTXATaskDescription.setViewportView(txaTaskDescription);

        btnTaskFinish.setBackground(new java.awt.Color(18, 110, 99));
        btnTaskFinish.setForeground(new java.awt.Color(145, 237, 228));
        btnTaskFinish.setText("Abgabe");
        btnTaskFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskFinishActionPerformed(evt);
            }
        });

        lstAllTasks.setBackground(new java.awt.Color(18, 110, 99));
        lstAllTasks.setForeground(new java.awt.Color(145, 237, 228));
        lstAllTasks.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAllTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        scpLSTAllTasks.setViewportView(lstAllTasks);

        btnShowTask.setBackground(new java.awt.Color(18, 110, 99));
        btnShowTask.setForeground(new java.awt.Color(145, 237, 228));
        btnShowTask.setText("Aufgabe Anzeigen");
        btnShowTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTaskActionPerformed(evt);
            }
        });

        btnaction.setBackground(new java.awt.Color(18, 110, 99));
        btnaction.setForeground(new java.awt.Color(145, 237, 228));
        btnaction.setText("Bearbeiten");
        btnaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactionActionPerformed(evt);
            }
        });

        lblVonUser.setForeground(new java.awt.Color(145, 237, 228));
        lblVonUser.setText("Von User: ");

        lblEingeschätzteZeit.setForeground(new java.awt.Color(145, 237, 228));
        lblEingeschätzteZeit.setText("Eingeschätzte Zeit: ");

        txfVonUser.setEditable(false);
        txfVonUser.setBackground(new java.awt.Color(18, 110, 99));
        txfVonUser.setForeground(new java.awt.Color(145, 237, 228));
        txfVonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfVonUserActionPerformed(evt);
            }
        });

        txfEingeschätzteZeit.setBackground(new java.awt.Color(18, 110, 99));
        txfEingeschätzteZeit.setForeground(new java.awt.Color(145, 237, 228));

        txfTatsaechlicheZeit.setBackground(new java.awt.Color(18, 110, 99));
        txfTatsaechlicheZeit.setForeground(new java.awt.Color(145, 237, 228));
        txfTatsaechlicheZeit.setMaximumSize(new java.awt.Dimension(72, 22));
        txfTatsaechlicheZeit.setMinimumSize(new java.awt.Dimension(72, 22));
        txfTatsaechlicheZeit.setPreferredSize(new java.awt.Dimension(72, 22));

        lblTatsaechlicheZeit.setBackground(new java.awt.Color(145, 237, 228));
        lblTatsaechlicheZeit.setForeground(new java.awt.Color(145, 237, 228));
        lblTatsaechlicheZeit.setText("Bearbeitungs Zeit in min.: ");

        btnLogout.setBackground(new java.awt.Color(18, 110, 99));
        btnLogout.setForeground(new java.awt.Color(145, 237, 228));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBenutzerErstellen.setBackground(new java.awt.Color(18, 110, 99));
        btnBenutzerErstellen.setForeground(new java.awt.Color(145, 237, 228));
        btnBenutzerErstellen.setText("Benutzer Erstellen");
        btnBenutzerErstellen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBenutzerErstellenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTaskBackgroundLayout = new javax.swing.GroupLayout(PanelTaskBackground);
        PanelTaskBackground.setLayout(PanelTaskBackgroundLayout);
        PanelTaskBackgroundLayout.setHorizontalGroup(
            PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                        .addComponent(btnNewTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMyTasks))
                    .addComponent(scpLSTAllTasks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lblVonUser)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                                .addComponent(btnShowTask)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBenutzerErstellen)
                                                .addGap(0, 281, Short.MAX_VALUE))
                                            .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(txfVonUser, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                        .addComponent(lblEingeschätzteZeit)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfEingeschätzteZeit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                        .addComponent(btnLogout)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTaskAnsichtExit))))
                            .addComponent(scpTXATaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaskBackgroundLayout.createSequentialGroup()
                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                                .addComponent(btnaction)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaskBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTatsaechlicheZeit)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaskBackgroundLayout.createSequentialGroup()
                                .addComponent(txfTatsaechlicheZeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaskBackgroundLayout.createSequentialGroup()
                                .addComponent(btnTaskFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))))))
        );
        PanelTaskBackgroundLayout.setVerticalGroup(
            PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewTask)
                    .addComponent(btnMyTasks)
                    .addComponent(btnTaskAnsichtExit)
                    .addComponent(btnShowTask)
                    .addComponent(btnLogout)
                    .addComponent(btnBenutzerErstellen))
                .addGap(18, 18, 18)
                .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTaskBackgroundLayout.createSequentialGroup()
                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVonUser)
                            .addComponent(txfVonUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEingeschätzteZeit)
                            .addComponent(txfEingeschätzteZeit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scpTXATaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfTatsaechlicheZeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTatsaechlicheZeit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTaskFinish)
                            .addComponent(btnaction)))
                    .addComponent(scpLSTAllTasks))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTaskBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTaskBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaskAnsichtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskAnsichtExitActionPerformed
        ControlGUI1.exitProgramm();
    }//GEN-LAST:event_btnTaskAnsichtExitActionPerformed

    private void btnNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTaskActionPerformed

        //NewTask1 sichtbar machen
        ControlGUI1.setGUINewTaskVisible();
    }//GEN-LAST:event_btnNewTaskActionPerformed

    private void btnShowTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTaskActionPerformed
        ControlGUI1.showTaskBtn();
    }//GEN-LAST:event_btnShowTaskActionPerformed

    private void btnMyTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyTasksActionPerformed
        ControlGUI1.btnMyTaskRefresh();
    }//GEN-LAST:event_btnMyTasksActionPerformed

    private void btnactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactionActionPerformed
        ControlGUI1.taskBearbeitenBtn();
        
    }//GEN-LAST:event_btnactionActionPerformed

    private void btnTaskFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskFinishActionPerformed
        ControlGUI1.taskFinishBtnTaskAnsicht();
    }//GEN-LAST:event_btnTaskFinishActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        // macht die Task Ansicht unsichtbar
        ControlGUI1.setTaskAnsichtInvisible();
        
        // macht den Loginscreen wieder sichtbar
        ControlGUI1.setGUILoginVisible();
        
        //Logt den User aus
        ControlGUI1.logoutBtnTaskAnsicht();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txfVonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfVonUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfVonUserActionPerformed

    private void btnBenutzerErstellenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBenutzerErstellenActionPerformed
        // TODO add your handling code here:
        ControlGUI1.OpenbenutzerErstellen();
    }//GEN-LAST:event_btnBenutzerErstellenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTaskBackground;
    private javax.swing.JButton btnBenutzerErstellen;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMyTasks;
    private javax.swing.JButton btnNewTask;
    private javax.swing.JButton btnShowTask;
    private javax.swing.JButton btnTaskAnsichtExit;
    private javax.swing.JButton btnTaskFinish;
    private javax.swing.JButton btnaction;
    private javax.swing.ButtonGroup btngFinishQuestion;
    private javax.swing.JLabel lblEingeschätzteZeit;
    private javax.swing.JLabel lblTatsaechlicheZeit;
    private javax.swing.JLabel lblVonUser;
    private javax.swing.JList<String> lstAllTasks;
    private javax.swing.JScrollPane scpLSTAllTasks;
    private javax.swing.JScrollPane scpTXATaskDescription;
    private javax.swing.JTextArea txaTaskDescription;
    private javax.swing.JTextField txfEingeschätzteZeit;
    private javax.swing.JTextField txfTatsaechlicheZeit;
    private javax.swing.JTextField txfVonUser;
    // End of variables declaration//GEN-END:variables
}
