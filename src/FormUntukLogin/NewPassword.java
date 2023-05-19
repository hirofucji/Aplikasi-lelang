
package FormUntukLogin;
import connecction.connect;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ALYA
 */
public class NewPassword extends javax.swing.JFrame {
    
    String InputUsername, InputPassword, InputConfirmPassword;

    PreparedStatement pst; 
    ResultSet set; 
    /**
     * Creates new form NewPassword
     */
    public NewPassword() {
        initComponents();
        fieldPassword.setVisible(false);
        fieldConfirmBaru.setVisible(false);
        buttonGantiPassword.setVisible(false);
        labelpasswordnotmatch.setVisible(false);
        
        
        getContentPane().setBackground(Color.white);
        
        
    }
    
    public void komponen(){
        InputUsername = fieldUsername.getText().trim(); 
        InputPassword = fieldPassword.getText().trim();
        InputConfirmPassword = fieldConfirmBaru.getText().trim();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound_11 = new LoginPage.PanelRound_1();
        fieldUsername = new textfield.TextField();
        fieldPassword = new textfield.TextField();
        fieldConfirmBaru = new textfield.TextField();
        buttonGantiPassword = new button.Button();
        buttonGantiPassword1 = new button.Button();
        labelpasswordnotmatch = new javax.swing.JLabel();
        labelUsernameError = new javax.swing.JLabel();
        panelRound_12 = new LoginPage.PanelRound_1();
        panelRound_13 = new LoginPage.PanelRound_1();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound_14 = new LoginPage.PanelRound_1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound_11.setBackground(new java.awt.Color(38, 71, 136));
        panelRound_11.setRoundBottomLeft(50);
        panelRound_11.setRoundBottomRight(50);
        panelRound_11.setRoundTopLeft(50);
        panelRound_11.setRoundTopRight(50);

        fieldUsername.setLabelText("Ketikan username");
        fieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldUsernameKeyTyped(evt);
            }
        });

        fieldPassword.setLabelText("Ketikan Password baru");
        fieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldPasswordKeyReleased(evt);
            }
        });

        fieldConfirmBaru.setLabelText("Konfirmasi Password");
        fieldConfirmBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldConfirmBaruActionPerformed(evt);
            }
        });
        fieldConfirmBaru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldConfirmBaruKeyPressed(evt);
            }
        });

        buttonGantiPassword.setBackground(new java.awt.Color(255, 1, 91));
        buttonGantiPassword.setForeground(new java.awt.Color(255, 255, 255));
        buttonGantiPassword.setText("Ganti Password");
        buttonGantiPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonGantiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGantiPasswordActionPerformed(evt);
            }
        });

        buttonGantiPassword1.setBackground(new java.awt.Color(255, 1, 91));
        buttonGantiPassword1.setForeground(new java.awt.Color(255, 255, 255));
        buttonGantiPassword1.setText("Lanjutkan");
        buttonGantiPassword1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonGantiPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGantiPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound_11Layout = new javax.swing.GroupLayout(panelRound_11);
        panelRound_11.setLayout(panelRound_11Layout);
        panelRound_11Layout.setHorizontalGroup(
            panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_11Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound_11Layout.createSequentialGroup()
                        .addComponent(labelUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGantiPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldConfirmBaru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound_11Layout.createSequentialGroup()
                        .addComponent(labelpasswordnotmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGantiPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelRound_11Layout.setVerticalGroup(
            panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_11Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGantiPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(fieldConfirmBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelRound_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound_11Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(buttonGantiPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound_11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelpasswordnotmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, -1, -1));

        panelRound_12.setBackground(new java.awt.Color(38, 71, 136));
        panelRound_12.setRoundBottomRight(30);
        panelRound_12.setRoundTopRight(30);

        javax.swing.GroupLayout panelRound_12Layout = new javax.swing.GroupLayout(panelRound_12);
        panelRound_12.setLayout(panelRound_12Layout);
        panelRound_12Layout.setHorizontalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelRound_12Layout.setVerticalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(panelRound_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 690));

        panelRound_13.setBackground(new java.awt.Color(38, 71, 136));
        panelRound_13.setRoundBottomLeft(30);
        panelRound_13.setRoundTopLeft(30);

        javax.swing.GroupLayout panelRound_13Layout = new javax.swing.GroupLayout(panelRound_13);
        panelRound_13.setLayout(panelRound_13Layout);
        panelRound_13Layout.setHorizontalGroup(
            panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        panelRound_13Layout.setVerticalGroup(
            panelRound_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(panelRound_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 170, 130, 690));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 1, 91));
        jLabel1.setText("GANTI USERNAME & PASSWORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 71, 136));
        jLabel2.setText("PETUGAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 180, -1, -1));

        panelRound_14.setBackground(new java.awt.Color(38, 71, 136));
        panelRound_14.setRoundBottomLeft(30);
        panelRound_14.setRoundBottomRight(30);
        panelRound_14.setRoundTopLeft(30);
        panelRound_14.setRoundTopRight(30);

        javax.swing.GroupLayout panelRound_14Layout = new javax.swing.GroupLayout(panelRound_14);
        panelRound_14.setLayout(panelRound_14Layout);
        panelRound_14Layout.setHorizontalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelRound_14Layout.setVerticalGroup(
            panelRound_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelRound_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 860, 300, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernameKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fieldUsernameKeyTyped

    private void fieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernameKeyReleased
       
    }//GEN-LAST:event_fieldUsernameKeyReleased

    private void buttonGantiPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGantiPassword1ActionPerformed
      komponen();
        try {
           String sql = "select * from tb_petugas join tb_level using(id_level) where tb_level.level='Petugas'"; 
           this.pst = connect.connectDB().prepareStatement(sql); 
           this.set = pst.executeQuery(); 
           if(set.next()){
              
               if(InputUsername.equals(set.getString("username"))){
                   fieldPassword.setVisible(true);
                   fieldConfirmBaru.setVisible(true);
                   buttonGantiPassword.setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null, "Username " + InputUsername + " Tidak ditemukan!", "Pesan Dari Admin", JOptionPane.INFORMATION_MESSAGE);
               }
           }
           
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_buttonGantiPassword1ActionPerformed

    private void fieldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordKeyReleased
     
        System.out.println(InputPassword);

    }//GEN-LAST:event_fieldPasswordKeyReleased

    private void fieldConfirmBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldConfirmBaruActionPerformed
   
        
    }//GEN-LAST:event_fieldConfirmBaruActionPerformed

    private void buttonGantiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGantiPasswordActionPerformed
   
        komponen();
        
        if(InputPassword.equals(InputConfirmPassword)){
           int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Mengubahnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
           if(konfirmasi==0){
               try {
                     String sql = "update tb_petugas set password=? where username=?";
                this.pst = connect.connectDB().prepareStatement(sql);
                this.pst.setString(1, InputPassword);
                this.pst.setString(2, InputUsername);
                this.pst.executeUpdate();  
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Pesan Dari Admin", JOptionPane.INFORMATION_MESSAGE);
                new formPetugas().setVisible(true);
               } catch (Exception e) {
               }
           } 
           
        }else if(!InputPassword.equals(InputConfirmPassword)){
            JOptionPane.showMessageDialog(null, "Password Tidak sama");
        }
     

        
    }//GEN-LAST:event_buttonGantiPasswordActionPerformed

    private void fieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            fieldPassword.requestFocus();
        komponen();
        try {
           String sql = "select * from tb_petugas join tb_level using(id_level) where tb_level.level='Petugas'"; 
           this.pst = connect.connectDB().prepareStatement(sql); 
           this.set = pst.executeQuery(); 
           if(set.next()){
              
               if(InputUsername.equals(set.getString("username"))){
                   fieldPassword.setVisible(true);
                   fieldConfirmBaru.setVisible(true);
                   buttonGantiPassword.setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null, "Username " + InputUsername + " Tidak ditemukan!", "Pesan Dari Admin", JOptionPane.INFORMATION_MESSAGE);
               }
           }
           
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_fieldUsernameKeyPressed

    private void fieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordKeyPressed
        if(evt.getKeyCode() ==KeyEvent.VK_ENTER){
            fieldConfirmBaru.requestFocus();
        }
    }//GEN-LAST:event_fieldPasswordKeyPressed

    private void fieldConfirmBaruKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldConfirmBaruKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        komponen();
        
        if(InputPassword.equals(InputConfirmPassword)){
           int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Untuk Mengubahnya?", "Silahkan Pilih ", JOptionPane.YES_NO_OPTION);
           if(konfirmasi==0){
               try {
                     String sql = "update tb_petugas set password=? where username=?";
                this.pst = connect.connectDB().prepareStatement(sql);
                this.pst.setString(1, InputPassword);
                this.pst.setString(2, InputUsername);
                this.pst.executeUpdate();  
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Pesan Dari Admin", JOptionPane.INFORMATION_MESSAGE);
                new formPetugas().setVisible(true);
               } catch (Exception e) {
               }
           } 
           
        }else if(!InputPassword.equals(InputConfirmPassword)){
            JOptionPane.showMessageDialog(null, "Password Tidak sama");
        }
     
        }
        
    }//GEN-LAST:event_fieldConfirmBaruKeyPressed

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
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button buttonGantiPassword;
    private button.Button buttonGantiPassword1;
    private textfield.TextField fieldConfirmBaru;
    private textfield.TextField fieldPassword;
    private textfield.TextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelUsernameError;
    private javax.swing.JLabel labelpasswordnotmatch;
    private LoginPage.PanelRound_1 panelRound_11;
    private LoginPage.PanelRound_1 panelRound_12;
    private LoginPage.PanelRound_1 panelRound_13;
    private LoginPage.PanelRound_1 panelRound_14;
    // End of variables declaration//GEN-END:variables



}