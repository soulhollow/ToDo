package com.mycompany.raptortodo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class GUIAccount extends javax.swing.JFrame {

    ControlGUI ControlGUI1;

    //Konstruktor
    public GUIAccount( ControlGUI aControlGUI ) {
        ControlGUI1 = aControlGUI;
        this.setUndecorated(true);

        initComponents();
        this.setLocationRelativeTo(null);
        JButton[] btns = {btnChangePassword, btnCreateWorker, btnMinimize};
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
        JButton[] MainButtons = {btnAccount, btnTaskView, btnLogout, btnCloseProgramm, btnClearAll};
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

    public String getFirstName() {
        return txfFirstName.getText();
    }

    public String getLastName() {
        return txfLastName.getText();
    }

    public int getGehalt() throws NumberFormatException {
        int value = -1;
        try {
            value = Integer.parseInt(txfSalary.getText());
        } catch (NumberFormatException ne) {
            throw new NumberFormatException();
        }
        if (value == -1) {
            throw new NumberFormatException();
        }
        return value;
    }

    public int getPosition() throws NullPointerException {
        if (ListPosition.getSelectedValue() == null) {
            throw new NullPointerException();
        }else {
            return Integer.parseInt(ListPosition.getSelectedValue());
        }
    }

    public String getEmail() {
        return txfMail.getText();
    }

    public void setFirstName( String vorname ) {
        txfFirstName.setText(vorname);
    }

    public void setLastName( String name ) {
        txfLastName.setText(name);
    }

    public void setGehalt( int gehalt ) {
        if (gehalt == -1) {
            txfSalary.setText("");
        }else {
            txfSalary.setText(Integer.toString(gehalt));
        }
    }

    public void setPosition( int position ) {
        if (position == -1) {
            ListPosition.clearSelection();
        }else {
            ListPosition.setSelectedIndex(position);
        }
    }

    public void setEmail( String Email ) {
        txfMail.setText(Email);
    }

// Change Password Methodes 
    public void setUsername( String username ) {
        txfUsername.setText(username);
    }

    //gibt Text zurück
    public String getUsername() {
        return txfUsername.getText();
    }

    public String getOldPassword() {
        return txfOldPassword.getText();
    }

    public String getNewPassword() {
        return txfNewPassword.getText();
    }

    public String getNewPasswordRepeat() {
        return txfRepeatPassword.getText();
    }

    public void GUIAccountPasswordClearAll() {
        txfOldPassword.setText("");
        txfNewPassword.setText("");
        txfRepeatPassword.setText("");
    }

    public void GUIAccountBenutzerClearALL() {

        txfFirstName.setText("");
        txfLastName.setText("");
        txfSalary.setText("");
        txfMail.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAccount = new javax.swing.JButton();
        btnTaskView = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        jpSpacer1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jpSpacer2 = new javax.swing.JPanel();
        btnCloseProgramm = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        txfHeadline = new javax.swing.JTextField();
        txfUnderline = new javax.swing.JTextField();
        btnMinimize = new javax.swing.JButton();
        pnlBottom = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListPosition = new javax.swing.JList<>();
        txfFirstName = new javax.swing.JTextField();
        txfLastName = new javax.swing.JTextField();
        txfSalary = new javax.swing.JTextField();
        txfMail = new javax.swing.JTextField();
        txfUsername = new javax.swing.JTextField();
        lblChangePassword = new javax.swing.JLabel();
        lblCreateNewWorker = new javax.swing.JLabel();
        lblOldPassword = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblPasswordRepeat = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txfNewPassword = new javax.swing.JPasswordField();
        txfRepeatPassword = new javax.swing.JPasswordField();
        txfOldPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnCreateWorker = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 825));
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

        btnAccount.setBackground(new java.awt.Color(21, 25, 28));
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/manage_accounts_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnAccount.setToolTipText("Da sie schon in dieser Oberfläche sind passiert Nichts");
        btnAccount.setBorder(null);
        btnAccount.setBorderPainted(false);
        btnAccount.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAccount.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAccount.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        pnlSide.add(btnAccount);

        btnTaskView.setBackground(new java.awt.Color(21, 25, 28));
        btnTaskView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/format_list_bulleted_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnTaskView.setToolTipText("Hiermit öffnen sie ihre Aufgaben Übersicht");
        btnTaskView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnTaskView.setBorderPainted(false);
        btnTaskView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskViewActionPerformed(evt);
            }
        });
        pnlSide.add(btnTaskView);

        btnClearAll.setBackground(new java.awt.Color(21, 25, 28));
        btnClearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/clear_all_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnClearAll.setToolTipText("Hiermit werden alle Texteeingaben gelöscht");
        btnClearAll.setBorder(null);
        btnClearAll.setBorderPainted(false);
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        pnlSide.add(btnClearAll);

        jpSpacer1.setBackground(new java.awt.Color(21, 25, 28));
        jpSpacer1.setFocusable(false);
        jpSpacer1.setPreferredSize(new java.awt.Dimension(100, 225));

        javax.swing.GroupLayout jpSpacer1Layout = new javax.swing.GroupLayout(jpSpacer1);
        jpSpacer1.setLayout(jpSpacer1Layout);
        jpSpacer1Layout.setHorizontalGroup(
            jpSpacer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpSpacer1Layout.setVerticalGroup(
            jpSpacer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
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
        jpSpacer2.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout jpSpacer2Layout = new javax.swing.GroupLayout(jpSpacer2);
        jpSpacer2.setLayout(jpSpacer2Layout);
        jpSpacer2Layout.setHorizontalGroup(
            jpSpacer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpSpacer2Layout.setVerticalGroup(
            jpSpacer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
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

        txfHeadline.setEditable(false);
        txfHeadline.setBackground(new java.awt.Color(34, 40, 44));
        txfHeadline.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        txfHeadline.setForeground(new java.awt.Color(13, 203, 159));
        txfHeadline.setText("Account Verwaltung");
        txfHeadline.setBorder(null);
        pnlTop.add(txfHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1000, 80));

        txfUnderline.setBackground(new java.awt.Color(34, 40, 44));
        txfUnderline.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfUnderline.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        txfUnderline.setBorder(null);
        pnlTop.add(txfUnderline, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 1083, 30));

        btnMinimize.setBackground(new java.awt.Color(34, 40, 44));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/close_fullscreen_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
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

        ListPosition.setBackground(new java.awt.Color(30, 74, 78));
        ListPosition.setForeground(new java.awt.Color(145, 237, 228));
        ListPosition.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "3", "4", "5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListPosition.setToolTipText("Hier bestimmen sie die Postition des Mitarbeiters (sie können nur Positionen unter ihrer eigenen wählen)");
        jScrollPane2.setViewportView(ListPosition);

        txfFirstName.setBackground(new java.awt.Color(30, 74, 78));
        txfFirstName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfFirstName.setForeground(new java.awt.Color(13, 203, 159));
        txfFirstName.setToolTipText("Hier müssen sie den Vornamen des Mitarbeiter eintragen");

        txfLastName.setBackground(new java.awt.Color(30, 74, 78));
        txfLastName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfLastName.setForeground(new java.awt.Color(13, 203, 159));
        txfLastName.setToolTipText("Hier müssen sie den Nachnamen des Mitarbeiters eintragen");

        txfSalary.setBackground(new java.awt.Color(30, 74, 78));
        txfSalary.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfSalary.setForeground(new java.awt.Color(13, 203, 159));
        txfSalary.setToolTipText("Hier müssen sie das Gehalt des Mitarbeiter eintragen (nur prositive Zahlen sind erlaubt)");

        txfMail.setBackground(new java.awt.Color(30, 74, 78));
        txfMail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfMail.setForeground(new java.awt.Color(13, 203, 159));
        txfMail.setToolTipText("Hier müssen sie die E-Mail Adresse des Mitarbeiter eintragen");
        txfMail.setName(""); // NOI18N

        txfUsername.setEditable(false);
        txfUsername.setBackground(new java.awt.Color(30, 74, 78));
        txfUsername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfUsername.setForeground(new java.awt.Color(13, 203, 159));
        txfUsername.setToolTipText("Hier sollte ihr Benutzername stehen");

        lblChangePassword.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblChangePassword.setForeground(new java.awt.Color(13, 203, 159));
        lblChangePassword.setText("Änder dein Passwort");

        lblCreateNewWorker.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCreateNewWorker.setForeground(new java.awt.Color(13, 203, 159));
        lblCreateNewWorker.setText("Erstelle eine neuen Mitarbeiter");
        lblCreateNewWorker.setToolTipText("");

        lblOldPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblOldPassword.setForeground(new java.awt.Color(13, 203, 159));
        lblOldPassword.setText("Altes Passwort :");

        lblLastName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(13, 203, 159));
        lblLastName.setText("Name :");

        lblMail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblMail.setForeground(new java.awt.Color(13, 203, 159));
        lblMail.setText("E-Mail :");

        lblSalary.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(13, 203, 159));
        lblSalary.setText("Gehalt :");

        lblPosition.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(13, 203, 159));
        lblPosition.setText("Position :");

        lblFirstName1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblFirstName1.setForeground(new java.awt.Color(13, 203, 159));
        lblFirstName1.setText("Vorname :");

        lblNewPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(13, 203, 159));
        lblNewPassword.setText("Neues Passwort :");

        lblPasswordRepeat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblPasswordRepeat.setForeground(new java.awt.Color(13, 203, 159));
        lblPasswordRepeat.setText("Passwort wiederholen :");

        lblUsername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(13, 203, 159));
        lblUsername.setText("Benutzername :");

        txfNewPassword.setBackground(new java.awt.Color(30, 74, 78));
        txfNewPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfNewPassword.setForeground(new java.awt.Color(13, 203, 159));
        txfNewPassword.setToolTipText("Hier müssen sie ihr neues Passwort eingeben");

        txfRepeatPassword.setBackground(new java.awt.Color(30, 74, 78));
        txfRepeatPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfRepeatPassword.setForeground(new java.awt.Color(13, 203, 159));
        txfRepeatPassword.setToolTipText("Hier müssen sie ihr neues Passwort wiederholen");

        txfOldPassword.setBackground(new java.awt.Color(30, 74, 78));
        txfOldPassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfOldPassword.setForeground(new java.awt.Color(13, 203, 159));
        txfOldPassword.setToolTipText("Hier müssen sie ihr altes Passwort eingeben");

        jPanel2.setBackground(new java.awt.Color(13, 203, 159));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnCreateWorker.setBackground(new java.awt.Color(34, 40, 44));
        btnCreateWorker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/person_add_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnCreateWorker.setToolTipText("Hiermit erstellen sie einen neuen Mitarbeiter");
        btnCreateWorker.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnCreateWorker.setBorderPainted(false);
        btnCreateWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateWorkerActionPerformed(evt);
            }
        });

        btnChangePassword.setBackground(new java.awt.Color(34, 40, 44));
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/password_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnChangePassword.setToolTipText("Hiermit ändern sie ihr Passwort solange ihre Eingaben Korrekt sind");
        btnChangePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnChangePassword.setBorderPainted(false);
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCreateNewWorker, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(lblSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfMail)
                    .addComponent(txfSalary)
                    .addComponent(txfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(txfLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateWorker))
                    .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(lblMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFirstName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 43, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                            .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                .addComponent(txfUsername))
                            .addComponent(lblPasswordRepeat, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE))
                        .addGap(972, 972, 972))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfRepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangePassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCreateNewWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBottomLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txfOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBottomLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBottomLayout.createSequentialGroup()
                                .addComponent(txfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCreateWorker, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(15, 15, 15))
                            .addGroup(pnlBottomLayout.createSequentialGroup()
                                .addComponent(txfRepeatPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnChangePassword)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(157, 157, 157))
        );

        pnlCenter.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnTaskViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskViewActionPerformed

        ControlGUI1.setGUIAccountInvisible();
        ControlGUI1.clearBenutzerGUI();
        ControlGUI1.setTaskViewVisible();
    }//GEN-LAST:event_btnTaskViewActionPerformed

    private void btnCreateWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateWorkerActionPerformed
        ControlGUI1.benutzerErstellen();
    }//GEN-LAST:event_btnCreateWorkerActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        ControlGUI1.ChangePasswordBtn();
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        // macht die Task Ansicht unsichtbar
        ControlGUI1.setGUIAccountInvisible();

        // macht den Loginscreen wieder sichtbar
        ControlGUI1.setGUILoginVisible();

        //Logt den User aus
        ControlGUI1.logoutBtn();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCloseProgrammActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseProgrammActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseProgrammActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        ControlGUI1.clearBenutzerGUI();
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListPosition;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnCloseProgramm;
    private javax.swing.JButton btnCreateWorker;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnTaskView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpSpacer1;
    private javax.swing.JPanel jpSpacer2;
    private javax.swing.JLabel lblChangePassword;
    private javax.swing.JLabel lblCreateNewWorker;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblPasswordRepeat;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txfFirstName;
    private javax.swing.JTextField txfHeadline;
    private javax.swing.JTextField txfLastName;
    private javax.swing.JTextField txfMail;
    private javax.swing.JPasswordField txfNewPassword;
    private javax.swing.JPasswordField txfOldPassword;
    private javax.swing.JPasswordField txfRepeatPassword;
    private javax.swing.JTextField txfSalary;
    private javax.swing.JTextField txfUnderline;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
