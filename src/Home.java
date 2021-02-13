
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marck England
 */
public class Home extends javax.swing.JFrame {

    File file = new File("C:\\Users\\Marck England\\Downloads");
    int ln;
    
    /*static int hScore = 0;
    static int tokenEarn = 0;*/
    
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
 
    public String userName = Main.user.getText();
    
    public Home() {
        initComponents();
        profileBG.setBackground(new Color(129,141,182,100));
        charBG.setBackground(new Color(129,141,182,100));
        
        
        name.setText(""+userName);
        
        /*int allScore = hScore;
        int allTokens = tokenEarn + 10000;
        
        highScore.setText(""+allScore);
        tokens.setText(""+allTokens);*/       
        getST();
    }
    
     public void getST(){
         DBConnection connectNow = new DBConnection();
	 Connection connectDB = connectNow.getConnection();
         
         String getTokens = "SELECT tokens,atscore FROM gachaponacc WHERE user= '" + userName + "'";
         
         try{
             Statement statement = connectDB.createStatement();
             ResultSet queryResult = statement.executeQuery(getTokens);
             if(queryResult.next()){
                int gT = queryResult.getInt("tokens");
                int gS = queryResult.getInt("atscore");
		tokens.setText(""+gT);
                highScore.setText(""+gS);
             } 
             else{
		System.out.println("Invalid");
			}
         }catch(Exception ex){
             
         }
     }

    /*void login(String usr,String pswd){
        try {
            RandomAccessFile accessFile = new RandomAccessFile(file+"\\logins.txt", "rw");
            for(int i=0;i<ln;i+=4){System.out.println("count "+i);
            
                String forUser = accessFile.readLine().substring(9);
                String forPswd = accessFile.readLine().substring(9);
                if(usr.equals(forUser) & pswd.equals(forPswd)){
                    this.dispose();
                    new Home().setVisible(true);
                    break;
                }else if(i==(ln-3)){
                    JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                    break;
                }
                // if you are using user & passwword without email
                // then dont forget to replace  k<=2 with k=2 below
                for(int k=1;k<=2;k++){
                    accessFile.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tokens = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rankings = new javax.swing.JLabel();
        quiz = new javax.swing.JLabel();
        gacha = new javax.swing.JLabel();
        shop = new javax.swing.JLabel();
        profileBG = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        currentRank = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        highScore = new javax.swing.JLabel();
        alltimeScore = new javax.swing.JLabel();
        charBG = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        charModel = new javax.swing.JLabel();
        homeBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gachapon");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tokens.setBackground(new java.awt.Color(0, 0, 0));
        tokens.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        tokens.setForeground(new java.awt.Color(255, 255, 255));
        tokens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tokens.setText("0");
        getContentPane().add(tokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 70, -1));

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/tokens.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rankings.setBackground(new java.awt.Color(153, 204, 255));
        rankings.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rankings.setForeground(new java.awt.Color(255, 255, 255));
        rankings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rankings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Leaderboards/Leaderboards.png"))); // NOI18N
        rankings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankingsMouseClicked(evt);
            }
        });
        jPanel1.add(rankings, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 410, 130));

        quiz.setBackground(new java.awt.Color(153, 204, 255));
        quiz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quiz.setForeground(new java.awt.Color(255, 255, 255));
        quiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz.png"))); // NOI18N
        quiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quizMouseClicked(evt);
            }
        });
        jPanel1.add(quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 390, 160));

        gacha.setBackground(new java.awt.Color(153, 204, 255));
        gacha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gacha.setForeground(new java.awt.Color(255, 255, 255));
        gacha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gacha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Gacha.png"))); // NOI18N
        gacha.setText("GACHA");
        gacha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gachaMouseClicked(evt);
            }
        });
        jPanel1.add(gacha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 400, -1));

        shop.setBackground(new java.awt.Color(153, 204, 255));
        shop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        shop.setForeground(new java.awt.Color(255, 255, 255));
        shop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Shop.png"))); // NOI18N
        shop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopMouseClicked(evt);
            }
        });
        jPanel1.add(shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 390, 170));

        profileBG.setBackground(new java.awt.Color(204, 204, 255));
        profileBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        profileBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Barbara");
        profileBG.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        nameLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name:");
        profileBG.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        currentRank.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 14)); // NOI18N
        currentRank.setForeground(new java.awt.Color(255, 255, 255));
        currentRank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentRank.setText("Rankings: Unranked");
        profileBG.add(currentRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/barbara.png"))); // NOI18N
        icon.setToolTipText("");
        jPanel2.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        profileBG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        highScore.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 21)); // NOI18N
        highScore.setForeground(new java.awt.Color(255, 255, 255));
        highScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        highScore.setText("0");
        profileBG.add(highScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, -1));

        alltimeScore.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 22)); // NOI18N
        alltimeScore.setForeground(new java.awt.Color(255, 255, 255));
        alltimeScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alltimeScore.setText("ALL-TIME SCORE");
        profileBG.add(alltimeScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jPanel1.add(profileBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 110));

        charBG.setBackground(new java.awt.Color(204, 204, 255));
        charBG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        charBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/logoutBtn.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        charBG.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 40));

        charModel.setBackground(new java.awt.Color(204, 204, 255));
        charModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        charModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/2dchar.png"))); // NOI18N
        charBG.add(charModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 440));

        jPanel1.add(charBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 440));

        homeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/bg.png"))); // NOI18N
        jPanel1.add(homeBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rankingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankingsMouseClicked
       this.dispose();
       new Leaderboards().setVisible(true);
    }//GEN-LAST:event_rankingsMouseClicked

    private void shopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopMouseClicked
       this.dispose();
       new Shop().setVisible(true);
    }//GEN-LAST:event_shopMouseClicked

    private void gachaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gachaMouseClicked
       this.dispose();
       new Gacha().setVisible(true);
    }//GEN-LAST:event_gachaMouseClicked

    private void quizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizMouseClicked
       this.dispose();
       new Topic().setVisible(true);
    }//GEN-LAST:event_quizMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       this.dispose();
       new Main().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alltimeScore;
    private javax.swing.JPanel charBG;
    private javax.swing.JLabel charModel;
    private javax.swing.JLabel currentRank;
    private javax.swing.JLabel gacha;
    public static javax.swing.JLabel highScore;
    private javax.swing.JLabel homeBG;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    public static javax.swing.JLabel name;
    public static javax.swing.JLabel nameLabel;
    private javax.swing.JPanel profileBG;
    private javax.swing.JLabel quiz;
    private javax.swing.JLabel rankings;
    private javax.swing.JLabel shop;
    public static javax.swing.JLabel tokens;
    // End of variables declaration//GEN-END:variables
}
