/*  Group 8
    October 21, 2024
    2CpE-A
*/

package com.mycompany.lms;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        user_Label = new javax.swing.JLabel();
        pass_Label = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 0, 153));
        Header.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setText("Welcome!");
        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 290, 70));

        user_Label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        user_Label.setForeground(new java.awt.Color(255, 255, 255));
        user_Label.setText("Username");
        getContentPane().add(user_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        pass_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass_Label.setForeground(new java.awt.Color(255, 255, 255));
        pass_Label.setText("Password");
        getContentPane().add(pass_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        Username.setBackground(new java.awt.Color(51, 153, 255));
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setBorder(null);
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 252, 260, 40));

        Password.setBackground(new java.awt.Color(51, 153, 255));
        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 260, 40));

        login.setBackground(new java.awt.Color(0, 51, 204));
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 433, 270, 50));

        Background.setBackground(new java.awt.Color(102, 153, 255));
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\rhdnp\\Downloads\\login.jpg")); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        //default values of login
        String admin = "Admin"; 
        String pssword = "Administrator";
        
        // variable for login entry
        String user = Username.getText();
        String pass = Password.getText();
        
        if(user.equals(admin) && pass.equals(pssword)){
            JOptionPane.showMessageDialog(null, "Login Successfull");
            Home home = new Home();
            setVisible(false);
            home.setVisible(true);} 
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Credentials", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Header;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton login;
    private javax.swing.JLabel pass_Label;
    private javax.swing.JLabel user_Label;
    // End of variables declaration//GEN-END:variables
}
