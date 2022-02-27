/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mostafa
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        super("EaseCare Clinic");
        initComponents();
        showDate();
        showTime();
        totalDoctors();
        totalPatients();
        setExtendedState(JFrame.MAXIMIZED_BOTH);        
    }

    public void showDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        currentDate.setText(dateFormat.format(date));
    }

    public void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date time = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
                currentTime.setText(dateFormat.format(time));
            }
        }
        ).start();
    }

    public void totalDoctors() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicdata", "root", "admin123");
            String sql = "Select count(id) FROM doctor ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String totalDoc = rs.getString("count(id)");
                DoctorsNumber.setText(totalDoc);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void totalPatients() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicdata", "root", "admin123");
            String sql = "Select count(id) FROM patient ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String total = rs.getString("count(id)");
                PatientsNumber.setText(total);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MainPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JButton();
        AddPatientBtn = new javax.swing.JButton();
        PatientsListBtn = new javax.swing.JButton();
        AddDoctorBtn = new javax.swing.JButton();
        DoctorsListBtn = new javax.swing.JButton();
        AppointmentsBtn = new javax.swing.JButton();
        BillingsBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        VisitsBtn = new javax.swing.JButton();
        TitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        currentTime = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        loggedName = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DoctorsPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DoctorsNumber = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PatientsPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PatientsNumber = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 51, 102));
        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Welcome To EaseCare Clinic ");
        MainPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 370, 30));

        SidePanel.setBackground(new java.awt.Color(0, 51, 102));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeBtn.setBackground(new java.awt.Color(0, 51, 102));
        HomeBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/home.png"))); // NOI18N
        HomeBtn.setText("Home Page");
        HomeBtn.setBorder(null);
        HomeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        HomeBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        SidePanel.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 30));

        AddPatientBtn.setBackground(new java.awt.Color(0, 51, 102));
        AddPatientBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AddPatientBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddPatientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/add_patient.png"))); // NOI18N
        AddPatientBtn.setText("Add New Patient ");
        AddPatientBtn.setBorder(null);
        AddPatientBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        AddPatientBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        AddPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientBtnActionPerformed(evt);
            }
        });
        SidePanel.add(AddPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 30));

        PatientsListBtn.setBackground(new java.awt.Color(0, 51, 102));
        PatientsListBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PatientsListBtn.setForeground(new java.awt.Color(255, 255, 255));
        PatientsListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/patients.png"))); // NOI18N
        PatientsListBtn.setText("Patients List");
        PatientsListBtn.setBorder(null);
        PatientsListBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        PatientsListBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        PatientsListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientsListBtnActionPerformed(evt);
            }
        });
        SidePanel.add(PatientsListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 30));

        AddDoctorBtn.setBackground(new java.awt.Color(0, 51, 102));
        AddDoctorBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AddDoctorBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddDoctorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/add_doctor.png"))); // NOI18N
        AddDoctorBtn.setText("Add New Doctor");
        AddDoctorBtn.setBorder(null);
        AddDoctorBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        AddDoctorBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        AddDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDoctorBtnActionPerformed(evt);
            }
        });
        SidePanel.add(AddDoctorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 30));

        DoctorsListBtn.setBackground(new java.awt.Color(0, 51, 102));
        DoctorsListBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DoctorsListBtn.setForeground(new java.awt.Color(255, 255, 255));
        DoctorsListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/doctors.png"))); // NOI18N
        DoctorsListBtn.setText("Doctors List");
        DoctorsListBtn.setBorder(null);
        DoctorsListBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        DoctorsListBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        DoctorsListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorsListBtnActionPerformed(evt);
            }
        });
        SidePanel.add(DoctorsListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, 30));

        AppointmentsBtn.setBackground(new java.awt.Color(0, 51, 102));
        AppointmentsBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AppointmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/appointments.png"))); // NOI18N
        AppointmentsBtn.setText(" Appointments");
        AppointmentsBtn.setBorder(null);
        AppointmentsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        AppointmentsBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        AppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentsBtnActionPerformed(evt);
            }
        });
        SidePanel.add(AppointmentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 30));

        BillingsBtn.setBackground(new java.awt.Color(0, 51, 102));
        BillingsBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BillingsBtn.setForeground(new java.awt.Color(255, 255, 255));
        BillingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/bills.png"))); // NOI18N
        BillingsBtn.setText("Manage Bills");
        BillingsBtn.setBorder(null);
        BillingsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BillingsBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        BillingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingsBtnActionPerformed(evt);
            }
        });
        SidePanel.add(BillingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 180, 30));

        LogoutBtn.setBackground(new java.awt.Color(0, 51, 102));
        LogoutBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/logout.png"))); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.setBorder(null);
        LogoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        LogoutBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        SidePanel.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EaseCare Clinic");
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/small-logo.png"))); // NOI18N
        SidePanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        VisitsBtn.setBackground(new java.awt.Color(0, 51, 102));
        VisitsBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        VisitsBtn.setForeground(new java.awt.Color(255, 255, 255));
        VisitsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/endvisit.png"))); // NOI18N
        VisitsBtn.setText("End Patient Visit");
        VisitsBtn.setBorder(null);
        VisitsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        VisitsBtn.setPreferredSize(new java.awt.Dimension(240, 59));
        VisitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitsBtnActionPerformed(evt);
            }
        });
        SidePanel.add(VisitsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 180, 30));

        MainPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 513));

        TitlePanel.setBackground(new java.awt.Color(9, 124, 180));
        TitlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home Page");
        TitlePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 230, 50));

        currentTime.setBackground(new java.awt.Color(9, 124, 180));
        currentTime.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        currentTime.setForeground(new java.awt.Color(255, 255, 255));
        currentTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentTime.setText(".");
        TitlePanel.add(currentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 130, 30));

        jLabel16.setBackground(new java.awt.Color(9, 124, 180));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/online.png"))); // NOI18N
        jLabel16.setText("Online");
        TitlePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 20));

        loggedName.setBackground(new java.awt.Color(9, 124, 180));
        loggedName.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        loggedName.setForeground(new java.awt.Color(255, 255, 255));
        loggedName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/identify.png"))); // NOI18N
        TitlePanel.add(loggedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 150, 30));

        currentDate.setBackground(new java.awt.Color(9, 124, 180));
        currentDate.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        currentDate.setForeground(new java.awt.Color(255, 255, 255));
        currentDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentDate.setText(".");
        TitlePanel.add(currentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 130, 30));

        MainPanel.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 110));

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Notes:");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 80, 30));

        DoctorsPanel.setBackground(new java.awt.Color(0, 51, 102));
        DoctorsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/big_doctors.png"))); // NOI18N
        DoctorsPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 90, 80));

        DoctorsNumber.setBackground(new java.awt.Color(255, 255, 255));
        DoctorsNumber.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        DoctorsNumber.setForeground(new java.awt.Color(255, 255, 255));
        DoctorsNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoctorsNumber.setText("2");
        DoctorsPanel.add(DoctorsNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 66, 39));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Doctors in The Clinic");
        DoctorsPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Doctors");
        DoctorsPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 39));

        MainPanel.add(DoctorsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 230, 110));

        PatientsPanel.setBackground(new java.awt.Color(0, 51, 102));
        PatientsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/big_patients2.png"))); // NOI18N
        PatientsPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 90, 90));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Patients");
        PatientsPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 39));

        PatientsNumber.setBackground(new java.awt.Color(255, 255, 255));
        PatientsNumber.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        PatientsNumber.setForeground(new java.awt.Color(255, 255, 255));
        PatientsNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PatientsNumber.setText("4");
        PatientsPanel.add(PatientsNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 66, 39));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total Patients in The Clinic");
        PatientsPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 30));

        MainPanel.add(PatientsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 230, 110));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 102));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        MainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 520, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/image (4).jpg"))); // NOI18N
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 110, 120));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/image (5).jpg"))); // NOI18N
        MainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 130, 140));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/image (6).jpg"))); // NOI18N
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 120));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/image (7).jpg"))); // NOI18N
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 120, 120));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/image (2).jpg"))); // NOI18N
        MainPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, 120));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(MainPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        Home homePage = new Home();
        setVisible(false);
        homePage.setVisible(true);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void PatientsListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsListBtnActionPerformed
        // TODO add your handling code here:
        PatientsList patientsList = new PatientsList();
        setVisible(false);
        patientsList.setVisible(true);

    }//GEN-LAST:event_PatientsListBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout ?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            FirstPanel first = new FirstPanel();
            setVisible(false);
            first.setVisible(true);
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void AddDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorBtnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("This For Clinic Assistant Only \n Please Enter the password: ");
        if (input.equals("admin1010")) {
            JOptionPane.showMessageDialog(null, "Matched Password, Welcome Clinic Assistant...");
            AddNewDoctor addNewDoctor = new AddNewDoctor();
            setVisible(false);
            addNewDoctor.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, " Wrong Password! You can't Enter here", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddDoctorBtnActionPerformed

    private void DoctorsListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorsListBtnActionPerformed
        // TODO add your handling code here:
        DoctorsList doctorsList = new DoctorsList();
        setVisible(false);
        doctorsList.setVisible(true);
    }//GEN-LAST:event_DoctorsListBtnActionPerformed

    private void AppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentsBtnActionPerformed
        // TODO add your handling code here:
        ManageAppointments manageAppointments = new ManageAppointments();
        setVisible(false);
        manageAppointments.setVisible(true);
    }//GEN-LAST:event_AppointmentsBtnActionPerformed

    private void BillingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingsBtnActionPerformed
        // TODO add your handling code here:
        ManageBills manageBills = new ManageBills();
        setVisible(false);
        manageBills.setVisible(true);
    }//GEN-LAST:event_BillingsBtnActionPerformed

    private void AddPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientBtnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("This For Clinic Assistant Only \n Please Enter the password: ");
        if (input.equals("admin1010")) {
            JOptionPane.showMessageDialog(null, "Matched Password, Welcome Clinic Assistant...");
            AddNewPatient addNewPatient = new AddNewPatient();
            setVisible(false);
            addNewPatient.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Password! You can't Enter here", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddPatientBtnActionPerformed

    private void VisitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitsBtnActionPerformed
        // TODO add your handling code here:
        EndVisit endVisit = new EndVisit();
        setVisible(false);
        endVisit.setVisible(true);
    }//GEN-LAST:event_VisitsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctorBtn;
    private javax.swing.JButton AddPatientBtn;
    private javax.swing.JButton AppointmentsBtn;
    private javax.swing.JButton BillingsBtn;
    private javax.swing.JButton DoctorsListBtn;
    private javax.swing.JLabel DoctorsNumber;
    private javax.swing.JPanel DoctorsPanel;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton PatientsListBtn;
    private javax.swing.JLabel PatientsNumber;
    private javax.swing.JPanel PatientsPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton VisitsBtn;
    public static javax.swing.JLabel currentDate;
    public static javax.swing.JLabel currentTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JLabel loggedName;
    // End of variables declaration//GEN-END:variables
}