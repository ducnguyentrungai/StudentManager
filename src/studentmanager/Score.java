/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Score {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public int getMax() {
        int id = 0;
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(id) from course");
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id + 1;
    }

    public boolean getDetails(int sid, int semeterNo) {
        try {
            ps = con.prepareStatement("select * from course where student_id = ? and semester = ?");
            ps.setInt(1, sid);
            ps.setInt(2, semeterNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home.jTextField13.setText(rs.getString(2));
                Home.jTextField16.setText(rs.getString(3));
                Home.jTextCourse1.setText(rs.getString(4));
                Home.jTextCourse2.setText(rs.getString(5));
                Home.jTextCourse3.setText(rs.getString(6));
                Home.jTextCourse4.setText(rs.getString(7));
                Home.jTextCourse5.setText(rs.getString(8));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Student id or semester doesn't exit");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
