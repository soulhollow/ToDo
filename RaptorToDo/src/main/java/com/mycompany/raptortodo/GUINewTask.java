package com.mycompany.raptortodo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class GUINewTask extends javax.swing.JFrame {

    ControlGUI ControlGUI1;

    //Konstruktor
    public GUINewTask( ControlGUI aControlGUI ) {
        ControlGUI1 = aControlGUI;
        this.setUndecorated(true);

        initComponents();
        this.setLocationRelativeTo(null);
        JButton[] btns = {btnAn, btnMinimize};
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
        JButton[] MainButtons = {btnGoBack, btnSaveDraft, btnRestoreDraft, btnSendTask, btnLogout, btnCloseProgramm};
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

    public String[] getUser() {
        String sUsernames = txfUser.getText();
        String[] parts = sUsernames.split(" ");
        return parts;
    }

    //setzt die User aus dem An Feld
    public void setUsers( String[] sUsers ) {
        String all = "";
        if (sUsers[0] != null) {
            for (String sUser : sUsers) {
                all = all + sUser;
                all = all + " ";
            }
            txfUser.setText(all);
        }else {

            this.resetUsers();
        }

    }

    //bekommt den Betreff als String
    public String getSubject() {
        String sSubject = txfSubject.getText();
        return sSubject;
    }

    public void setSubject( String subject ) {
        txfSubject.setText(subject);
    }

    public void setDescription( String description ) {
        txaTaskDescription.setText(description);
    }

    //bekommt die Task Beschreibung als String
    public String getDescription() {
        String sDescription = txaTaskDescription.getText();
        return sDescription;
    }

    //bekommt den Zeitaufwand in Minuten als String und Wandelt in Integer um für kleineres Datenvolumen
    public int getZeitaufwand() {
        int iZeitaufwand = 0;
        if ( ! ( "".equals(txfEstimatedTime.getText()) )) {
            iZeitaufwand = Integer.parseInt(txfEstimatedTime.getText());
        }

        return iZeitaufwand;
    }

    public void setZeitaufwand( int zeit ) {
        if ( ! ( zeit == 0 )) {
            txfEstimatedTime.setText("" + zeit);
        }else {
            txfEstimatedTime.setText("");
        }

    }

    //Um die ganzen Textfelder halt leer zu machen lol
    public void resetUsers() {
        txfUser.setText("");
    }

    public void resetSubject() {
        txfSubject.setText("");
    }

    public void resetDescription() {
        txaTaskDescription.setText("");
    }

    public void resetZeitaufwand() {
        txfEstimatedTime.setText("");
    }

    public void resetAll() {
        txfUser.setText("");
        txfSubject.setText("");
        txaTaskDescription.setText("");
        txfEstimatedTime.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        btnSaveDraft = new javax.swing.JButton();
        btnRestoreDraft = new javax.swing.JButton();
        btnSendTask = new javax.swing.JButton();
        jpSpacer1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jpSpacer2 = new javax.swing.JPanel();
        btnCloseProgramm = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnMinimize = new javax.swing.JButton();
        pnlBottom = new javax.swing.JPanel();
        lblSubject = new javax.swing.JLabel();
        lblEstimatedTime = new javax.swing.JLabel();
        btnAn = new javax.swing.JButton();
        txfUser = new javax.swing.JTextField();
        txfSubject = new javax.swing.JTextField();
        txfEstimatedTime = new javax.swing.JTextField();
        lblAn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaTaskDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setName("name"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 825));
        setResizable(false);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(21, 25, 28));
        pnlSide.setPreferredSize(new java.awt.Dimension(80, 0));

        jPanel1.setBackground(new java.awt.Color(23, 25, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/raptorx50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pnlSide.add(jPanel1);

        btnGoBack.setBackground(new java.awt.Color(21, 25, 28));
        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/arrow_back_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnGoBack.setToolTipText("Hiermit kommen sie wieder auf die vorherige Oberfläche");
        btnGoBack.setBorder(null);
        btnGoBack.setBorderPainted(false);
        btnGoBack.setMaximumSize(new java.awt.Dimension(50, 50));
        btnGoBack.setMinimumSize(new java.awt.Dimension(50, 50));
        btnGoBack.setPreferredSize(new java.awt.Dimension(50, 50));
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        pnlSide.add(btnGoBack);

        btnSaveDraft.setBackground(new java.awt.Color(21, 25, 28));
        btnSaveDraft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/note_add_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnSaveDraft.setToolTipText("Hiermit speichern sie ihre Eingaben als Entwurf");
        btnSaveDraft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnSaveDraft.setBorderPainted(false);
        btnSaveDraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDraftActionPerformed(evt);
            }
        });
        pnlSide.add(btnSaveDraft);

        btnRestoreDraft.setBackground(new java.awt.Color(21, 25, 28));
        btnRestoreDraft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/restore_page_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnRestoreDraft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnRestoreDraft.setBorderPainted(false);
        btnRestoreDraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreDraftActionPerformed(evt);
            }
        });
        pnlSide.add(btnRestoreDraft);

        btnSendTask.setBackground(new java.awt.Color(21, 25, 28));
        btnSendTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/send_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnSendTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnSendTask.setBorderPainted(false);
        btnSendTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendTaskActionPerformed(evt);
            }
        });
        pnlSide.add(btnSendTask);

        jpSpacer1.setBackground(new java.awt.Color(21, 25, 28));
        jpSpacer1.setFocusable(false);
        jpSpacer1.setPreferredSize(new java.awt.Dimension(100, 165));

        javax.swing.GroupLayout jpSpacer1Layout = new javax.swing.GroupLayout(jpSpacer1);
        jpSpacer1.setLayout(jpSpacer1Layout);
        jpSpacer1Layout.setHorizontalGroup(
            jpSpacer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpSpacer1Layout.setVerticalGroup(
            jpSpacer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        pnlSide.add(jpSpacer1);

        btnLogout.setBackground(new java.awt.Color(21, 25, 28));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/logout_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnLogout.setToolTipText("Hier loggen sich sich aus");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlSide.add(btnLogout);

        jpSpacer2.setBackground(new java.awt.Color(23, 25, 28));
        jpSpacer2.setFocusable(false);
        jpSpacer2.setPreferredSize(new java.awt.Dimension(100, 60));

        javax.swing.GroupLayout jpSpacer2Layout = new javax.swing.GroupLayout(jpSpacer2);
        jpSpacer2.setLayout(jpSpacer2Layout);
        jpSpacer2Layout.setHorizontalGroup(
            jpSpacer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpSpacer2Layout.setVerticalGroup(
            jpSpacer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlSide.add(jpSpacer2);

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

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(34, 40, 44));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(13, 203, 159));
        jTextField1.setText("Erstellung einer Aufgabe");
        jTextField1.setBorder(null);
        pnlTop.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1000, 80));

        jTextField2.setBackground(new java.awt.Color(34, 40, 44));
        jTextField2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextField2.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        jTextField2.setBorder(null);
        pnlTop.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 1083, 30));

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

        lblSubject.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(13, 203, 159));
        lblSubject.setText("Betreff :");

        lblEstimatedTime.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblEstimatedTime.setForeground(new java.awt.Color(13, 203, 159));
        lblEstimatedTime.setText("Zeitaufwand in min:");

        btnAn.setBackground(new java.awt.Color(34, 40, 44));
        btnAn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAn.setForeground(new java.awt.Color(13, 203, 159));
        btnAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/account_circle_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnAn.setToolTipText("Hiermit öffnen sie eine Oberfläche die ihnen Mitarbeiter anzeigt");
        btnAn.setBorderPainted(false);
        btnAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnActionPerformed(evt);
            }
        });

        txfUser.setBackground(new java.awt.Color(30, 74, 78));
        txfUser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfUser.setForeground(new java.awt.Color(13, 203, 159));
        txfUser.setToolTipText("Hier müssen sie eintragen wen sie die Aufgabe zuteilen möchten");

        txfSubject.setBackground(new java.awt.Color(30, 74, 78));
        txfSubject.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfSubject.setForeground(new java.awt.Color(13, 203, 159));
        txfSubject.setToolTipText("Hier tragen sie den Betreff der Aufgabe ein");

        txfEstimatedTime.setBackground(new java.awt.Color(30, 74, 78));
        txfEstimatedTime.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfEstimatedTime.setForeground(new java.awt.Color(13, 203, 159));
        txfEstimatedTime.setToolTipText("Hier tragen sie ein wie lange die Aufgabe Dauern soll");

        lblAn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblAn.setForeground(new java.awt.Color(13, 203, 159));
        lblAn.setText("An :");

        txaTaskDescription.setBackground(new java.awt.Color(30, 74, 78));
        txaTaskDescription.setColumns(20);
        txaTaskDescription.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txaTaskDescription.setForeground(new java.awt.Color(13, 203, 159));
        txaTaskDescription.setRows(5);
        txaTaskDescription.setToolTipText("Hier tragen sie die volle Beschreibung ihrer Aufgabe rein");
        jScrollPane1.setViewportView(txaTaskDescription);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBottomLayout.createSequentialGroup()
                        .addComponent(btnAn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBottomLayout.createSequentialGroup()
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstimatedTime)
                        .addGap(18, 18, 18)
                        .addComponent(txfEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(1059, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAn))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAn))))
                .addGap(18, 18, 18)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pnlCenter.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        //GUINewTask1.setVisible(false); oder noch besser etwas das das Fenster wirklich schließt.
        ControlGUI1.setGUINewTaskInvisible();

        //leert alle Textfelder in NewTask1
        ControlGUI1.resetNewTask();

        ControlGUI1.setTaskViewVisible();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnSaveDraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDraftActionPerformed

        ControlGUI1.saveNewTask();
    }//GEN-LAST:event_btnSaveDraftActionPerformed

    private void btnRestoreDraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreDraftActionPerformed

        ControlGUI1.loadDraft();
    }//GEN-LAST:event_btnRestoreDraftActionPerformed

    private void btnSendTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendTaskActionPerformed
        try {
            ControlGUI1.taskAnlegen();
            resetUsers();
            resetSubject();
            resetDescription();
            resetZeitaufwand();
        } catch (NumberFormatException ne) {
            javax.swing.JOptionPane.showMessageDialog(this, "Bitte füllen sie alle Felder aus um eine Task abzuschicken");
        }
    }//GEN-LAST:event_btnSendTaskActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //Logt den User aus
        ControlGUI1.logoutBtn();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCloseProgrammActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseProgrammActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseProgrammActionPerformed

    private void btnAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnActionPerformed
        ControlGUI1.setGUIToUserVisible();
        ControlGUI1.setGUINewTaskInvisible();
    }//GEN-LAST:event_btnAnActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAn;
    private javax.swing.JButton btnCloseProgramm;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnRestoreDraft;
    private javax.swing.JButton btnSaveDraft;
    private javax.swing.JButton btnSendTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jpSpacer1;
    private javax.swing.JPanel jpSpacer2;
    private javax.swing.JLabel lblAn;
    private javax.swing.JLabel lblEstimatedTime;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextArea txaTaskDescription;
    private javax.swing.JTextField txfEstimatedTime;
    private javax.swing.JTextField txfSubject;
    private javax.swing.JTextField txfUser;
    // End of variables declaration//GEN-END:variables
}
