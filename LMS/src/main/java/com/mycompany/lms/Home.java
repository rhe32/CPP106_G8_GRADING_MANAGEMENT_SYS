/*  Group 8
    October 21, 2024
    2CpE-A
*/

package com.mycompany.lms;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        M_grades = new javax.swing.JTextField();
        F_grades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblaverage1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblrating = new javax.swing.JLabel();
        calc2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        P_grades = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Midterm");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Finals");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel5.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 266, -1));
        jPanel5.add(M_grades, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 266, -1));

        F_grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_gradesActionPerformed(evt);
            }
        });
        jPanel5.add(F_grades, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 266, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Average");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblaverage1.setForeground(new java.awt.Color(255, 255, 255));
        lblaverage1.setText("Average");
        jPanel5.add(lblaverage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rating");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblrating.setForeground(new java.awt.Color(255, 255, 255));
        lblrating.setText("Rating");
        jPanel5.add(lblrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        calc2.setBackground(new java.awt.Color(0, 0, 204));
        calc2.setForeground(new java.awt.Color(255, 255, 255));
        calc2.setText("calculate");
        calc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc2ActionPerformed(evt);
            }
        });
        jPanel5.add(calc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Prelim");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 28));

        P_grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_gradesActionPerformed(evt);
            }
        });
        jPanel5.add(P_grades, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 266, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Name");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 28));

        Save.setBackground(new java.awt.Color(0, 0, 204));
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel5.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel5.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 350, 280));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel11.setText("View Grades");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 28));

        jLabel16.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel16.setText("Input Grades");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 28));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Average", "Ratings"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 380, 280));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rhdnp\\Downloads\\Home.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void F_gradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_gradesActionPerformed

    }//GEN-LAST:event_F_gradesActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

    }//GEN-LAST:event_NameActionPerformed

    private void calc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc2ActionPerformed

        double prelims, midterm, finals, sum, avg;
        String grade;
        prelims = Integer.parseInt(P_grades.getText());
        midterm = Integer.parseInt(M_grades.getText());
        finals = Integer.parseInt(F_grades.getText());
        
        sum = prelims + midterm + finals;
        avg = sum/3;
        
        
        
        
        if(avg >= 90){
            grade = "Excellent";
        } else if(avg >= 80){
            grade = "Satisfactory";
        } else if (avg >= 70){
            grade = "Good";
        } else if (avg >= 60){
            grade = "Passed";
        } else{
            grade = "Failed";
        }
        
        JOptionPane.showMessageDialog(null, "Calculated Successfully");
        lblaverage1.setText(String.valueOf(avg));
        lblrating.setText(grade);
    }//GEN-LAST:event_calc2ActionPerformed

    private void P_gradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_gradesActionPerformed

    }//GEN-LAST:event_P_gradesActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        JOptionPane.showMessageDialog(null, "Added Successfully");
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        table.addRow(new Object[]{Name.getText(), lblaverage1.getText(),lblrating.getText()});
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow != -1) {
        // Confirm deletion
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to drop this student?", "Confirm Drop", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            // Remove the selected row from the table
            model.removeRow(selectedRow);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a student to drop.", "No Selection", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_DeleteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField F_grades;
    private javax.swing.JTextField M_grades;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField P_grades;
    private javax.swing.JButton Save;
    private javax.swing.JButton calc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblaverage1;
    private javax.swing.JLabel lblrating;
    // End of variables declaration//GEN-END:variables
}
