public class GUINewTask extends javax.swing.JFrame {
    
    //Globale Variablen
    ControlGUI ControlGUI1;

    //Konstruktor
    public GUINewTask(ControlGUI aControlGUI) {
        ControlGUI1 = aControlGUI;
        initComponents();
    }
    
    //get alle ausgewählte User hintereinander als String
    public String getUseres(){
        String sUsernames = txfToUser.getText();
        return sUsernames;
    }
    
    //setzt die User aus dem An Feld
    public void setUsers(String sUsers){
        txfToUser.setText(sUsers);
    }
    
    //bekommt den Betreff als String
    public String getSubject(){
    String sSubject = txfSubject.getText();
    return sSubject;
    }
    
    //bekommt die Task Beschreibung als String
    public String getDescription(){
    String sDescription = txaTaskDescription.getText();
    return sDescription;
    }
    
    //bekommt den Zeitaufwand in Minuten als String und Wandelt in Integer um für kleineres Datenvolumen
    public int getZeitaufwand(){
        int iZeitaufwand = Integer.parseInt(txfZeitaufwand.getText());
        return iZeitaufwand;
    }   
    
    //Um die ganzen Textfelder halt leer zu machen lol
    public void resetUsers(){
        txfToUser.setText("");
    }
    public void resetSubject(){
        txfSubject.setText("");
    }
    public void resetDescription(){
        txaTaskDescription.setText("");
    }
    public void resetZeitaufwand(){
        txfZeitaufwand.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNewTaskBackground = new javax.swing.JPanel();
        btnNewTaskCancel = new javax.swing.JButton();
        scTXATaskDescription = new javax.swing.JScrollPane();
        txaTaskDescription = new javax.swing.JTextArea();
        txfSubject = new javax.swing.JTextField();
        lblSubject = new javax.swing.JLabel();
        btnToUser = new javax.swing.JButton();
        txfToUser = new javax.swing.JTextField();
        btnSendTask = new javax.swing.JButton();
        btnSaveTask = new javax.swing.JButton();
        lblTimeNeeded = new javax.swing.JLabel();
        txfZeitaufwand = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neue Aufgaben verfassen");
        setMinimumSize(new java.awt.Dimension(858, 480));

        PanelNewTaskBackground.setBackground(new java.awt.Color(40, 40, 40));
        PanelNewTaskBackground.setMaximumSize(new java.awt.Dimension(858, 480));
        PanelNewTaskBackground.setMinimumSize(new java.awt.Dimension(858, 480));

        btnNewTaskCancel.setBackground(new java.awt.Color(18, 110, 99));
        btnNewTaskCancel.setForeground(new java.awt.Color(145, 237, 228));
        btnNewTaskCancel.setText("Abbrechen");
        btnNewTaskCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTaskCancelActionPerformed(evt);
            }
        });

        txaTaskDescription.setBackground(new java.awt.Color(18, 110, 99));
        txaTaskDescription.setColumns(20);
        txaTaskDescription.setForeground(new java.awt.Color(145, 237, 228));
        txaTaskDescription.setRows(5);
        scTXATaskDescription.setViewportView(txaTaskDescription);

        txfSubject.setBackground(new java.awt.Color(18, 110, 99));
        txfSubject.setForeground(new java.awt.Color(145, 237, 228));

        lblSubject.setBackground(new java.awt.Color(18, 110, 99));
        lblSubject.setForeground(new java.awt.Color(145, 237, 228));
        lblSubject.setText("Betreff: ");

        btnToUser.setBackground(new java.awt.Color(18, 110, 99));
        btnToUser.setForeground(new java.awt.Color(145, 237, 228));
        btnToUser.setText("An:");
        btnToUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToUserActionPerformed(evt);
            }
        });

        txfToUser.setBackground(new java.awt.Color(18, 110, 99));
        txfToUser.setForeground(new java.awt.Color(145, 237, 228));

        btnSendTask.setBackground(new java.awt.Color(18, 110, 99));
        btnSendTask.setForeground(new java.awt.Color(145, 237, 228));
        btnSendTask.setText("Task abschicken");
        btnSendTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendTaskActionPerformed(evt);
            }
        });

        btnSaveTask.setBackground(new java.awt.Color(18, 110, 99));
        btnSaveTask.setForeground(new java.awt.Color(145, 237, 228));
        btnSaveTask.setText("Entwurf speichern");
        btnSaveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTaskActionPerformed(evt);
            }
        });

        lblTimeNeeded.setBackground(new java.awt.Color(18, 110, 99));
        lblTimeNeeded.setForeground(new java.awt.Color(145, 237, 228));
        lblTimeNeeded.setText("Zeitaufwand in min.: ");

        txfZeitaufwand.setBackground(new java.awt.Color(18, 110, 99));
        txfZeitaufwand.setForeground(new java.awt.Color(145, 237, 228));

        javax.swing.GroupLayout PanelNewTaskBackgroundLayout = new javax.swing.GroupLayout(PanelNewTaskBackground);
        PanelNewTaskBackground.setLayout(PanelNewTaskBackgroundLayout);
        PanelNewTaskBackgroundLayout.setHorizontalGroup(
            PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSendTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewTaskCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveTask)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblSubject)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                        .addComponent(btnToUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfSubject)
                            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                                .addComponent(txfToUser, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                                .addGap(31, 31, 31)
                                .addComponent(lblTimeNeeded)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfZeitaufwand, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(scTXATaskDescription, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PanelNewTaskBackgroundLayout.setVerticalGroup(
            PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendTask)
                    .addComponent(btnNewTaskCancel)
                    .addComponent(btnSaveTask))
                .addGap(18, 18, 18)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToUser)
                    .addComponent(txfToUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimeNeeded)
                    .addComponent(txfZeitaufwand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubject)
                    .addComponent(txfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scTXATaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNewTaskBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNewTaskBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnToUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToUserActionPerformed
        //GUIToUser wird sichtbar gemacht
        ControlGUI1.setGUIToUserVisible();
    }//GEN-LAST:event_btnToUserActionPerformed

    private void btnNewTaskCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTaskCancelActionPerformed
        //GUINewTask1.setVisible(false); oder noch besser etwas das das Fenster wirklich schließt.
        ControlGUI1.setGUINewTaskInvisible();
        
        //leert alle Textfelder in NewTask1
        ControlGUI1.resetNewTask();
    }//GEN-LAST:event_btnNewTaskCancelActionPerformed

    private void btnSaveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTaskActionPerformed
        //Speichert die Aufgabe irgendwo
        ControlGUI1.saveNewTask();
    }//GEN-LAST:event_btnSaveTaskActionPerformed

    private void btnSendTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendTaskActionPerformed
        ControlGUI1.sendTask();
    }//GEN-LAST:event_btnSendTaskActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelNewTaskBackground;
    private javax.swing.JButton btnNewTaskCancel;
    private javax.swing.JButton btnSaveTask;
    private javax.swing.JButton btnSendTask;
    private javax.swing.JButton btnToUser;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTimeNeeded;
    private javax.swing.JScrollPane scTXATaskDescription;
    private javax.swing.JTextArea txaTaskDescription;
    private javax.swing.JTextField txfSubject;
    private javax.swing.JTextField txfToUser;
    private javax.swing.JTextField txfZeitaufwand;
    // End of variables declaration//GEN-END:variables
}
