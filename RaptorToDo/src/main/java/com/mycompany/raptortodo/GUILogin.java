package com.mycompany.raptortodo;

import java.awt.event.KeyEvent;

public class GUILogin extends javax.swing.JFrame {

    //
    ControlGUI ControlGUI1;

    //Konstruktor
    public GUILogin(ControlGUI aControlGUI) {
        ControlGUI1 = aControlGUI;
        initComponents();

    }

    //Hier könnte eine Exception entstehen wenn der User Leer ist
    public String getUser() {
        String sUser = txfUsername.getText();
        return sUser;
    }

    public void resetUser() {
        txfUsername.setText("");
    }

    public void setUser(String username) {
        txfUsername.setText(username);
    }

    public String getPassword() {
        String Password = String.valueOf(txfPassword.getPassword());
        return Password;
    }

    public void resetPassword() {
        txfPassword.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PannelLoginBackground = new javax.swing.JPanel();
        btnEXIT = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txfUsername = new javax.swing.JTextField();
        txfPassword = new javax.swing.JPasswordField();
        lblProgrammName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Login");

        PannelLoginBackground.setBackground(new java.awt.Color(40, 40, 40));

        btnEXIT.setBackground(new java.awt.Color(18, 110, 99));
        btnEXIT.setForeground(new java.awt.Color(145, 237, 228));
        btnEXIT.setText("EXIT");
        btnEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXITActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(18, 110, 99));
        btnLogin.setForeground(new java.awt.Color(145, 237, 228));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txfUsername.setBackground(new java.awt.Color(18, 110, 99));
        txfUsername.setForeground(new java.awt.Color(145, 237, 228));
        txfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsername.setMaximumSize(new java.awt.Dimension(250, 22));
        txfUsername.setMinimumSize(new java.awt.Dimension(250, 22));
        txfUsername.setPreferredSize(new java.awt.Dimension(250, 22));
        txfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfUsernameKeyReleased(evt);
            }
        });

        txfPassword.setBackground(new java.awt.Color(18, 110, 99));
        txfPassword.setForeground(new java.awt.Color(145, 237, 228));
        txfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPassword.setMaximumSize(new java.awt.Dimension(250, 22));
        txfPassword.setMinimumSize(new java.awt.Dimension(250, 22));
        txfPassword.setPreferredSize(new java.awt.Dimension(250, 22));
        txfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPasswordKeyReleased(evt);
            }
        });

        lblProgrammName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblProgrammName.setForeground(new java.awt.Color(145, 237, 228));
        lblProgrammName.setText("Raptor-ToDo");

        lblUsername.setBackground(new java.awt.Color(18, 110, 99));
        lblUsername.setForeground(new java.awt.Color(145, 237, 228));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:  ");
        lblUsername.setBorder(txfPassword.getBorder());
        lblUsername.setMaximumSize(new java.awt.Dimension(85, 22));
        lblUsername.setMinimumSize(new java.awt.Dimension(85, 22));
        lblUsername.setOpaque(true);
        lblUsername.setPreferredSize(new java.awt.Dimension(85, 22));

        lblPassword.setBackground(new java.awt.Color(18, 110, 99));
        lblPassword.setForeground(new java.awt.Color(145, 237, 228));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:  ");
        lblPassword.setBorder(txfPassword.getBorder());
        lblPassword.setMaximumSize(new java.awt.Dimension(85, 22));
        lblPassword.setMinimumSize(new java.awt.Dimension(85, 22));
        lblPassword.setOpaque(true);
        lblPassword.setPreferredSize(new java.awt.Dimension(85, 22));

        javax.swing.GroupLayout PannelLoginBackgroundLayout = new javax.swing.GroupLayout(PannelLoginBackground);
        PannelLoginBackground.setLayout(PannelLoginBackgroundLayout);
        PannelLoginBackgroundLayout.setHorizontalGroup(
            PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelLoginBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelLoginBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogin)
                        .addGap(128, 128, 128)
                        .addComponent(btnEXIT))
                    .addGroup(PannelLoginBackgroundLayout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                    .addGroup(PannelLoginBackgroundLayout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PannelLoginBackgroundLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblProgrammName))
                            .addGroup(PannelLoginBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(12, 12, 12))
        );
        PannelLoginBackgroundLayout.setVerticalGroup(
            PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelLoginBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblProgrammName)
                .addGap(18, 18, 18)
                .addGroup(PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PannelLoginBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnEXIT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PannelLoginBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PannelLoginBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXITActionPerformed
        ControlGUI1.exitProgramm();
    }//GEN-LAST:event_btnEXITActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        ControlGUI1.loginLoginBtn();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPasswordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ControlGUI1.loginLoginBtn();
        }
    }//GEN-LAST:event_txfPasswordKeyReleased

    private void txfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsernameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ControlGUI1.loginLoginBtn();
        }
    }//GEN-LAST:event_txfUsernameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelLoginBackground;
    private javax.swing.JButton btnEXIT;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProgrammName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
