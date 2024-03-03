/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import Codes.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
public class ViewDriverConductorDetails_UI extends javax.swing.JFrame {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/busmanagement";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    /**
     * Creates new form ViewDriverConductorDetails_UI
     */
    public ViewDriverConductorDetails_UI() {
        initComponents();
        displayData();
    }

    private void displayData() {

        try {
            // Connect to the database
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Query to retrieve data from the table
            String query = "SELECT * FROM Employee";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            // Populate the table with data
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing data

            while (resultSet.next()) {
                Object[] row = {
                    //resultSet.getDate("Date"),
                    resultSet.getString("FullName"),
                    resultSet.getString("NIC"),
                    resultSet.getString("Registration_No"),
                    resultSet.getString("License_No"),
                    resultSet.getDate("DOB"),
                    resultSet.getString("Mobile_No"),
                    resultSet.getString("Landline_No"),
                    resultSet.getString("Work as a"),
                    resultSet.getString("Username"),
                    resultSet.getString("Password"),};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to fetch data from the database");
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Builds the SQL query based on the provided search criteria.
     *
     * @param searchText1 Name search text
     * @param searchText2 Registration No search text
     * @param selectedPosition Selected position from the dropdown
     * @return The constructed SQL query string
     */
    private String buildQuery(String searchText1, String searchText2, String selectedPosition) {
        StringBuilder query = new StringBuilder("SELECT * FROM Employee");
        boolean hasWhereClause = false;

        if (!searchText1.isEmpty()) {
            query.append(" WHERE FullName LIKE ?"); // Use LIKE operator for partial name matching
            hasWhereClause = true;
        }

        if (!searchText2.isEmpty()) {
            if (hasWhereClause) {
                query.append(" AND ");
            } else {
                query.append(" WHERE ");
                hasWhereClause = true;
            }
            query.append("Registration_No LIKE ?"); // Use LIKE operator for partial registration number matching
        }

        if (!selectedPosition.equals("None")) {
            if (hasWhereClause) {
                query.append(" AND ");
            } else {
                query.append(" WHERE ");
                hasWhereClause = true;
            }
            query.append("`Work as a` = ?"); // Use exact comparison for position
        }
        return query.toString();
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
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 204, 197));
        jLabel2.setText("View Driver/ Conductor Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Name :");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 25, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Reg. No. :");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panelRound1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 25, 160, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Field :");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Driver", "Conductor" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 25, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/search (1).png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "NIC No.", "Reg. No.", "License No.", "Date of Birth", "Contact (Mobile)", "Contact (Fixed)", "Work as a"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 850, 140));

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/VectorPlus.png"))); // NOI18N
        jButton3.setText("Add New");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        deleteButton.setBackground(new java.awt.Color(242, 242, 242));
        deleteButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/VectorMinus.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        panelRound1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/change.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 890, 360));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/BackWithBoarder.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 100, 35));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Name icon.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Black Back.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(966, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String searchText1 = jTextField1.getText(); // Name
        String searchText2 = jTextField2.getText(); // Registration No
        String selectedPosition = (String) jComboBox1.getSelectedItem(); // Selected position

        try (
                Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(buildQuery(searchText1, searchText2, selectedPosition))) {

            int parameterIndex = 1;
            if (!searchText1.isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + searchText1 + "%"); // Add wildcards for LIKE operator
            }
            if (!searchText2.isEmpty()) {
                preparedStatement.setString(parameterIndex++, "%" + searchText2 + "%"); // Add wildcards for LIKE operator
            }
            if (!selectedPosition.equals("None")) {
                preparedStatement.setString(parameterIndex++, selectedPosition);
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing data before populating

            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getString("FullName"),
                    resultSet.getString("NIC"),
                    resultSet.getString("Registration_No"),
                    resultSet.getString("License_No"),
                    resultSet.getDate("DOB"),
                    resultSet.getString("Mobile_No"),
                    resultSet.getString("Landline_No"),
                    resultSet.getString("Work as a"),
                    resultSet.getString("Username"),
                    resultSet.getString("Password")
                };
                model.addRow(row);
            }

        } catch (SQLException e) { // Catch and handle SQL exceptions
            System.err.println("Error during search: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "An error occurred while performing the search. Please try again later.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddDriverConductorDetails_UI addDriverConductor = new AddDriverConductorDetails_UI();
        addDriverConductor.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/BackWithBoarder2.png")));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/BackWithBoarder.png")));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Ownerdashboard ownerDashboard = new Ownerdashboard();
        ownerDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            // Get bus number from selected row
            String FullName = jTable1.getValueAt(selectedRow, 0).toString();
            // Confirm deletion with user
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete Employee: " + FullName, "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    // Get database connection
                    //Connection connection = DatabaseConnection.getConnection();
                    connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
                    // Prepare SQL query to delete bus
                    String sql = "DELETE FROM Employee WHERE FullName = ?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    // Set bus number in query
                    statement.setString(1, FullName);
                    // Execute query and check affected rows
                    int rowsAffected = statement.executeUpdate();

                    if (rowsAffected > 0) {
                        displayData(); // Refresh table data
                        JOptionPane.showMessageDialog(this, "Employee deleted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete employee.");
                    }

                    // Close resources
                    statement.close();
                    //                    connection.close();
                } catch (SQLException e) { // Handle database errors
                    JOptionPane.showMessageDialog(this, "Error deleting employee data: " + e.getMessage());
                }
            }
        } else { // Inform user if no bus is selected
            JOptionPane.showMessageDialog(this, "Please select a employee to delete.");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        displayData();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDriverConductorDetails_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDriverConductorDetails_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private UI.Images.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
