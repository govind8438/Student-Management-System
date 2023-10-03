/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.majorproject;

import java.awt.Component;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Studentportel extends javax.swing.JFrame {
    
  private static final String CHOICE_CHOICE = "CHOICE";
private static final  String CHOICE_BCA = "BCA";
private static final String CHOICE_MCA = "MCA";
private static final  String CHOICE_BTECH = "B-TECH";
private static final  String CHOICE_MTECH = "M-TECH";


    private static  final String username = "root";
    private static final String password = "Happy@8438";
    private static final String datacon = "jdbc:mysql://localhost:3306/connector";
    
   public  Connection sqlConn = null;
  public   PreparedStatement pst =null;
   public ResultSet rs = null;
    private static Object CHOISE;
       Studentportel() {
        initComponents();
       }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sregno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Choicer = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();
        ChoicePanel = new javax.swing.JPanel();
        BcaPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clanguage = new javax.swing.JTextField();
        os = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dbms = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dcn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        att = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        certi = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        McaPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        java1 = new javax.swing.JTextField();
        maths = new javax.swing.JTextField();
        dsa = new javax.swing.JTextField();
        linux = new javax.swing.JTextField();
        aptitude = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        atdmca = new javax.swing.JTextField();
        certimca = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        BtechPanel = new javax.swing.JPanel();
        DM = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        BG = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ATT = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        CERTI = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        PYTHON = new javax.swing.JTextField();
        STA = new javax.swing.JTextField();
        DS = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        MtechPanel = new javax.swing.JPanel();
        MATHS = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        SPARKS = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Att = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        Certi = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        AI = new javax.swing.JTextField();
        ML = new javax.swing.JTextField();
        SEO = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        ShowPerformancePanel = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        sub4 = new javax.swing.JLabel();
        sub5 = new javax.swing.JLabel();
        sub3 = new javax.swing.JLabel();
        sub2 = new javax.swing.JLabel();
        attendence = new javax.swing.JLabel();
        certificate = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        regNo = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 33, 22));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student portal ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name ");

        sregno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sregnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reg No");

        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course ");

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Welcome to lovely professional University");

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("please enter your details ");

        Choicer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOICE", "BCA", "MCA", "B-TECH", "M-TECH" }));
        Choicer.setBorder(null);
        Choicer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Choicer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ChoicerItemStateChanged(evt);
            }
        });
        Choicer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoicerActionPerformed(evt);
            }
        });
        Choicer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ChoicerKeyPressed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton11.setText("CLEAR");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(9, 9, 9, 9, new java.awt.Color(0, 51, 51)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton2.setText("Show Performance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sregno, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(sname)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Choicer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sregno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Choicer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(28, 28, 28)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        ParentPanel.setBackground(new java.awt.Color(204, 204, 255));
        ParentPanel.setLayout(new java.awt.CardLayout());

        ChoicePanel.setBackground(new java.awt.Color(0, 23, 23));

        javax.swing.GroupLayout ChoicePanelLayout = new javax.swing.GroupLayout(ChoicePanel);
        ChoicePanel.setLayout(ChoicePanelLayout);
        ChoicePanelLayout.setHorizontalGroup(
            ChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        ChoicePanelLayout.setVerticalGroup(
            ChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        ParentPanel.add(ChoicePanel, "card6");

        BcaPanel.setBackground(new java.awt.Color(0, 23, 23));
        BcaPanel.setAutoscrolls(true);
        BcaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PLEASE ENTER YOUR BCA PERFORMANCE DETAILS ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("C-language");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("operating System");

        clanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clanguageActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Maths");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DBMS");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DCN");

        jLabel14.setBackground(new java.awt.Color(102, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("please Enter your all subject marks :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("please enter your attendence :");

        att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("How many certificate you got :");

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setText("clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BcaPanelLayout = new javax.swing.GroupLayout(BcaPanel);
        BcaPanel.setLayout(BcaPanelLayout);
        BcaPanelLayout.setHorizontalGroup(
            BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BcaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BcaPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BcaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(certi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))
                            .addGroup(BcaPanelLayout.createSequentialGroup()
                                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BcaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dcn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BcaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(clanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BcaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mth, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BcaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dbms, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BcaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(os, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BcaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(BcaPanelLayout.createSequentialGroup()
                                .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)))))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BcaPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BcaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        BcaPanelLayout.setVerticalGroup(
            BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BcaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(os, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(dbms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dcn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(certi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(BcaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        ParentPanel.add(BcaPanel, "card2");

        McaPanel.setBackground(new java.awt.Color(0, 23, 23));

        jLabel17.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Please enter your MCA performance details");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("please enter your all subject's marks");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Java ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Dsa");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Aptitude");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Maths");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Linux");

        java1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                java1ActionPerformed(evt);
            }
        });

        maths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathsActionPerformed(evt);
            }
        });

        linux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linuxActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Enter your total attendence:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("how many certificates you got:");

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setText("clear");

        javax.swing.GroupLayout McaPanelLayout = new javax.swing.GroupLayout(McaPanel);
        McaPanel.setLayout(McaPanelLayout);
        McaPanelLayout.setHorizontalGroup(
            McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(McaPanelLayout.createSequentialGroup()
                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(McaPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(McaPanelLayout.createSequentialGroup()
                                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(McaPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(McaPanelLayout.createSequentialGroup()
                                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(McaPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(aptitude, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(McaPanelLayout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(dsa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, McaPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(java1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(156, 156, 156)))
                                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maths, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(linux, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(McaPanelLayout.createSequentialGroup()
                                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(McaPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, McaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, McaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, McaPanelLayout.createSequentialGroup()
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(certimca, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atdmca, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(203, 203, 203))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, McaPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(64, 64, 64))
        );
        McaPanelLayout.setVerticalGroup(
            McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(McaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(McaPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(java1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(linux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(dsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aptitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atdmca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(27, 27, 27)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(certimca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, McaPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addGroup(McaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
        );

        ParentPanel.add(McaPanel, "card3");

        BtechPanel.setBackground(new java.awt.Color(0, 23, 23));
        BtechPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Please enter your B_TECH performance details");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("please enter your all subject's marks");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("enter your total attendence:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("python");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("how many certificates you got:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("data science");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Big data");

        CERTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERTIActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("statistics");

        PYTHON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PYTHONActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("data mining");

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("clear");

        javax.swing.GroupLayout BtechPanelLayout = new javax.swing.GroupLayout(BtechPanel);
        BtechPanel.setLayout(BtechPanelLayout);
        BtechPanelLayout.setHorizontalGroup(
            BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtechPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtechPanelLayout.createSequentialGroup()
                        .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BtechPanelLayout.createSequentialGroup()
                        .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BtechPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BtechPanelLayout.createSequentialGroup()
                                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PYTHON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DS, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BtechPanelLayout.createSequentialGroup()
                                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ATT, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CERTI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
                            .addGroup(BtechPanelLayout.createSequentialGroup()
                                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(BtechPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(STA, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BtechPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(DM, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtechPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(79, 79, 79))
            .addGroup(BtechPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtechPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        BtechPanelLayout.setVerticalGroup(
            BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtechPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(PYTHON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(DM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(STA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel44)))
                .addGap(29, 29, 29)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ATT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(23, 23, 23)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(CERTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(BtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        ParentPanel.add(BtechPanel, "card4");

        MtechPanel.setBackground(new java.awt.Color(0, 23, 23));

        MATHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATHSActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Please enter your M-TECH performance details");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("please enter your all subject's marks");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Enter your total attendence:");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("AI");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("How many certificates you got:");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("SEO");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("SPARKS");

        Certi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CertiActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("ML");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("MATHS");

        AI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AIActionPerformed(evt);
            }
        });

        ML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLActionPerformed(evt);
            }
        });

        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MtechPanelLayout = new javax.swing.GroupLayout(MtechPanel);
        MtechPanel.setLayout(MtechPanelLayout);
        MtechPanelLayout.setHorizontalGroup(
            MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MtechPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(MtechPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MtechPanelLayout.createSequentialGroup()
                        .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MtechPanelLayout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SPARKS, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MtechPanelLayout.createSequentialGroup()
                                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AI, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SEO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)))
                        .addGap(41, 41, 41)
                        .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MATHS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ML, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MtechPanelLayout.createSequentialGroup()
                        .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MtechPanelLayout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Certi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MtechPanelLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Att, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(198, 198, 198))))
            .addGroup(MtechPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MtechPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(66, 66, 66))
        );
        MtechPanelLayout.setVerticalGroup(
            MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MtechPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(24, 24, 24)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(AI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(36, 36, 36)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(SEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(MATHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(SPARKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Att, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(26, 26, 26)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Certi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(29, 29, 29)
                .addGroup(MtechPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        ParentPanel.add(MtechPanel, "card5");

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel46.setText("Name");

        jLabel47.setText("Roll no");

        jLabel48.setText("course");

        sub4.setText("sub4");

        sub5.setText("sub5");

        sub3.setText("sub3");

        sub2.setText("sub2");

        attendence.setText("attendence");

        certificate.setText("certificate");

        sub1.setText("jLabel49");

        jButton12.setText("Show");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShowPerformancePanelLayout = new javax.swing.GroupLayout(ShowPerformancePanel);
        ShowPerformancePanel.setLayout(ShowPerformancePanelLayout);
        ShowPerformancePanelLayout.setHorizontalGroup(
            ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(regNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sub5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(sub4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(attendence, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowPerformancePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(certificate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ShowPerformancePanelLayout.setVerticalGroup(
            ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ShowPerformancePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12))))
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub3)
                    .addComponent(sub1))
                .addGap(18, 18, 18)
                .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub2)
                    .addComponent(sub4))
                .addGap(18, 18, 18)
                .addComponent(sub5)
                .addGap(36, 36, 36)
                .addGroup(ShowPerformancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendence)
                    .addComponent(certificate))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        ParentPanel.add(ShowPerformancePanel, "card7");

        getContentPane().add(ParentPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public  void update()
  {
      try
      {
          Class.forName("com.mysql.jdbc.driver"); 
          sqlConn =DriverManager.getConnection(datacon,username,password);
          rs = pst.executeQuery();
          ResultSetMetaData stdata = rs.getMetaData();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      
  }
   
    private void clanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clanguageActionPerformed

    private void ChoicerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChoicerKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_ChoicerKeyPressed

    private void ChoicerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoicerActionPerformed
try {
    String course = Choicer.getSelectedItem().toString();
    Component selectedPanel = null;

    switch (course) {
        case "CHOICE" -> selectedPanel = ChoicePanel;
        case "BCA" -> selectedPanel = BcaPanel;
        case "MCA" -> selectedPanel = McaPanel;
        case "B-TECH" -> selectedPanel = BtechPanel;
        case "M-TECH" -> selectedPanel = MtechPanel;
        default -> selectedPanel = ChoicePanel;
    }

    ParentPanel.removeAll();
    ParentPanel.add(selectedPanel);
    ParentPanel.revalidate();
    ParentPanel.repaint();

} catch(Exception e) {
    System.out.println(e);
}



       //  JOptionPane.showMessageDialog(null, "Saved Success");

    }//GEN-LAST:event_ChoicerActionPerformed

    private void ChoicerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ChoicerItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_ChoicerItemStateChanged

    
    
    
    
//    public  void addData(String id ,String name,String course)
//{
//    	try{
//            String url
//			= "jdbc:mysql://localhost:3306/connecter"; // table details
//		String username = "root"; // MySQL credentials
//		String password = "Happy@8438";
//      System.out.print("sdfjhs");
//		String query
//			= "select *from student"; // query to be run
//		Class.forName(
//			"com.mysql.cj.jdbc.Driver"); // Driver name
//		Connection con = DriverManager.getConnection(
//			url, username, password);
//		System.out.println(
//			"Connection Established successfully");
//		Statement st = con.createStatement();
//                          String sql = "insert into student(ID, StudentName, course) VALUES ("+id+",'"+name+"','"+course+"');";
//                   st.executeUpdate(sql);
//               
//                
//        
//            ResultSet rs
//                    = st.executeQuery(query); // Execute query
//        } catch (Exception ex) {
//            Logger.getLogger(Studentportel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}

  
    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_snameActionPerformed

    private void sregnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sregnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sregnoActionPerformed

    private void attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attActionPerformed

    private void java1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_java1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_java1ActionPerformed
public void addbca(String Id, String name,String cource,String c, String os, String maths, String dbms, String dcn, String att, String certi)
  {
      	try{	String url
			= "jdbc:mysql://localhost:3306/connecter"; // table details
		String username = "root"; // MySQL credentials
		String password = "Happy@8438";
      System.out.print("sdfjhs");
		String query
			= "select *from student"; // query to be run
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st1 = con.createStatement();
                          String sql1 = "insert into student(ID, StudentName, course, subject1, subject2, subject3, subject4, subject5, attendence, certificate) VALUES ("+Id+",'"+name+"','"+cource+"','"+c+"','"+os+"','"+maths+"','"+dbms+"','"+dcn+"','"+att+"','"+certi+"');";
                   st1.executeUpdate(sql1);
           ResultSet rs
                    = st1.executeQuery(query); // Execute query
           con.close();
        } catch (Exception ex) {
            Logger.getLogger(Studentportel.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             String name = sname.getText();
          String selectedPanelName = Choicer.getSelectedItem().toString();
          String ID = sregno.getText();
        
          
   
           if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter your name");
        }
        if(ID.equals(""))
        {
              JOptionPane.showMessageDialog(null, "Please enter your Registration number");
        }
        if(selectedPanelName.equals("CHOISE"))
        {
            JOptionPane.showMessageDialog(null, "Please Select any course");
        }
        String CPP =clanguage.getText();
        String Os = os.getText();
        String maths = mth.getText();
        String Dbms = dbms.getText();
        String Dcn = dcn.getText();
        String Att =att.getText();
        String Certi = certi.getText();
        addbca(ID,name,selectedPanelName,CPP,Os, maths,Dbms,Dcn,Att,Certi);       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PYTHONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PYTHONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PYTHONActionPerformed

    private void AIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AIActionPerformed

    private void linuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linuxActionPerformed

    private void CERTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERTIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CERTIActionPerformed

    private void MLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MLActionPerformed

    private void MATHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATHSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATHSActionPerformed

    private void CertiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CertiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CertiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
      sname.setText(null);
      sregno.setText(null);    
      Choicer.setSelectedItem(CHOISE);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void mathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mathsActionPerformed
public void addmca (String name, String cource ,String ID,String Java, String Maths, String Dsa, String Linux, String apti, String att, String certi)
{
    	try{	String url
			= "jdbc:mysql://localhost:3306/connecter"; // table details
		String username = "root"; // MySQL credentials
		String password = "Happy@8438";
      System.out.print("sdfjhs");
		String query
			= "select *from student"; // query to be run
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st1 = con.createStatement();
                          String sql1 = "insert into student(ID, StudentName, course, subject1, subject2, subject3, subject4, subject5, attendence, certificate) VALUES ("+ID+",'"+name+"','"+cource+"','"+Java+"','"+Maths+"','"+Dsa+"','"+Linux+"','"+apti+"','"+att+"','"+certi+"');";
                   st1.executeUpdate(sql1);
           ResultSet rs
                    = st1.executeQuery(query); // Execute query
           con.close();
        } catch (Exception ex) {
            Logger.getLogger(Studentportel.class.getName()).log(Level.SEVERE, null, ex);
        }

}

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
               String name = sname.getText();
          String selectedPanelName = Choicer.getSelectedItem().toString();
          String ID = sregno.getText();
        
          
   
           if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter your name");
        }
        if(ID.equals(""))
        {
              JOptionPane.showMessageDialog(null, "Please enter your Registration number");
        }
        if(selectedPanelName.equals("CHOISE"))
        {
            JOptionPane.showMessageDialog(null, "Please Select any course");
        }
          String Java1 = java1.getText();
          String Maths =maths.getText();
          String Dsa = dsa.getText();
          String Linux = linux.getText();
          String apti = aptitude.getText();
          String att = atdmca.getText();
          String certi = certimca.getText();
             addmca(name,selectedPanelName,ID,Java1,Maths,Dsa,Linux,apti,att,certi);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
 public void addbtech(String ID,String name, String cource,String python, String sta, String ds, String dm, String bg, String atten, String certifi)
 {
     	try{	String url
			= "jdbc:mysql://localhost:3306/connecter"; // table details
		String username = "root"; // MySQL credentials
		String password = "Happy@8438";
      System.out.print("sdfjhs");
		String query
			= "select *from student"; // query to be run
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st1 = con.createStatement();
                            String sql1 = "insert into student(ID, StudentName, course, subject1, subject2, subject3, subject4, subject5, attendence, certificate) VALUES ("+ID+",'"+name+"','"+cource+"','"+python+"','"+sta+"','"+ds+"','"+dm+"','"+bg+"','"+atten+"','"+certifi+"');";
                   st1.executeUpdate(sql1);
           ResultSet rs
                    = st1.executeQuery(query); // Execute query
           con.close();
        } catch (Exception ex) {
            Logger.getLogger(Studentportel.class.getName()).log(Level.SEVERE, null, ex);
        }

 }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
           String name = sname.getText();
          String selectedPanelName = Choicer.getSelectedItem().toString();
          String ID = sregno.getText();
        
          
   
           if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter your name");
        }
        if(ID.equals(""))
        {
              JOptionPane.showMessageDialog(null, "Please enter your Registration number");
        }
        if(selectedPanelName.equals("CHOISE"))
        {
            JOptionPane.showMessageDialog(null, "Please Select any course");
        }
           String python = PYTHON.getText();
          String  statistics=STA.getText();
          String ds = DS.getText();
          String dm = DM.getText();
          String bg = BG.getText();
          String atten = ATT.getText();
          String certifi = CERTI.getText();
             addbtech(ID,name,selectedPanelName,python,statistics,ds,dm,bg,atten,certifi);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    public void addmtech(String ID ,String name, String cource, String ai, String ml, String seo, String maths, String sparks, String att, String certi)
    {
        	try{	String url
			= "jdbc:mysql://localhost:3306/connecter"; // table details
		String username = "root"; // MySQL credentials
		String password = "Happy@8438";
      System.out.print("sdfjhs");
		String query
			= "select *from student"; // query to be run
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st1 = con.createStatement();
                          String sql1 = "insert into student(ID, StudentName, course, subject1, subject2, subject3, subject4, subject5, attendence, certificate) VALUES ("+ID+",'"+name+"','"+cource+"','"+ai+"','"+ml+"','"+seo+"','"+maths+"','"+sparks+"','"+att+"','"+certi+"');";
                   st1.executeUpdate(sql1);
           ResultSet rs
                    = st1.executeQuery(query); // Execute query
           con.close();
        } catch (Exception ex) {
            Logger.getLogger(Studentportel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try
        {
            String name = sname.getText();
          String selectedPanelName = Choicer.getSelectedItem().toString();
          String ID = sregno.getText();
        
          
   
           if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter your name");
        }
        if(ID.equals(""))
        {
              JOptionPane.showMessageDialog(null, "Please enter your Registration number");
        }
        if(selectedPanelName.equals("CHOISE"))
        {
            JOptionPane.showMessageDialog(null, "Please Select any course");
        }
        String ai = AI.getText();
        String ml = ML.getText();
        String seo = SEO.getText();
        String maths =MATHS.getText();
        String sparks = SPARKS.getText();
        String  att = Att.getText();
        String  certi = Certi.getText();
        addmtech(ID,name,selectedPanelName,ai,ml,seo,maths,sparks,att,certi);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          new  ShowPerformance().setVisible(true);
      
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton12ActionPerformed

    public  static void main(String args[]) {
     
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Studentportel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AI;
    private javax.swing.JTextField ATT;
    private javax.swing.JTextField Att;
    private javax.swing.JTextField BG;
    private javax.swing.JPanel BcaPanel;
    private javax.swing.JPanel BtechPanel;
    private javax.swing.JTextField CERTI;
    private javax.swing.JTextField Certi;
    private javax.swing.JPanel ChoicePanel;
    private javax.swing.JComboBox<String> Choicer;
    private javax.swing.JTextField DM;
    private javax.swing.JTextField DS;
    private javax.swing.JTextField MATHS;
    private javax.swing.JTextField ML;
    private javax.swing.JPanel McaPanel;
    private javax.swing.JPanel MtechPanel;
    private javax.swing.JTextField PYTHON;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JTextField SEO;
    private javax.swing.JTextField SPARKS;
    private javax.swing.JTextField STA;
    private javax.swing.JPanel ShowPerformancePanel;
    private javax.swing.JTextField aptitude;
    private javax.swing.JTextField atdmca;
    private javax.swing.JTextField att;
    private javax.swing.JLabel attendence;
    private javax.swing.JTextField certi;
    private javax.swing.JLabel certificate;
    private javax.swing.JTextField certimca;
    private javax.swing.JTextField clanguage;
    private javax.swing.JTextField dbms;
    private javax.swing.JTextField dcn;
    private javax.swing.JTextField dsa;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField java1;
    private javax.swing.JTextField linux;
    private javax.swing.JTextField maths;
    private javax.swing.JTextField mth;
    private javax.swing.JTextField os;
    private javax.swing.JTextField regNo;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sregno;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub2;
    private javax.swing.JLabel sub3;
    private javax.swing.JLabel sub4;
    private javax.swing.JLabel sub5;
    // End of variables declaration//GEN-END:variables
}