package login;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;
    Vigenere vg = new Vigenere();
    private final String key = "oop";

    public CreateAccount() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btCreateAccount = new javax.swing.JButton();
        lbVisible = new javax.swing.JLabel();
        lbInvisible = new javax.swing.JLabel();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        tfUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 122, 289, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, 90, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 78, -1));

        pfPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 170, 289, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Account");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 481, -1));

        btCreateAccount.setBackground(new java.awt.Color(0, 51, 255));
        btCreateAccount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btCreateAccount.setText("Create Account");
        btCreateAccount.setToolTipText("");
        btCreateAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCreateAccount.setMaximumSize(null);
        btCreateAccount.setMinimumSize(null);
        btCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 30));

        lbVisible.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\invisible.png")); // NOI18N
        lbVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVisibleMouseClicked(evt);
            }
        });
        jPanel1.add(lbVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 50, 30));

        lbInvisible.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\StudentManager\\StudentManager\\src\\image\\visible.png")); // NOI18N
        lbInvisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInvisibleMouseClicked(evt);
            }
        });
        jPanel1.add(lbInvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 50, 30));

        btCancel.setBackground(new java.awt.Color(0, 51, 255));
        btCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCancel.setForeground(new java.awt.Color(255, 255, 255));
        btCancel.setText("Cancel");
        btCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancel.setMaximumSize(null);
        btCancel.setMinimumSize(null);
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed

    }//GEN-LAST:event_pfPasswordActionPerformed

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.dispose();
        new Login().setVisible(true);

    }//GEN-LAST:event_btCancelActionPerformed

    private void btCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateAccountActionPerformed
        if (isEmpty()) {
            String user = vg.encryptVigenere(tfUsername.getText(), key);
            String pass = vg.encryptVigenere(String.valueOf(pfPassword.getPassword()), key);
            insert(user, pass);
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btCreateAccountActionPerformed

    public void insert(String username, String password) {
        String sql = "insert into admin values (? , ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            int id = getMax();
            ps.setInt(1, id);
            ps.setString(2, username);
            ps.setString(3, password);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Create account succesfully");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getMax() {
        int id = 0;
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(id) from admin");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return id + 1;
    }

    public boolean isEmpty() {
        if (tfUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is missing!");
            return false;
        }
        if (String.valueOf(pfPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Passworld is missing!");
            return false;
        }
        return true;
    }

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(() -> {
//            CreateAccount ca = new CreateAccount();
//            ca.setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCreateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbInvisible;
    private javax.swing.JLabel lbVisible;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
