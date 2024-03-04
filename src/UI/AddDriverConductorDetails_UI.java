
package UI;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import Codes.DatabaseConnection;

/**
 *
 * @author kumar
 */
public class AddDriverConductorDetails_UI extends javax.swing.JFrame {

    /**
     * Creates new form AddDriverConductorDetails_UI
     */
    public AddDriverConductorDetails_UI() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new UI.Images.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(36, 36, 36));
        jPanel3.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(920, 560));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 204, 197));
        jLabel2.setText("Add Driver/ Conductor Details");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Full Name");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Contact No. (Mobile)");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("NIC No.");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Contact No. (Fixed)");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Password");
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Date of Birth");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 23, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Work as a");
        panelRound1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 160, -1));

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 160, -1));

        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 160, -1));

        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 160, -1));

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driver", "Conductor" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        jTextField6.setBackground(new java.awt.Color(51, 51, 51));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 160, -1));

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/VectorPlus.png"))); // NOI18N
        jButton3.setText("Submit");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Reset All");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("YYYY-MM-DD");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 58, 120, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("License no.");
        panelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 143, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Registration no.");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Username");
        panelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jTextField8.setBackground(new java.awt.Color(51, 51, 51));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 160, -1));

        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, -1));

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 160, -1));

        jCheckBox1.setText("Show");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        panelRound1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 300, -1, -1));

        datePicker1.setBackground(new java.awt.Color(255, 255, 255));
        datePicker1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        panelRound1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 190, 30));

        jPanel3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 830, 380));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/3d-black-chart-finance-black-background_768719-330.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(920, 560));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Get the password as a char array
        char[] passwordChars = jPasswordField1.getPassword();
        // Get the selected item from the JComboBox
        String selectedValue = jComboBox1.getSelectedItem().toString();

        // Convert the char array to a String
        String password = new String(passwordChars);
        try {
            
            
            // Define the SQL query for inserting income data
            String AddDriverConductorDetails_UI = "Insert into Employee (FullName, NIC, License_No, Registration_No, DOB, Mobile_No, Landline_No, `Work as a`, Username, Password) values (?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DatabaseConnection.getConnection();
          
            PreparedStatement pstmt = conn.prepareStatement(AddDriverConductorDetails_UI);
            
            pstmt.setString(1, jTextField1.getText());
            pstmt.setString(2, jTextField3.getText());
            pstmt.setString(3, jTextField5.getText());
            pstmt.setString(4, jTextField8.getText());
            pstmt.setString(5, datePicker1.getDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
            pstmt.setString(6, jTextField6.getText());
            pstmt.setString(7, jTextField7.getText());
            pstmt.setString(8, selectedValue);
            pstmt.setString(9, jTextField9.getText());
            pstmt.setString(10, password);
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record added successfully.", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
            
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField5.setText("");
                jTextField8.setText("");
                datePicker1.setDate(null);
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField9.setText("");
                jPasswordField1.setText("");
            
            }catch (SQLException e) {
            // Show an error message for database-related exceptions
            JOptionPane.showMessageDialog(this, e, "Exception Occured", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
        // Show the password
        jPasswordField1.setEchoChar((char) 0); // Set echo char to 0 to show characters
    } else {
        // Hide the password
        jPasswordField1.setEchoChar('*'); // Set echo char to * to hide characters
    }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField5.setText("");
                jTextField8.setText("");
                datePicker1.setDate(null);
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField9.setText("");
                jPasswordField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddDriverConductorDetails_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private UI.Images.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
