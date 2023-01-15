package com.mycompany.raptortodo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class GUIToUser extends javax.swing.JFrame {

    ControlGUI ControlGUI1;
    private String[] selectedUsersSpaghetti;
    private String[] selectedUserIds;

    public GUIToUser( ControlGUI aControlGUI ) {
        ControlGUI1 = aControlGUI;
        this.setUndecorated(true);

        initComponents();
        this.setLocationRelativeTo(null);

        JButton[] MainButtons = {btnLogout, btnClose, btnGoBack};
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
        JButton[] btns = {btnAddWorker, btnRemoveWorker, btnWorkerSend, btnMinimize};
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
    }

    public void setlstAllUsers( String[] sAllUsers ) {
        ListAllUsers.setListData(sAllUsers);
    }

    //get alle ausgewählten User
    public String[] getlstAllUseresSelected() {
        java.util.List<String> selectedValuesList = ListAllUsers.getSelectedValuesList();
        String[] sSelectedUsers = selectedValuesList.toArray(String[] :: new);
        return sSelectedUsers;
    }

    //in lstSelectedUsers alle neuen User eintragen
    public void setlstSelectedUseres( String[] sSelectedUsers ) {
        ListSelectedUseres.setListData(sSelectedUsers);
        selectedUsersSpaghetti = sSelectedUsers;
        selectedUserIds = new String[sSelectedUsers.length];
        for (int i = 0; i < sSelectedUsers.length; i ++) {
            if (sSelectedUsers[i] == null || sSelectedUsers[i].isBlank()) {
                continue;
            }
            String userId = sSelectedUsers[i].split(java.util.regex.Pattern.quote("("))[1];
            selectedUserIds[i] = userId.substring(0, userId.length() - 1);
        }
    }

    public String getSelectedUsersSelected() {
        return ListSelectedUseres.getSelectedValue();
    }

    public String[] getSelectedUsersAll() {
        return selectedUsersSpaghetti;
    }

    public String[] getAllSelectedUserIds() {
        return selectedUserIds;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        txfHeadline = new javax.swing.JTextField();
        txfLine = new javax.swing.JTextField();
        btnMinimize = new javax.swing.JButton();
        pnlBottom = new javax.swing.JPanel();
        scpLSTAllUseres = new javax.swing.JScrollPane();
        ListAllUsers = new javax.swing.JList<>();
        scpLSTSelcetedUseres = new javax.swing.JScrollPane();
        ListSelectedUseres = new javax.swing.JList<>();
        btnAddWorker = new javax.swing.JButton();
        btnRemoveWorker = new javax.swing.JButton();
        btnWorkerSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 825));
        setName("name"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 825));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 825));

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

        jPanel2.setBackground(new java.awt.Color(21, 25, 28));
        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 315));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        pnlSide.add(jPanel2);

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

        jPanel3.setBackground(new java.awt.Color(23, 25, 28));
        jPanel3.setFocusable(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlSide.add(jPanel3);

        btnClose.setBackground(new java.awt.Color(21, 25, 28));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/power_settings_new_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnClose.setToolTipText("Damit beenden die das Programm");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlSide.add(btnClose);

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
        txfHeadline.setText("Auswahl der Mitarbeiter für die Aufgabe");
        txfHeadline.setBorder(null);
        txfHeadline.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txfHeadline.setSelectionColor(new java.awt.Color(75, 109, 175));
        pnlTop.add(txfHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 920, 60));

        txfLine.setBackground(new java.awt.Color(34, 40, 44));
        txfLine.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfLine.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        txfLine.setBorder(null);
        pnlTop.add(txfLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 1083, 30));

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

        ListAllUsers.setBackground(new java.awt.Color(30, 74, 78));
        ListAllUsers.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ListAllUsers.setForeground(new java.awt.Color(145, 237, 228));
        ListAllUsers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListAllUsers.setToolTipText("Liste aller Mitarbeiter");
        scpLSTAllUseres.setViewportView(ListAllUsers);

        ListSelectedUseres.setBackground(new java.awt.Color(30, 74, 78));
        ListSelectedUseres.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ListSelectedUseres.setForeground(new java.awt.Color(145, 237, 228));
        ListSelectedUseres.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListSelectedUseres.setToolTipText("Liste an Abeitern an denen sie die Aufgabe verteilen ");
        scpLSTSelcetedUseres.setViewportView(ListSelectedUseres);

        btnAddWorker.setBackground(new java.awt.Color(34, 40, 44));
        btnAddWorker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/group_add_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnAddWorker.setToolTipText("Hiermit fügen sie alle im links ausgewählten Feld nach rechts (Mitarbeiter die der Aufgabe zugeteilt werden)");
        btnAddWorker.setBorderPainted(false);
        btnAddWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWorkerActionPerformed(evt);
            }
        });

        btnRemoveWorker.setBackground(new java.awt.Color(34, 40, 44));
        btnRemoveWorker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/person_remove_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnRemoveWorker.setToolTipText("Hiermit löschen sie Mitarbeiter aus der rechten Tabelle die sie ausgewählt haben");
        btnRemoveWorker.setBorderPainted(false);
        btnRemoveWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveWorkerActionPerformed(evt);
            }
        });

        btnWorkerSend.setBackground(new java.awt.Color(34, 40, 44));
        btnWorkerSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/how_to_reg_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnWorkerSend.setToolTipText("Hiermit teilen sie allen Mitarbeitern auf der rechten Seite zu ihrer Aufgabe hinzu");
        btnWorkerSend.setBorderPainted(false);
        btnWorkerSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkerSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(scpLSTAllUseres, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveWorker)
                    .addComponent(btnAddWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWorkerSend))
                .addGap(42, 42, 42)
                .addComponent(scpLSTSelcetedUseres, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAddWorker)
                        .addGap(126, 126, 126)
                        .addComponent(btnRemoveWorker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWorkerSend))
                    .addComponent(scpLSTAllUseres, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addComponent(scpLSTSelcetedUseres))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pnlCenter.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        ControlGUI1.logoutBtn();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWorkerActionPerformed
        ControlGUI1.btnAnFunktion();
    }//GEN-LAST:event_btnAddWorkerActionPerformed

    private void btnRemoveWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveWorkerActionPerformed
        ControlGUI1.deleteOneSelectedUser();
    }//GEN-LAST:event_btnRemoveWorkerActionPerformed

    private void btnWorkerSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkerSendActionPerformed
        //GUIToUser unsichtbar machen;  
        ControlGUI1.setGUIToUserInvisible();

        //GUIToUser Namen in "GUINewTask.txfToSubject" eintragen
        ControlGUI1.IstSelectedUseresIntotxfToUser();
        ControlGUI1.setGUINewTaskVisible();
    }//GEN-LAST:event_btnWorkerSendActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        //GUINewTask1.setVisible(false); oder noch besser etwas das das Fenster wirklich schließt.
        ControlGUI1.setGUIToUserInvisible();

        ControlGUI1.setGUINewTaskVisible();
    }//GEN-LAST:event_btnGoBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListAllUsers;
    private javax.swing.JList<String> ListSelectedUseres;
    private javax.swing.JButton btnAddWorker;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnRemoveWorker;
    private javax.swing.JButton btnWorkerSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JScrollPane scpLSTAllUseres;
    private javax.swing.JScrollPane scpLSTSelcetedUseres;
    private javax.swing.JTextField txfHeadline;
    private javax.swing.JTextField txfLine;
    // End of variables declaration//GEN-END:variables
}
