
package UI;

import Codes.DatabaseConnection;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author kumar
 */
public class AddNewBusDetails_UI extends javax.swing.JFrame {

    /**
     * Creates new form AddNewBusDetails_UI
     */
    public AddNewBusDetails_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new UI.Images.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 204, 197));
        jLabel2.setText("Add Bus Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Bus Registration No.");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Bus Chassis No.");
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 97, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Adding Mileage");
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Next Service Mileage");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 223, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 34, 160, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 97, 160, -1));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField10.setBackground(new java.awt.Color(51, 51, 51));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 155, 160, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField11.setBackground(new java.awt.Color(51, 51, 51));
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 220, 160, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Registraion Date");
        panelRound1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Bus Model");
        panelRound1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 100, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ashok Leyland", "TATA Motors", "SML Isuzu", "Mitsubishi Fuso" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panelRound1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 97, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Last Service Date");
        panelRound1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 160, -1, -1));

        resetButton.setText("Reset All");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        panelRound1.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/VectorPlus.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBackground(new java.awt.Color(242, 242, 242));
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(51, 51, 51));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        panelRound1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 283, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Next Service Date");
        panelRound1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 223, -1, -1));

        datePicker1.setBackground(new java.awt.Color(255, 255, 255));
        datePicker1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        panelRound1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        datePicker2.setBackground(new java.awt.Color(255, 255, 255));
        datePicker2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        panelRound1.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        datePicker3.setBackground(new java.awt.Color(255, 255, 255));
        datePicker3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        panelRound1.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 225, -1, -1));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 810, 380));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/3d-black-chart-finance-black-background_768719-330.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
       
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String busRegistrationNo = jTextField6.getText();

        String registrationDate = datePicker1.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE);
        String busChassisNo = jTextField9.getText();
        String busModel = (String) jComboBox2.getSelectedItem();
        String addingMileage = jTextField10.getText();

        String lastServiceDate = datePicker2.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE);
        String nextServiceMileage = jTextField11.getText();

        String nextServiceDate = datePicker3.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE);

        // Validate input
        if (busRegistrationNo.isEmpty() || registrationDate.isEmpty() || busChassisNo.isEmpty() || busModel.isEmpty() || addingMileage.isEmpty() || lastServiceDate.isEmpty() || nextServiceMileage.isEmpty() || nextServiceDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        // Connect to database and insert data
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO Bus (Bus_No, RegistrationDate, Chassis_No, Model, AddingMileage, LastServiceDate, NextServiceMileage, NextServiceDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, busRegistrationNo);

            statement.setString(2, registrationDate);
            statement.setString(3, busChassisNo);

            statement.setString(4, busModel);
            statement.setInt(5, Integer.parseInt(addingMileage));

            statement.setString(6, lastServiceDate);
            statement.setInt(7, Integer.parseInt(nextServiceMileage));
            statement.setString(8, nextServiceDate);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Bus details added successfully!");
           

            } else {
                JOptionPane.showMessageDialog(this, "Failed to add bus details.");
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Occured! " + e.getMessage());
        } catch (NumberFormatException e) { // Handle potential number format exceptions for integer fields
            JOptionPane.showMessageDialog(this, "Invalid number format in mileage fields.");
        } catch (IllegalArgumentException ie) {
            JOptionPane.showMessageDialog(this, "Date should be in valid format.");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

    }//GEN-LAST:event_jTextField10ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // Clear TextFields
        jTextField6.setText("");
        jTextField9.setText("");
        jComboBox2.setSelectedIndex(0);
        jTextField10.setText("");
        jTextField11.setText("");
        datePicker1.clear();
        datePicker2.clear();
        datePicker3.clear();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
      
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewBusDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBusDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBusDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBusDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddNewBusDetails_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private UI.Images.PanelRound panelRound1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
