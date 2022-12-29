//author florian.ruffner ++ florian.gorshoefer
package com.mycompany.raptortodo;
public class GUIBenutzerErstellen extends javax.swing.JFrame {
    
    //Globale Variablen
    ControlGUI ControlGUI1;

    //Konstruktor
    public GUIBenutzerErstellen(ControlGUI aControlGUI) {
        ControlGUI1 = aControlGUI;
        initComponents();
    }
    
    public String getVorname(){
        return txfVorname.getText();
    }
    
    public String getName(){
        return txfName.getText();
    }
    
    public int getGehalt(){
        return Integer.parseInt(txfGehalt.getText());
    }
    
    public int getPosition(){
        return Integer.parseInt(ListPosition.getSelectedValue());
    }
    
    public String getEmail(){
        return txfEmail.getText();
    }
    
    public void setVorname (String vorname){
        txfVorname.setText(vorname);
    }
    
    public void setName (String name){
        txfName.setText(name);
    }
    
    public void setGehalt (int gehalt){
        if (gehalt==-1) {
            txfGehalt.setText("");
        }else{
            txfGehalt.setText(Integer.toString(gehalt));
        }
    }
    
    public void setPosition (int position){
        if (position==-1) {
            ListPosition.clearSelection();
        }else{
            ListPosition.setSelectedIndex(position);
        }
    }
    
    public void setEmail (String Email){
        txfEmail.setText(Email);
    }
    
    
    //get alle ausgewählte User hintereinander als String
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNewTaskBackground = new javax.swing.JPanel();
        txfVorname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        txfEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfGehalt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnErstellen = new javax.swing.JButton();
        btnAbbrechen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListPosition = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neue Aufgaben verfassen");
        setMaximumSize(new java.awt.Dimension(437, 260));
        setMinimumSize(new java.awt.Dimension(437, 260));

        PanelNewTaskBackground.setBackground(new java.awt.Color(40, 40, 40));
        PanelNewTaskBackground.setMaximumSize(new java.awt.Dimension(437, 260));
        PanelNewTaskBackground.setMinimumSize(new java.awt.Dimension(437, 260));
        PanelNewTaskBackground.setPreferredSize(new java.awt.Dimension(437, 260));

        txfVorname.setBackground(new java.awt.Color(18, 110, 99));
        txfVorname.setForeground(new java.awt.Color(145, 237, 228));
        txfVorname.setText("Vorname");

        jLabel1.setForeground(new java.awt.Color(145, 237, 228));
        jLabel1.setText("Vorname:");

        jLabel2.setForeground(new java.awt.Color(145, 237, 228));
        jLabel2.setText("Name:");

        txfName.setBackground(new java.awt.Color(18, 110, 99));
        txfName.setForeground(new java.awt.Color(145, 237, 228));
        txfName.setText("Name");

        txfEmail.setBackground(new java.awt.Color(18, 110, 99));
        txfEmail.setForeground(new java.awt.Color(145, 237, 228));
        txfEmail.setText("E_Mail");

        jLabel3.setForeground(new java.awt.Color(145, 237, 228));
        jLabel3.setText("E-Mail");

        jLabel5.setForeground(new java.awt.Color(145, 237, 228));
        jLabel5.setText("Gehalt:");

        txfGehalt.setBackground(new java.awt.Color(18, 110, 99));
        txfGehalt.setForeground(new java.awt.Color(145, 237, 228));
        txfGehalt.setText("Gehalt");

        jLabel6.setForeground(new java.awt.Color(145, 237, 228));
        jLabel6.setText("Position:");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(145, 237, 228));
        jLabel7.setText("Benutzer Erstellen");

        btnErstellen.setBackground(new java.awt.Color(18, 110, 99));
        btnErstellen.setForeground(new java.awt.Color(145, 237, 228));
        btnErstellen.setText("Erstellen");
        btnErstellen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErstellenActionPerformed(evt);
            }
        });

        btnAbbrechen.setBackground(new java.awt.Color(18, 110, 99));
        btnAbbrechen.setForeground(new java.awt.Color(145, 237, 228));
        btnAbbrechen.setText("Abbrechen");
        btnAbbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbbrechenActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(18, 110, 99));
        btnExit.setForeground(new java.awt.Color(145, 237, 228));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(18, 110, 99));
        jButton1.setForeground(new java.awt.Color(145, 237, 228));
        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ListPosition.setBackground(new java.awt.Color(18, 110, 99));
        ListPosition.setForeground(new java.awt.Color(145, 237, 228));
        ListPosition.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListPosition);

        javax.swing.GroupLayout PanelNewTaskBackgroundLayout = new javax.swing.GroupLayout(PanelNewTaskBackground);
        PanelNewTaskBackground.setLayout(PanelNewTaskBackgroundLayout);
        PanelNewTaskBackgroundLayout.setHorizontalGroup(
            PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(46, 46, 46))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnErstellen)
                            .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfVorname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfGehalt))))
                    .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAbbrechen)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(118, 118, 118))
        );
        PanelNewTaskBackgroundLayout.setVerticalGroup(
            PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfGehalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnAbbrechen)
                    .addComponent(jButton1)
                    .addComponent(btnErstellen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNewTaskBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNewTaskBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnErstellenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErstellenActionPerformed
        // TODO add your handling code here:
        ControlGUI1.benutzerErstellen();
    }//GEN-LAST:event_btnErstellenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        ControlGUI1.exitProgramm();
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ControlGUI1.clearBenutzerGUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbbrechenActionPerformed
        // TODO add your handling code here:
        ControlGUI1.abbrechenBenutzer();
    }//GEN-LAST:event_btnAbbrechenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListPosition;
    private javax.swing.JPanel PanelNewTaskBackground;
    private javax.swing.JButton btnAbbrechen;
    private javax.swing.JButton btnErstellen;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfGehalt;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfVorname;
    // End of variables declaration//GEN-END:variables
}
