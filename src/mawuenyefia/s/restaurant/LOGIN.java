/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mawuenyefia.s.restaurant;

import DOC.UserDoc;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import MODEL.User;


/**
 *
 * @author MAWUENYEFIA HUNORKPA
 */
public class LOGIN extends javax.swing.JFrame {

    // Email validation pattern: matches a wide range of valid email addresses.
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        btnLogin.setEnabled(false);// Disable login button initially
    }

    /**
     * Clears the email and password fields.
     */
    public void Clear() {
        TEXT_EMAIL.setText("");
        TEXT_PASSWORD.setText("");
        btnLogin.setEnabled(false);

    }

    /**
     * Validates the email and password fields. Enables the login button if both
     * fields are valid.
     */
    public void ValidateFields() {
        String email = TEXT_EMAIL.getText();
        String password = TEXT_PASSWORD.getText();
        if (email.matches(emailPattern) && !password.equals("")) {
            btnLogin.setEnabled(true);
        } else {
            btnLogin.setEnabled(false);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TEXT_EMAIL = new javax.swing.JTextField();
        TEXT_PASSWORD = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        TEXT_EMAIL.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TEXT_EMAIL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        TEXT_EMAIL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TEXT_EMAILKeyReleased(evt);
            }
        });
        getContentPane().add(TEXT_EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 269, 500, 40));

        TEXT_PASSWORD.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TEXT_PASSWORD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        TEXT_PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_PASSWORDActionPerformed(evt);
            }
        });
        TEXT_PASSWORD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TEXT_PASSWORDKeyReleased(evt);
            }
        });
        getContentPane().add(TEXT_PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 500, 40));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/login.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/clear.png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/exit small.png"))); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jButton4.setText("FORGOT PASSWORD ?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jButton5.setText("SIGN UP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 210, 130));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BY: MAWUENYEFIA");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 820, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/PHOTO16.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEXT_PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_PASSWORDActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // Retrieve email and password inputs
        String email = TEXT_EMAIL.getText();
        String password = new String(TEXT_PASSWORD.getPassword());
        User user = UserDoc.login(email, password);

        // Clear password field after retrieving the password
        if (user == null) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Username or Password</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            if (user.getStatus().equals("false")) {
                ImageIcon icon = new ImageIcon("src/POPUP_ICONS/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b>Wait for Admin's Approval</b></html>", "Message", JOptionPane.INFORMATION_MESSAGE, icon);
                Clear();
            } else if (user.getStatus().equals("true")) {
                setVisible(false);
                new HOME(email).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close the Application", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void TEXT_EMAILKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEXT_EMAILKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_TEXT_EMAILKeyReleased

    private void TEXT_PASSWORDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEXT_PASSWORDKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_TEXT_PASSWORDKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new FORGOT_PASSWORD().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SIGN_UP().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TEXT_EMAIL;
    private javax.swing.JPasswordField TEXT_PASSWORD;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
