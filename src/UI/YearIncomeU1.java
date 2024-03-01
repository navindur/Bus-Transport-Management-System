/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import java.sql.*;

/**
 *
 * @author MSII
 */
public class YearIncomeU1 extends javax.swing.JFrame {

    /**
     * Creates new form MonthlyIncomeUI
     */
    public YearIncomeU1() {
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
        jLabel4 = new javax.swing.JLabel();
        panelRound1 = new org.netbeans.modules.form.InvalidComponent();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bsy = new javax.swing.JTextField();
        bsy1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bmy = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Monthly Income View");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 204, 197));
        jLabel4.setText("Yearly Income View");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 340, -1));

        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bus Number :");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Year :");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 120, -1, -1));

        bsy.setBackground(new java.awt.Color(51, 51, 51));
        bsy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bsy.setForeground(new java.awt.Color(255, 255, 255));
        bsy.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelRound1.add(bsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 45, 120, -1));

        bsy1.setBackground(new java.awt.Color(51, 51, 51));
        bsy1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bsy1.setForeground(new java.awt.Color(255, 255, 255));
        bsy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsy1ActionPerformed(evt);
            }
        });
        panelRound1.add(bsy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 115, 120, -1));

        jToggleButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("All");
        panelRound1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 50, -1, 30));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/search (1).png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRound1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Income :");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 255, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Rs.");
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 255, -1, -1));

        bmy.setBackground(new java.awt.Color(51, 51, 51));
        bmy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bmy.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(bmy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 145, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Toggle for");
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 60, 20));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/3d-black-chart-finance-black-background_768719-330.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try (Connection conn2 = DBMC.vcon();
            Statement sr1 = conn2.createStatement()) {
            ResultSet rs2 = sr1.executeQuery(
                "SELECT SUM(Income(Rs.)) AS TotalIncome  FROM FinancialStatus WHERE Bus_No='" + bsy.getText() + "' AND Year(Date) ='" + bsy1.getText() + "'");

            if (rs2.next()) {
                bmy.setText(String.valueOf(rs2.getInt("TotalIncome")));
                // Alternatively, if you want to display the income as a string:
                // bsid.setText(rs1.getString("Income(Rs.)"));
            } else {
                bmy.setText("No data found");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // or log the exception
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bsy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsy1ActionPerformed

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
            java.util.logging.Logger.getLogger(YearIncomeU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YearIncomeU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YearIncomeU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YearIncomeU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YearIncomeU1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bmy;
    private javax.swing.JTextField bsy;
    private javax.swing.JTextField bsy1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private org.netbeans.modules.form.InvalidComponent panelRound1;
    // End of variables declaration//GEN-END:variables
}
