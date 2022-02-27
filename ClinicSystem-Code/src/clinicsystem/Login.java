/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mostafa
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CAssistantCancelBtn = new javax.swing.JButton();
        CAssistantLoginBtn = new javax.swing.JButton();
        CA_password = new javax.swing.JPasswordField();
        CA_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/username-icon.png"))); // NOI18N
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 90, 100));

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/password_icon.png"))); // NOI18N
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, 100));

        CAssistantCancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        CAssistantCancelBtn.setFont(new java.awt.Font("Cooper Black", 1, 15)); // NOI18N
        CAssistantCancelBtn.setForeground(new java.awt.Color(0, 51, 102));
        CAssistantCancelBtn.setText("Cancel");
        CAssistantCancelBtn.setBorder(null);
        CAssistantCancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CAssistantCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAssistantCancelBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(CAssistantCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 100, 40));

        CAssistantLoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        CAssistantLoginBtn.setFont(new java.awt.Font("Cooper Black", 1, 15)); // NOI18N
        CAssistantLoginBtn.setForeground(new java.awt.Color(0, 51, 102));
        CAssistantLoginBtn.setText("Login");
        CAssistantLoginBtn.setBorder(null);
        CAssistantLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CAssistantLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAssistantLoginBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(CAssistantLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 100, 40));

        CA_password.setBackground(new java.awt.Color(255, 255, 255));
        CA_password.setForeground(new java.awt.Color(0, 51, 102));
        CA_password.setText("jPasswordField1");
        CA_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_passwordActionPerformed(evt);
            }
        });
        jLayeredPane1.add(CA_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 230, 30));

        CA_username.setBackground(new java.awt.Color(255, 255, 255));
        CA_username.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CA_username.setForeground(new java.awt.Color(0, 51, 102));
        CA_username.setText("Username");
        CA_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_usernameActionPerformed(evt);
            }
        });
        jLayeredPane1.add(CA_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicgui/images/Login.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 790, 410));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLayeredPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAssistantCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAssistantCancelBtnActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to back to First Page ?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            FirstPanel first = new FirstPanel();
            first.setVisible(true);
        }
    }//GEN-LAST:event_CAssistantCancelBtnActionPerformed

    private void CA_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CA_passwordActionPerformed

    private void CA_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CA_usernameActionPerformed

    private void CAssistantLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAssistantLoginBtnActionPerformed
        // TODO add your handling code here:
        String CAname = CA_username.getText();
        String CApassword = new String(CA_password.getPassword());
        try {
            boolean flag = false;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicdata", "root", "admin123");
            Statement stmt = con.createStatement();
            String sql = "select name,password from clinicdata.clinicassistant";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String username = rs.getString("name");
                String password = rs.getString("password");
                if (CAname.equals(username) && CApassword.equals(password)) {
                    flag = true;
                    break;
                }

            }
            if (flag) {
                JOptionPane.showMessageDialog(this, "Successfully Logged in! \nWelcome Clinic Assistant ...");
                Home homePage = new Home();
                setVisible(false);
                homePage.setVisible(true);
                homePage.loggedName.setText(this.CA_username.getText());

                homePage.totalDoctors();
                homePage.totalPatients();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password! \nPlease Try again ... ", "Failure", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "There is some problems, may be network problem \nPlease Try again ... ", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CAssistantLoginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CA_password;
    public static javax.swing.JTextField CA_username;
    private javax.swing.JButton CAssistantCancelBtn;
    private javax.swing.JButton CAssistantLoginBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}