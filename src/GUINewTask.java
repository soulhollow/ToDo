/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projektuitest;

/**
 *
 * @author F
 */
public class GUINewTask extends javax.swing.JFrame {

    /**
     * Creates new form GUINewTask
     */
    public GUINewTask() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNewTaskBackground = new javax.swing.JPanel();
        btnCloseWindow = new javax.swing.JButton();
        scTXATaskDescription = new javax.swing.JScrollPane();
        txaTaskDescription = new javax.swing.JTextArea();
        txfSubject = new javax.swing.JTextField();
        lblSubject = new javax.swing.JLabel();
        btnToSubject = new javax.swing.JButton();
        txfToUser = new javax.swing.JTextField();
        btnSendTask = new javax.swing.JButton();
        btnSaveTask = new javax.swing.JButton();
        lblTimeNeeded = new javax.swing.JLabel();
        spZeitaufwand = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neue Aufgaben verfassen");
        setMaximumSize(new java.awt.Dimension(858, 480));
        setMinimumSize(new java.awt.Dimension(858, 480));
        setPreferredSize(new java.awt.Dimension(858, 480));

        PanelNewTaskBackground.setBackground(new java.awt.Color(40, 40, 40));
        PanelNewTaskBackground.setMaximumSize(new java.awt.Dimension(858, 480));
        PanelNewTaskBackground.setMinimumSize(new java.awt.Dimension(858, 480));

        btnCloseWindow.setBackground(new java.awt.Color(18, 110, 99));
        btnCloseWindow.setForeground(new java.awt.Color(145, 237, 228));
        btnCloseWindow.setText("Abbrechen");
        btnCloseWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseWindowActionPerformed(evt);
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

        btnToSubject.setBackground(new java.awt.Color(18, 110, 99));
        btnToSubject.setForeground(new java.awt.Color(145, 237, 228));
        btnToSubject.setText("An:");
        btnToSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToSubjectActionPerformed(evt);
            }
        });

        txfToUser.setBackground(new java.awt.Color(18, 110, 99));
        txfToUser.setForeground(new java.awt.Color(145, 237, 228));

        btnSendTask.setBackground(new java.awt.Color(18, 110, 99));
        btnSendTask.setForeground(new java.awt.Color(145, 237, 228));
        btnSendTask.setText("Task abschicken");

        btnSaveTask.setBackground(new java.awt.Color(18, 110, 99));
        btnSaveTask.setForeground(new java.awt.Color(145, 237, 228));
        btnSaveTask.setText("Task speichern");
        btnSaveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTaskActionPerformed(evt);
            }
        });

        lblTimeNeeded.setBackground(new java.awt.Color(18, 110, 99));
        lblTimeNeeded.setForeground(new java.awt.Color(145, 237, 228));
        lblTimeNeeded.setText("Zeitaufwand in min.: ");

        javax.swing.GroupLayout PanelNewTaskBackgroundLayout = new javax.swing.GroupLayout(PanelNewTaskBackground);
        PanelNewTaskBackground.setLayout(PanelNewTaskBackgroundLayout);
        PanelNewTaskBackgroundLayout.setHorizontalGroup(
            PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSendTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseWindow)
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
                        .addComponent(btnToSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfSubject)
                            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                                .addComponent(txfToUser, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                                .addGap(31, 31, 31)
                                .addComponent(lblTimeNeeded)
                                .addGap(18, 18, 18)
                                .addComponent(spZeitaufwand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(scTXATaskDescription, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PanelNewTaskBackgroundLayout.setVerticalGroup(
            PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNewTaskBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendTask)
                    .addComponent(btnCloseWindow)
                    .addComponent(btnSaveTask))
                .addGap(18, 18, 18)
                .addGroup(PanelNewTaskBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToSubject)
                    .addComponent(txfToUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spZeitaufwand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimeNeeded))
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

    private void btnToSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToSubjectActionPerformed
        // Öffne "GUIToUser", Trage in Liste lstAllUseres alle User ein die die Person berechtigt ist Aufgaben zu zu teilen.
    }//GEN-LAST:event_btnToSubjectActionPerformed

    private void btnCloseWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseWindowActionPerformed
        //GUINewTask1.setVisible(false); oder noch besser etwas das das Fenster wirklich schließt.
    }//GEN-LAST:event_btnCloseWindowActionPerformed

    private void btnSaveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTaskActionPerformed
        //"txaTaskDescription","txfSubject","txfToUser" und "spZeitaufwand" auslesen und in Datenbank für User Hinterlegen
    }//GEN-LAST:event_btnSaveTaskActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINewTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINewTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelNewTaskBackground;
    private javax.swing.JButton btnCloseWindow;
    private javax.swing.JButton btnSaveTask;
    private javax.swing.JButton btnSendTask;
    private javax.swing.JButton btnToSubject;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTimeNeeded;
    private javax.swing.JScrollPane scTXATaskDescription;
    private javax.swing.JSpinner spZeitaufwand;
    private javax.swing.JTextArea txaTaskDescription;
    private javax.swing.JTextField txfSubject;
    private javax.swing.JTextField txfToUser;
    // End of variables declaration//GEN-END:variables
}
