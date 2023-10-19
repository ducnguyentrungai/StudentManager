package login;

import home.Home;
import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Vigenere vg = new Vigenere();
    private final String key = "oop";

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        lbVisible = new javax.swing.JLabel();
        lbInvisible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("LOGIN");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, 509, 35));

        lbUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsername.setText("Username");
        jPanel1.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 113, -1, -1));
        lbUsername.getAccessibleContext().setAccessibleDescription("");

        lbPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPassword.setText("Password");
        jPanel1.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 179, -1, -1));

        tfUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 110, 300, 30));

        pfPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 176, 300, 30));

        btLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLogin.setText("Login");
        btLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 117, 28));

        btCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCancel.setText("Cancel");
        btCancel.setToolTipText("");
        btCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 110, 28));

        lbVisible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVisible.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\invisible.png")); // NOI18N
        lbVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVisibleMouseClicked(evt);
            }
        });
        jPanel1.add(lbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 40, 20));

        lbInvisible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInvisible.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\visible.png")); // NOI18N
        lbInvisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInvisibleMouseClicked(evt);
            }
        });
        jPanel1.add(lbInvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCancelActionPerformed
    int xx, xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.1; i < 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void lbVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVisibleMouseClicked
        pfPassword.setEchoChar((char) 0);
        lbVisible.setVisible(false);
        lbInvisible.setVisible(true);
    }//GEN-LAST:event_lbVisibleMouseClicked

    private void lbInvisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInvisibleMouseClicked
        pfPassword.setEchoChar('*');
        lbVisible.setVisible(true);
        lbInvisible.setVisible(false);
    }//GEN-LAST:event_lbInvisibleMouseClicked

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        if (isEmpty()) {
            String username = vg.encryptVigenere(tfUsername.getText(), key);
            String password = vg.encryptVigenere(String.valueOf(pfPassword.getPassword()), key);
            try {
                ps = con.prepareStatement("select * from admin where username = ? and password = ?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Login success");
                    Home home = new Home();
                    home.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btLoginActionPerformed

    public boolean isEmpty() {
        if (tfUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is missing");
            return false;
        }
        if (String.valueOf(pfPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Passworld is missing");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbInvisible;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbVisible;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
