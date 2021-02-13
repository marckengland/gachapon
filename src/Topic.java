
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marck England
 */
public class Topic extends javax.swing.JFrame {

    /**
     * Creates new form Gacha
     */
    public Topic() {
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
        back = new javax.swing.JLabel();
        choosetopic = new javax.swing.JLabel();
        logic = new javax.swing.JLabel();
        math = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gachapon");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Back button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        choosetopic.setBackground(new java.awt.Color(0, 0, 0));
        choosetopic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        choosetopic.setForeground(new java.awt.Color(255, 255, 255));
        choosetopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choosetopic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Topic/choosetopic.png"))); // NOI18N
        choosetopic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choosetopicMouseClicked(evt);
            }
        });
        jPanel1.add(choosetopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 690, 140));

        logic.setBackground(new java.awt.Color(0, 0, 0));
        logic.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logic.setForeground(new java.awt.Color(255, 255, 255));
        logic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Topic/LOGIC.png"))); // NOI18N
        logic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logicMouseClicked(evt);
            }
        });
        jPanel1.add(logic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 340, 180));

        math.setBackground(new java.awt.Color(0, 0, 0));
        math.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        math.setForeground(new java.awt.Color(255, 255, 255));
        math.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        math.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Topic/MATH.png"))); // NOI18N
        math.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mathMouseClicked(evt);
            }
        });
        jPanel1.add(math, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Topic/BG.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logicMouseClicked
       this.dispose();
       new logicDifficulty().setVisible(true);
    }//GEN-LAST:event_logicMouseClicked

    private void mathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mathMouseClicked
       this.dispose();
       new mathDifficulty().setVisible(true);
    }//GEN-LAST:event_mathMouseClicked

    private void choosetopicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosetopicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_choosetopicMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and dcurrencythe form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gacha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel choosetopic;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logic;
    private javax.swing.JLabel math;
    // End of variables declaration//GEN-END:variables
}
