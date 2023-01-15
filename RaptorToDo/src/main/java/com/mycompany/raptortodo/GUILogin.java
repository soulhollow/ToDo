package com.mycompany.raptortodo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class GUILogin extends javax.swing.JFrame {

    ControlGUI ControlGUI1;
    public int height;
    public int width;

    //Konstruktor
    public GUILogin( ControlGUI aControlGUI ) {
        ControlGUI1 = aControlGUI;
        this.setUndecorated(true);
        initComponents();

        this.setLocationRelativeTo(null);

        JButton[] btns = {btnLogin, btnMinimize};
        for (JButton btn : btns) {
            btn.setBackground(new Color(34, 40, 44));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked( MouseEvent e ) {
                }

                @Override
                public void mousePressed( MouseEvent e ) {
                }

                @Override
                public void mouseReleased( MouseEvent e ) {
                }

                @Override
                public void mouseEntered( MouseEvent e ) {
                    btn.setBackground(new Color(13, 203, 159));
                }

                @Override
                public void mouseExited( MouseEvent e ) {
                    btn.setBackground(new Color(34, 40, 44));
                }
            });
        }
        JButton[] MainButtons = {btnCloseProgramm};
        for (JButton btn : MainButtons) {
            btn.setBackground(new Color(21, 25, 28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked( MouseEvent e ) {
                }

                @Override
                public void mousePressed( MouseEvent e ) {
                }

                @Override
                public void mouseReleased( MouseEvent e ) {
                }

                @Override
                public void mouseEntered( MouseEvent e ) {
                    btn.setBackground(new Color(13, 203, 159));
                }

                @Override
                public void mouseExited( MouseEvent e ) {
                    btn.setBackground(new Color(21, 25, 28));
                }

            });

        }
    }

    public String getUser() {
        String sUser = txfUsername.getText();
        return sUser;
    }

    public void resetUser() {
        txfUsername.setText("");
    }

    public void setUser( String username ) {
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

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jpSpacer1 = new javax.swing.JPanel();
        btnCloseProgramm = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        txfHeadline = new javax.swing.JTextField();
        txfUnderline = new javax.swing.JTextField();
        btnMinimize = new javax.swing.JButton();
        pnlBottom = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txfUsername = new javax.swing.JTextField();
        txfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setName("name"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 825));
        setResizable(false);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(21, 25, 28));
        pnlSide.setPreferredSize(new java.awt.Dimension(80, 0));

        jpSpacer1.setBackground(new java.awt.Color(21, 25, 28));
        jpSpacer1.setFocusable(false);
        jpSpacer1.setPreferredSize(new java.awt.Dimension(100, 700));

        javax.swing.GroupLayout jpSpacer1Layout = new javax.swing.GroupLayout(jpSpacer1);
        jpSpacer1.setLayout(jpSpacer1Layout);
        jpSpacer1Layout.setHorizontalGroup(
            jpSpacer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpSpacer1Layout.setVerticalGroup(
            jpSpacer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pnlSide.add(jpSpacer1);

        btnCloseProgramm.setBackground(new java.awt.Color(21, 25, 28));
        btnCloseProgramm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/power_settings_new_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnCloseProgramm.setToolTipText("Damit beenden die das Programm");
        btnCloseProgramm.setBorder(null);
        btnCloseProgramm.setBorderPainted(false);
        btnCloseProgramm.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCloseProgramm.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCloseProgramm.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCloseProgramm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseProgrammActionPerformed(evt);
            }
        });
        pnlSide.add(btnCloseProgramm);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(34, 40, 44));
        pnlTop.setMaximumSize(new java.awt.Dimension(1200, 2147483647));
        pnlTop.setMinimumSize(new java.awt.Dimension(1200, 94));
        pnlTop.setPreferredSize(new java.awt.Dimension(0, 100));
        pnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfHeadline.setEditable(false);
        txfHeadline.setBackground(new java.awt.Color(34, 40, 44));
        txfHeadline.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        txfHeadline.setForeground(new java.awt.Color(13, 203, 159));
        txfHeadline.setText("Willkommen, melden sie sich an");
        txfHeadline.setBorder(null);
        pnlTop.add(txfHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 980, 80));

        txfUnderline.setBackground(new java.awt.Color(34, 40, 44));
        txfUnderline.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfUnderline.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        txfUnderline.setBorder(null);
        pnlTop.add(txfUnderline, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 1083, 30));

        btnMinimize.setBackground(new java.awt.Color(34, 40, 44));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/close_fullscreen_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnMinimize.setToolTipText("Hiermit minimieren sie das Programm");
        btnMinimize.setBorderPainted(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        pnlTop.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 60, 60));

        pnlCenter.add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlBottom.setBackground(new java.awt.Color(34, 40, 44));
        pnlBottom.setName(""); // NOI18N
        pnlBottom.setPreferredSize(new java.awt.Dimension(1200, 800));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/raptor.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(13, 203, 159));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        txfUsername.setBackground(new java.awt.Color(30, 74, 78));
        txfUsername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfUsername.setForeground(new java.awt.Color(13, 203, 159));
        txfUsername.setToolTipText("Hier sollte ihr Benutzername stehen");
        txfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfUsernameKeyReleased(evt);
            }
        });

        txfPassword.setBackground(new java.awt.Color(30, 74, 78));
        txfPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfPassword.setForeground(new java.awt.Color(13, 203, 159));
        txfPassword.setToolTipText("Hier müssen sie ihr Passwort eintragen");
        txfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPasswordKeyReleased(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(34, 40, 44));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/login_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnLogin.setToolTipText("Dieser Button meldet sie an sobald ihren Eingaben richtig sind");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(13, 203, 159));
        lblUsername.setText("Benutzername :");

        lblPassword.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(13, 203, 159));
        lblPassword.setText("Passwort :");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblLogo)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlBottomLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnLogin)))
                .addContainerGap(771, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(153, 153, 153))
        );

        pnlCenter.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseProgrammActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseProgrammActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseProgrammActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ControlGUI1.loginLoginBtn();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsernameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ControlGUI1.loginLoginBtn();
        }
    }//GEN-LAST:event_txfUsernameKeyReleased

    private void txfPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPasswordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ControlGUI1.loginLoginBtn();
        }
    }//GEN-LAST:event_txfPasswordKeyReleased

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseProgramm;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpSpacer1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txfHeadline;
    private javax.swing.JPasswordField txfPassword;
    private javax.swing.JTextField txfUnderline;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
