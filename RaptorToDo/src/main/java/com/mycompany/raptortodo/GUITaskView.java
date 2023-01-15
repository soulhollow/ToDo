package com.mycompany.raptortodo;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class GUITaskView extends javax.swing.JFrame {

    ControlGUI ControlGUI1;

    //Konstruktor
    public GUITaskView( ControlGUI aControlGUI ) {
        ControlGUI1 = aControlGUI;
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        JButton[] btns = {btnAufgabeAbgeben, btnAufgabeBearbeiten, btnMinimize};
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
        JButton[] MainButtons = {btnAccount, btnTaskView, btnNewTask, btnShowTask, btnLogout, btnCloseProgramm};
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

    public int getBearbeitungszeit() {
        int iBearbeitungszeit;
        try {
            iBearbeitungszeit = Integer.parseInt(txfArbeitszeit.getText());
            //hier könnte auch eine Exception geworfen werden
            if (0 == iBearbeitungszeit | 0 > iBearbeitungszeit) {
                iBearbeitungszeit = -1;
            }
        } catch (NumberFormatException e) {
            iBearbeitungszeit = -1;
        }
        return iBearbeitungszeit;
    }

    public void setVonUserTime( String sUser, int iEstimatedTime ) {
        if (iEstimatedTime != 0) {
            txaUserTime.setText("Diese Aufgabe wurde ihnen zugewiesen von :\n" + sUser + "\nSie bekomme für diese Aufgabe: \n" + iEstimatedTime + "Minuten");
        }else {
            txaUserTime.setText(sUser + "");
        }

    }

    //Liste wird in die Taskübersicht eingetragen
    public void setlstAllTasks1( String[] listData ) {
        lstAllTasks1.setListData(listData);
    }

    public void setlstAllTasks2( String[] listData ) {
        lstAllTasks2.setListData(listData);
    }

    //Setzt die TaskDescription auf die Ausgewählte Task
    public void setTaskDescription( String sTaskDescription ) {
        txaTaskDescription.setText(sTaskDescription);
    }

    public void setTxfTatsaechlicheZeit( int iTime ) {
        //Ich geh mal einfach davon aus das es keine Task gibt die 0 Minuten brauchen. Wär ja sonst Sinnlos
        if (iTime != 0) {
            txfArbeitszeit.setText(iTime + "");
        }else {
            txfArbeitszeit.setText("");
        }

    }

    //bekommt das selektierte Feld zurück
    public int getListAllTasksSelection1() {
        return lstAllTasks1.getSelectedIndex();
    }

    public int getListAllTasksSelection2() {
        return lstAllTasks2.getSelectedIndex();
    }

    public boolean istSelected1() {
        return  ! lstAllTasks1.isSelectionEmpty();
    }

    public boolean istSelected2() {
        return  ! lstAllTasks2.isSelectionEmpty();
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
        btnNewTask = new javax.swing.JButton();
        btnShowTask = new javax.swing.JButton();
        jpSpacer1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jpSpacer2 = new javax.swing.JPanel();
        btnCloseProgramm = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        txfHeadline = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnMinimize = new javax.swing.JButton();
        pnlBottom = new javax.swing.JPanel();
        scpLSTAllTask = new javax.swing.JScrollPane();
        lstAllTasks1 = new javax.swing.JList<>();
        scpLSTAllTasks = new javax.swing.JScrollPane();
        lstAllTasks2 = new javax.swing.JList<>();
        scpTXATaskDescription = new javax.swing.JScrollPane();
        txaTaskDescription = new javax.swing.JTextArea();
        lblAufgabenBearbeitung = new javax.swing.JLabel();
        lblAufgabenOffen = new javax.swing.JLabel();
        btnAufgabeAbgeben = new javax.swing.JButton();
        txfArbeitszeit = new javax.swing.JTextField();
        lblArbeitszeit = new javax.swing.JLabel();
        btnAufgabeBearbeiten = new javax.swing.JButton();
        scpTXAUserTime = new javax.swing.JScrollPane();
        txaUserTime = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1200, 825));
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

        btnAccount.setBackground(new java.awt.Color(21, 25, 28));
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/manage_accounts_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnAccount.setToolTipText("Hiermit öffnen sie die Account Verwaltung");
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
        btnTaskView.setToolTipText("Hiermit laden sie die Oberfläche neu");
        btnTaskView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnTaskView.setBorderPainted(false);
        btnTaskView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskViewActionPerformed(evt);
            }
        });
        pnlSide.add(btnTaskView);

        btnNewTask.setBackground(new java.awt.Color(21, 25, 28));
        btnNewTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/forms_add_on_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnNewTask.setToolTipText("Hiermit öffnen sie eine neue Oberfläche um eine neue Task zu erstellen");
        btnNewTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnNewTask.setBorderPainted(false);
        btnNewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTaskActionPerformed(evt);
            }
        });
        pnlSide.add(btnNewTask);

        btnShowTask.setBackground(new java.awt.Color(21, 25, 28));
        btnShowTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/visibility_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnShowTask.setToolTipText("Nach Auswahl einer Aufgabe lassen sie diese anzeigen");
        btnShowTask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnShowTask.setBorderPainted(false);
        btnShowTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTaskActionPerformed(evt);
            }
        });
        pnlSide.add(btnShowTask);

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

        txfHeadline.setEditable(false);
        txfHeadline.setBackground(new java.awt.Color(34, 40, 44));
        txfHeadline.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        txfHeadline.setForeground(new java.awt.Color(13, 203, 159));
        txfHeadline.setText("Wilkommen, hier sind ihre Aufgaben");
        txfHeadline.setBorder(null);
        pnlTop.add(txfHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 990, 80));

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
        pnlTop.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 70, 60));

        pnlCenter.add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlBottom.setBackground(new java.awt.Color(34, 40, 44));
        pnlBottom.setName(""); // NOI18N
        pnlBottom.setPreferredSize(new java.awt.Dimension(1200, 800));

        lstAllTasks1.setBackground(new java.awt.Color(30, 74, 78));
        lstAllTasks1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lstAllTasks1.setForeground(new java.awt.Color(13, 203, 159));
        lstAllTasks1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAllTasks1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lstAllTasks1.setToolTipText("Liste ihrer offenen Aufgaben");
        scpLSTAllTask.setViewportView(lstAllTasks1);

        lstAllTasks2.setBackground(new java.awt.Color(30, 74, 78));
        lstAllTasks2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lstAllTasks2.setForeground(new java.awt.Color(13, 203, 159));
        lstAllTasks2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAllTasks2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lstAllTasks2.setToolTipText("Liste der Aufgaben die sie gerade Bearbeiten");
        scpLSTAllTasks.setViewportView(lstAllTasks2);

        txaTaskDescription.setBackground(new java.awt.Color(30, 74, 78));
        txaTaskDescription.setColumns(20);
        txaTaskDescription.setForeground(new java.awt.Color(13, 203, 159));
        txaTaskDescription.setRows(5);
        txaTaskDescription.setToolTipText("Beschreibung der ausgewählten Aufgabe");
        txaTaskDescription.setBorder(null);
        txaTaskDescription.setFocusable(false);
        scpTXATaskDescription.setViewportView(txaTaskDescription);

        lblAufgabenBearbeitung.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblAufgabenBearbeitung.setForeground(new java.awt.Color(13, 203, 159));
        lblAufgabenBearbeitung.setText("Ihre Aufgaben in Bearbeitung");

        lblAufgabenOffen.setBackground(new java.awt.Color(34, 40, 44));
        lblAufgabenOffen.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblAufgabenOffen.setForeground(new java.awt.Color(13, 203, 159));
        lblAufgabenOffen.setText("Ihre offenen Aufgaben");

        btnAufgabeAbgeben.setBackground(new java.awt.Color(34, 40, 44));
        btnAufgabeAbgeben.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/done_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnAufgabeAbgeben.setToolTipText("Nach der Auswahl einer Aufgabe geben sie hier ihre Aufgabe ab (Plicht ist Arbeitszeit einzutragen)");
        btnAufgabeAbgeben.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnAufgabeAbgeben.setBorderPainted(false);
        btnAufgabeAbgeben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAufgabeAbgebenActionPerformed(evt);
            }
        });

        txfArbeitszeit.setBackground(new java.awt.Color(34, 40, 44));
        txfArbeitszeit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txfArbeitszeit.setForeground(new java.awt.Color(13, 203, 159));
        txfArbeitszeit.setToolTipText("Hier tragen sie ein wie lange sie an der Aufgabe gearbeitet haben (nur prositive Zahlen und lügen sie bitte nicht)");
        txfArbeitszeit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(13, 203, 159)));

        lblArbeitszeit.setBackground(new java.awt.Color(34, 40, 44));
        lblArbeitszeit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblArbeitszeit.setForeground(new java.awt.Color(13, 203, 159));
        lblArbeitszeit.setText("Ihre Arbeitszeit:");

        btnAufgabeBearbeiten.setBackground(new java.awt.Color(34, 40, 44));
        btnAufgabeBearbeiten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsWhitened/edit_note_FILL0_wght500_GRAD200_opsz48.png"))); // NOI18N
        btnAufgabeBearbeiten.setToolTipText("Nach Auswählen einer Aufgabe setzen sie diese hier als \"In Bearbeitung\"");
        btnAufgabeBearbeiten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        btnAufgabeBearbeiten.setBorderPainted(false);
        btnAufgabeBearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAufgabeBearbeitenActionPerformed(evt);
            }
        });

        txaUserTime.setEditable(false);
        txaUserTime.setBackground(new java.awt.Color(34, 40, 44));
        txaUserTime.setColumns(20);
        txaUserTime.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txaUserTime.setForeground(new java.awt.Color(13, 203, 159));
        txaUserTime.setRows(5);
        txaUserTime.setToolTipText("Hier wird angezeigt wer die von ihnen angezeigte Aufgabe erstellt hat und wie lange sie für diese Aufgabe brauchen sollten");
        txaUserTime.setBorder(null);
        scpTXAUserTime.setViewportView(txaUserTime);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scpLSTAllTask, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(scpLSTAllTasks)
                    .addComponent(lblAufgabenBearbeitung, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAufgabenOffen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addComponent(scpTXAUserTime, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAufgabeBearbeiten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblArbeitszeit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAufgabeAbgeben, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfArbeitszeit)))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scpTXATaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addComponent(lblAufgabenOffen)
                        .addGap(18, 18, 18)
                        .addComponent(scpLSTAllTask, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblAufgabenBearbeitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scpLSTAllTasks))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBottomLayout.createSequentialGroup()
                                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAufgabeAbgeben)
                                    .addGroup(pnlBottomLayout.createSequentialGroup()
                                        .addComponent(btnAufgabeBearbeiten)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblArbeitszeit)
                                            .addComponent(txfArbeitszeit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(scpTXATaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scpTXAUserTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );

        pnlCenter.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        ControlGUI1.setTaskViewInvisible();
        ControlGUI1.PasswordsetUsername();
        ControlGUI1.setGUIAccountVisible();

    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnTaskViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskViewActionPerformed
        ControlGUI1.btnMyTaskRefresh();
    }//GEN-LAST:event_btnTaskViewActionPerformed

    private void btnNewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTaskActionPerformed
        //NewTask1 sichtbar machen
        ControlGUI1.setGUINewTaskVisible();
    }//GEN-LAST:event_btnNewTaskActionPerformed

    private void btnShowTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTaskActionPerformed
        ControlGUI1.showTaskBtn();
    }//GEN-LAST:event_btnShowTaskActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        // macht die Task Ansicht unsichtbar
        ControlGUI1.setTaskViewInvisible();

        // macht den Loginscreen wieder sichtbar
        ControlGUI1.setGUILoginVisible();

        //Logt den User aus
        ControlGUI1.logoutBtn();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCloseProgrammActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseProgrammActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseProgrammActionPerformed

    private void btnAufgabeBearbeitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAufgabeBearbeitenActionPerformed
        ControlGUI1.taskBearbeitenBtn();
    }//GEN-LAST:event_btnAufgabeBearbeitenActionPerformed

    private void btnAufgabeAbgebenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAufgabeAbgebenActionPerformed
        ControlGUI1.taskFinishBtnTaskAnsicht();
    }//GEN-LAST:event_btnAufgabeAbgebenActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAufgabeAbgeben;
    private javax.swing.JButton btnAufgabeBearbeiten;
    private javax.swing.JButton btnCloseProgramm;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnNewTask;
    private javax.swing.JButton btnShowTask;
    private javax.swing.JButton btnTaskView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jpSpacer1;
    private javax.swing.JPanel jpSpacer2;
    private javax.swing.JLabel lblArbeitszeit;
    private javax.swing.JLabel lblAufgabenBearbeitung;
    private javax.swing.JLabel lblAufgabenOffen;
    private javax.swing.JList<String> lstAllTasks1;
    private javax.swing.JList<String> lstAllTasks2;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JScrollPane scpLSTAllTask;
    private javax.swing.JScrollPane scpLSTAllTasks;
    private javax.swing.JScrollPane scpTXATaskDescription;
    private javax.swing.JScrollPane scpTXAUserTime;
    private javax.swing.JTextArea txaTaskDescription;
    private javax.swing.JTextArea txaUserTime;
    private javax.swing.JTextField txfArbeitszeit;
    private javax.swing.JTextField txfHeadline;
    // End of variables declaration//GEN-END:variables
}
