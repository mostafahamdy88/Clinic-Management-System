/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mostafa
 */
public class AddNewDoctor extends javax.swing.JFrame {

    /**
     * Creates new form AddNewDoctor
     */
    public AddNewDoctor() {
        super("EaseCare Clinic");
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
        SidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JButton();
        AddPatientBtn = new javax.swing.JButton();
        PatientsListBtn = new javax.swing.JButton();
        AddDoctorBtn = new javax.swing.JButton();
        DoctorsListBtn = new javax.swing.JButton();
        AppointmentsBtn = new javax.swing.JButton();
        BillingsBtn = new javax.swing.JButton();
        VisitsBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        TitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Add_DoctorBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CAID_edt = new javax.swing.JTextField();
        DoctorPassword_edt = new javax.swing.JPasswordField();
        DoctorName_edt = new javax.swing.JTextField();
        DoctorSpecialty_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        DoctorPhone_edt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(0, 51, 102));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EaseCare Clinic");
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/small-logo.png"))); // NOI18N
        SidePanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

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

        MainPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 513));

        TitlePanel.setBackground(new java.awt.Color(9, 124, 180));
        TitlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add New Doctor");
        TitlePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 18, 439, 86));

        MainPanel.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 110));

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Clinic Assistant ID");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 130, 30));

        Add_DoctorBtn.setBackground(new java.awt.Color(0, 51, 102));
        Add_DoctorBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Add_DoctorBtn.setForeground(new java.awt.Color(255, 255, 255));
        Add_DoctorBtn.setText("Add");
        Add_DoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_DoctorBtnActionPerformed(evt);
            }
        });
        MainPanel.add(Add_DoctorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 110, 40));

        jLabel10.setBackground(new java.awt.Color(0, 51, 102));
        jLabel10.setFont(new java.awt.Font("Dialog", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Note: Added doctor will get ID by default (Auto Increment)");
        MainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 460, 30));

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Doctor Password");
        MainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 130, 30));

        jLabel8.setBackground(new java.awt.Color(0, 51, 102));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Doctor Name");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

        jLabel12.setBackground(new java.awt.Color(0, 51, 102));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Doctor Phone No.");
        MainPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 130, 30));

        CAID_edt.setBackground(new java.awt.Color(255, 255, 255));
        CAID_edt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CAID_edt.setForeground(new java.awt.Color(0, 51, 102));
        MainPanel.add(CAID_edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 340, 30));

        DoctorPassword_edt.setBackground(new java.awt.Color(255, 255, 255));
        DoctorPassword_edt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DoctorPassword_edt.setForeground(new java.awt.Color(0, 51, 102));
        MainPanel.add(DoctorPassword_edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 340, 30));

        DoctorName_edt.setBackground(new java.awt.Color(255, 255, 255));
        DoctorName_edt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DoctorName_edt.setForeground(new java.awt.Color(0, 51, 102));
        MainPanel.add(DoctorName_edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 340, 30));

        DoctorSpecialty_combo.setBackground(new java.awt.Color(255, 255, 255));
        DoctorSpecialty_combo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        DoctorSpecialty_combo.setForeground(new java.awt.Color(0, 51, 102));
        DoctorSpecialty_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologist", "Dermatologist", "Gastroenterologist", "Internal Medicine Physician", "Neurologist", "Oncologist", "Obstetrician/Gynecologist (OB/GYN)", "Ophthalmologist", "Otolaryngologist", "Pediatrician", "Psychiatrist", "Pulmonologist" }));
        MainPanel.add(DoctorSpecialty_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 340, 30));

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Doctor Specialty ");
        MainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 30));

        DoctorPhone_edt.setBackground(new java.awt.Color(255, 255, 255));
        DoctorPhone_edt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DoctorPhone_edt.setForeground(new java.awt.Color(0, 51, 102));
        MainPanel.add(DoctorPhone_edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 340, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(MainPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_DoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_DoctorBtnActionPerformed
        // TODO add your handling code here:
        //String ID = Doctorid_edt.getText();
        String Name = DoctorName_edt.getText();
        String Specialty = (String) DoctorSpecialty_combo.getSelectedItem();
        String Phone = DoctorPhone_edt.getText();
        String Password = DoctorPassword_edt.getText();
        String CA_ID = CAID_edt.getText();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicdata", "root", "admin123");
            Statement st = con.createStatement();
            String sql = ("insert into doctor(name,specialty,phone,password,clinicassistant_id) values ('" + Name + "','" + Specialty + "','" + Phone + "','" + Password + "','" + CA_ID + "')");

            int rowAdded = st.executeUpdate(sql);

            if (rowAdded > 0) {
                JOptionPane.showMessageDialog(this, "Successfully New Doctor has been added! ");
                DoctorsList dl = new DoctorsList();
                dl.showData();
            } else {
                JOptionPane.showMessageDialog(this, "Please Fill All rows correct, Try again!", "Failure", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_Add_DoctorBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        Home homePage = new Home();
        setVisible(false);
        homePage.setVisible(true);
        homePage.totalDoctors();
        homePage.totalPatients();
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void AddPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientBtnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("This For Clinic Assistant Only \n Please Enter the password: ");
        if (input.equals("admin1010")) {
            JOptionPane.showMessageDialog(null, "Matched Password, Welcome Clinic Assistant...");
            AddNewPatient addNewPatient = new AddNewPatient();
            setVisible(false);
            addNewPatient.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, " Wrong Password! You can't Enter here", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddPatientBtnActionPerformed

    private void PatientsListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsListBtnActionPerformed
        // TODO add your handling code here:
        PatientsList patientsList = new PatientsList();
        setVisible(false);
        patientsList.setVisible(true);

    }//GEN-LAST:event_PatientsListBtnActionPerformed

    private void AddDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDoctorBtnActionPerformed
        // TODO add your handling code here:
        AddNewDoctor addNewDoctor = new AddNewDoctor();
        setVisible(false);
        addNewDoctor.setVisible(true);
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

    private void VisitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitsBtnActionPerformed
        // TODO add your handling code here:
        EndVisit endVisit = new EndVisit();
        setVisible(false);
        endVisit.setVisible(true);
    }//GEN-LAST:event_VisitsBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout ?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            FirstPanel first = new FirstPanel();
            setVisible(false);
            first.setVisible(true);
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctorBtn;
    private javax.swing.JButton AddPatientBtn;
    private javax.swing.JButton Add_DoctorBtn;
    private javax.swing.JButton AppointmentsBtn;
    private javax.swing.JButton BillingsBtn;
    private javax.swing.JTextField CAID_edt;
    private javax.swing.JTextField DoctorName_edt;
    private javax.swing.JPasswordField DoctorPassword_edt;
    private javax.swing.JTextField DoctorPhone_edt;
    private javax.swing.JComboBox<String> DoctorSpecialty_combo;
    private javax.swing.JButton DoctorsListBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton PatientsListBtn;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton VisitsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
