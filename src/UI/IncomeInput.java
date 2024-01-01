/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author kumar
 */
public class IncomeInput extends javax.swing.JFrame {

    /**
     * Creates new form incomeInput
     */
    public IncomeInput() {
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

        jPanel14 = new javax.swing.JPanel();
        panelRound2 = new UI.Images.PanelRound();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel11 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new UI.Images.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Income Input");
        setPreferredSize(new java.awt.Dimension(950, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(950, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(217, 150));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Bus Number:");
        jLabel9.setPreferredSize(new java.awt.Dimension(67, 16));
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, 110, 35));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 9, 120, 30));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 50));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("YYYY-MM-DD");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 40, 120, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Date:");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 35));

        jFormattedTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jFormattedTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jPanel10.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 10, 120, 30));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 60));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel11.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 11, 60, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Turn:");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, 110, 35));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFormattedTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jFormattedTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jPanel12.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 8, 120, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Income:");
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 72, 35));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Rs.");
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 6, 30, 35));

        jPanel8.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 50));

        panelRound2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 260));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/VectorPlus.png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelRound2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 275, 120, 50));

        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/VectorBack.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelRound2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 50, 50));

        jPanel14.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 360, 390));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(100, 204, 197));
        jLabel15.setText("Income Input");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 35, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Input Income_title.png"))); // NOI18N
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jLabel7);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/image_incomeInput.jpg"))); // NOI18N
        panelRound1.add(jLabel2);

        jPanel14.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 320, 320));

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IncomeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IncomeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IncomeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IncomeInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Handle any exceptions that may occur
            e.printStackTrace();
        }
//        
//        FlatLightLaf.setup();
//        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    private UI.Images.PanelRound panelRound1;
    private UI.Images.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
