/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormUntukLogin;

import connecction.connect;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import passwordfield.MD5;

/**
 *
 * @author ALYA
 */
public class MembuatAkunPetugas extends javax.swing.JFrame {
    String IDPetugas, namaPetugas, usernamePetugas, passwordPetugas; 
    
    ResultSet set;
    PreparedStatement pst;

    /**
     * Creates new form MembuatAkunPetugas
     */
    public MembuatAkunPetugas() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(MAXIMIZED_BOTH);
        autoNumberPetugas();
         fieldPasswordPetugas.setVisible(false);
        labelError.setVisible(false);
        fieldPasswordPetugas.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelRound_12 = new LoginPage.PanelRound_1();
        panelRound_23 = new LoginPage.PanelRound_1();
        jLabel9 = new javax.swing.JLabel();
        fieldIDPetugas = new textfield.TextField();
        fieldNamaPetugas = new textfield.TextField();
        fieldUsernamePetugas = new textfield.TextField();
        fieldPasswordPetugas = new textfield.TextField();
        ButtonSimpanAkun = new button.Button();
        labelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormUntukLogin/user (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 360));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("<html>MEMBUAT AKUN PETUGAS</html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 380, -1));

        panelRound_12.setBackground(new java.awt.Color(255, 60, 124));

        panelRound_23.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_23.setRoundBottomLeft(50);
        panelRound_23.setRoundBottomRight(50);
        panelRound_23.setRoundTopLeft(50);
        panelRound_23.setRoundTopRight(50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormUntukLogin/profile-user.png"))); // NOI18N

        fieldIDPetugas.setLabelText("ID Petugas");
        fieldIDPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldIDPetugasKeyReleased(evt);
            }
        });

        fieldNamaPetugas.setLabelText("Nama Anda");
        fieldNamaPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaPetugasActionPerformed(evt);
            }
        });
        fieldNamaPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNamaPetugasKeyPressed(evt);
            }
        });

        fieldUsernamePetugas.setLabelText("Username");
        fieldUsernamePetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsernamePetugasActionPerformed(evt);
            }
        });
        fieldUsernamePetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldUsernamePetugasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUsernamePetugasKeyReleased(evt);
            }
        });

        fieldPasswordPetugas.setLabelText("Password");
        fieldPasswordPetugas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPasswordPetugasKeyPressed(evt);
            }
        });

        ButtonSimpanAkun.setBackground(new java.awt.Color(0, 51, 255));
        ButtonSimpanAkun.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSimpanAkun.setText("Buat Akun");
        ButtonSimpanAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanAkunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound_23Layout = new javax.swing.GroupLayout(panelRound_23);
        panelRound_23.setLayout(panelRound_23Layout);
        panelRound_23Layout.setHorizontalGroup(
            panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_23Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_23Layout.createSequentialGroup()
                        .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPasswordPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldIDPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldNamaPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldUsernamePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound_23Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(208, 208, 208))))
            .addGroup(panelRound_23Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(ButtonSimpanAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound_23Layout.setVerticalGroup(
            panelRound_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(fieldIDPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(fieldNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(fieldUsernamePetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPasswordPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonSimpanAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        javax.swing.GroupLayout panelRound_12Layout = new javax.swing.GroupLayout(panelRound_12);
        panelRound_12.setLayout(panelRound_12Layout);
        panelRound_12Layout.setHorizontalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_12Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(panelRound_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        panelRound_12Layout.setVerticalGroup(
            panelRound_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound_12Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(panelRound_23, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        getContentPane().add(panelRound_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 1120, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldIDPetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIDPetugasKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            fieldNamaPetugas.requestFocus();
        }
    }//GEN-LAST:event_fieldIDPetugasKeyReleased

    private void fieldNamaPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaPetugasActionPerformed

    private void fieldNamaPetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNamaPetugasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            fieldUsernamePetugas.requestFocus();
        }
    }//GEN-LAST:event_fieldNamaPetugasKeyPressed

    private void fieldUsernamePetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsernamePetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsernamePetugasActionPerformed

    private void fieldUsernamePetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernamePetugasKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            fieldPasswordPetugas.requestFocus();
        }
    }//GEN-LAST:event_fieldUsernamePetugasKeyPressed

    private void fieldUsernamePetugasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernamePetugasKeyReleased
        // TODO add your handling code here:
        komponenPetugas();
        try {
            String sql = "select username from tb_petugas where username=?";
            this.pst = connect.connectDB().prepareStatement(sql);
            this.pst.setString(1,  usernamePetugas);
            this.set = pst.executeQuery();
            if(set.next()){
                fieldPasswordPetugas.setVisible(false);

                labelError.setVisible(true);
                labelError.setForeground(Color.RED);
                labelError.setText("Username " + usernamePetugas + " telah digunakan");

                fieldPasswordPetugas.setEditable(false);

            }else if(usernamePetugas.equals("")){
                labelError.setVisible(false);

            }else  if(set.next() == false){
                fieldPasswordPetugas.setVisible(true);
                labelError.setVisible(true);
                fieldPasswordPetugas.setEditable(true);
                labelError.setText("Username " + usernamePetugas + " dapat digunakan!");
                labelError.setForeground(Color.GREEN);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_fieldUsernamePetugasKeyReleased

    private void fieldPasswordPetugasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPasswordPetugasKeyPressed

    }//GEN-LAST:event_fieldPasswordPetugasKeyPressed

    private void ButtonSimpanAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanAkunActionPerformed

        buatAkunPetugas();

    }//GEN-LAST:event_ButtonSimpanAkunActionPerformed

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
            java.util.logging.Logger.getLogger(MembuatAkunPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembuatAkunPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembuatAkunPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembuatAkunPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembuatAkunPetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button ButtonSimpanAkun;
    private textfield.TextField fieldIDPetugas;
    private textfield.TextField fieldNamaPetugas;
    private textfield.TextField fieldPasswordPetugas;
    private textfield.TextField fieldUsernamePetugas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelError;
    private LoginPage.PanelRound_1 panelRound_12;
    private LoginPage.PanelRound_1 panelRound_23;
    // End of variables declaration//GEN-END:variables

    public void komponenPetugas(){
        MD5 hash = new MD5(); 
        IDPetugas = fieldIDPetugas.getText().trim(); 
        namaPetugas = fieldNamaPetugas.getText().trim(); 
        usernamePetugas = fieldUsernamePetugas.getText().trim(); 
        passwordPetugas = hash.getMd5(fieldPasswordPetugas.getText().trim()); 
        
    }
    
    public void buatAkunPetugas(){
        
        komponenPetugas();
        try {
            String sql = "insert into tb_petugas values(?, ?, ?, ?, ?)"; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.pst.setString(1, IDPetugas); 
            this.pst.setString(2, namaPetugas); 
            this.pst.setString(3, usernamePetugas); 
            this.pst.setString(4, passwordPetugas); 
            this.pst.setString(5, "1002"); 
            this.pst.execute(); 
            JOptionPane.showConfirmDialog(null, "Apakah anda yakin untuk menyimpannya?"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        autoNumberPetugas();
    }
    
    public void autoNumberPetugas(){
        try {
            String sql = "select max(id_petugas) as autoNumber from tb_petugas "; 
            this.pst = connect.connectDB().prepareStatement(sql); 
            this.set = pst.executeQuery();
            if(set.next()){
                int autoNumber = set.getInt("autoNumber"); 
                fieldIDPetugas.setText(String.valueOf(autoNumber + 1));
            }
        } catch (Exception e) {
        }
    }



}