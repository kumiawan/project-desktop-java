package index;

import Connection.Connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FORM_LupaPassword extends javax.swing.JFrame {

    /**
     * Creates new form LupaPassword
     */
    public FORM_LupaPassword() {
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

        BackgourndPanel = new javax.swing.JPanel();
        biru = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        putih = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        NewPassword = new javax.swing.JPasswordField();
        Hint = new javax.swing.JTextField();
        QuestionKey = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BackgourndPanel.setPreferredSize(new java.awt.Dimension(960, 540));
        BackgourndPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        biru.setBackground(new java.awt.Color(111, 200, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("?");

        javax.swing.GroupLayout biruLayout = new javax.swing.GroupLayout(biru);
        biru.setLayout(biruLayout);
        biruLayout.setHorizontalGroup(
            biruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        biruLayout.setVerticalGroup(
            biruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        BackgourndPanel.add(biru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 540));

        putih.setBackground(new java.awt.Color(255, 255, 255));
        putih.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setBackground(new java.awt.Color(218, 223, 252));
        Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(26, 26, 26));
        Username.setSelectionColor(new java.awt.Color(107, 125, 253));
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsernameKeyReleased(evt);
            }
        });
        putih.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 250, 35));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/MATA SILANG PNG.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        putih.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 50, 40));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/show.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        putih.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 50, 40));

        NewPassword.setBackground(new java.awt.Color(218, 223, 252));
        NewPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NewPassword.setForeground(new java.awt.Color(26, 26, 26));
        NewPassword.setSelectionColor(new java.awt.Color(107, 125, 253));
        NewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordActionPerformed(evt);
            }
        });
        putih.add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 330, 35));

        Hint.setBackground(new java.awt.Color(218, 223, 252));
        Hint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Hint.setForeground(new java.awt.Color(26, 26, 26));
        Hint.setSelectionColor(new java.awt.Color(107, 125, 253));
        putih.add(Hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 330, 35));

        QuestionKey.setEditable(false);
        QuestionKey.setBackground(new java.awt.Color(218, 223, 252));
        QuestionKey.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuestionKey.setForeground(new java.awt.Color(26, 26, 26));
        QuestionKey.setSelectionColor(new java.awt.Color(107, 125, 253));
        putih.add(QuestionKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 330, 35));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Kata Sandi Baru");
        putih.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 323, -1, 35));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Question");
        putih.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 210, 88, 35));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Hint");
        putih.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 258, 88, 35));

        simpan.setBackground(new java.awt.Color(51, 153, 255));
        simpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        putih.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 320, 40));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("CARI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        putih.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 74, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Lupa Kata Sandi");
        putih.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 170, 35));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        putih.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 320, 40));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("BATAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        putih.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 320, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        putih.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 320, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Username");
        putih.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 157, 89, 35));

        BackgourndPanel.add(putih, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 630, 540));

        getContentPane().add(BackgourndPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyReleased
//        usernameSearch();
    }//GEN-LAST:event_UsernameKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        usernameSearch();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        // TODO add your handling code here:
        show.setVisible(true);
        hide.setVisible(false);
        NewPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_hideMousePressed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        if (show.isEnabled()) {
            NewPassword.setEchoChar((char) 0);
        } else {
            NewPassword.setEchoChar('*');

        }
    }//GEN-LAST:event_showMouseClicked

    private void NewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPasswordActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String username = Username.getText();
        String answer = Hint.getText();
        String question = QuestionKey.getText();
        String new_password = NewPassword.getText();

        try {
            String sql = "SELECT * FROM data_karyawan WHERE username='" + username + "' and hint='" + answer + "'";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            if (res.next()) {
                stm.executeUpdate("UPDATE `data_karyawan` SET `password` ='" + new_password + "' WHERE `data_karyawan`.`username` ='" + username + "'");
                JOptionPane.showMessageDialog(this, "Password telah diperbarui ;D");
                this.dispose();
                new FORM_Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Hint salah!");
            }
            conn.close();
            res.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_simpanActionPerformed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
        hide.setVisible(true);
        NewPassword.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FORM_Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void usernameSearch() {
        String username = Username.getText();

        try {
            String sql = "SELECT QuestionHint FROM data_karyawan WHERE username='" + username + "'";
            java.sql.Connection conn = (Connection) Connect.ConfigDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            if (res.next()) {
                QuestionKey.setText(res.getString("QuestionHint"));
            } else {
                JOptionPane.showMessageDialog(this, "Username tidak ada!");
            }
            conn.close();
            res.close();
        } catch (HeadlessException | SQLException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(FORM_LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_LupaPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FORM_LupaPassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgourndPanel;
    private javax.swing.JTextField Hint;
    private javax.swing.JPasswordField NewPassword;
    private javax.swing.JTextField QuestionKey;
    private javax.swing.JTextField Username;
    private javax.swing.JPanel biru;
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel putih;
    private javax.swing.JLabel show;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}