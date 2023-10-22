package studentmanager;

import home.Home;
import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
            //
            ps = con.prepareStatement("select * from course where student_id = ? and semester = ?");
            ps.setInt(1, sid);
            ps.setInt(2, semeterNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Home.tfScoreStudentID.setText(rs.getString(2));
                Home.tfScoreSemester.setText(rs.getString(3));
                Home.tfScoreCourse1.setText(rs.getString(4));
                Home.tfScoreCourse2.setText(rs.getString(5));
                Home.tfScoreCourse3.setText(rs.getString(6));
                Home.tfScoreCourse4.setText(rs.getString(7));
                Home.tfScoreCourse5.setText(rs.getString(8));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Student id or semester doesn't exit");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isIdExist(int id) {
        try {
            ps = con.prepareStatement("select * from score where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean isSiSemeterNodExist(int sid, int semesterNo) {
        try {
            ps = con.prepareStatement("select * from score where student_id = ? and semester = ?");
            ps.setInt(1, sid);
            ps.setInt(1, semesterNo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // Đưa dữ liệu lên database

    public void insert(int id, int sid, int se,
            String course1, String course2, String course3, String course4, String course5,
            double score1, double score2, double score3, double score4, double score5,
            double average) {

        String sql = "insert into score values"
                + "(?, ?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, sid);
            ps.setInt(3, se);
            ps.setString(4, course1);
            ps.setDouble(5, score1);
            ps.setString(6, course2);
            ps.setDouble(7, score2);
            ps.setString(8, course3);
            ps.setDouble(9, score3);
            ps.setString(10, course4);
            ps.setDouble(11, score4);
            ps.setString(12, course5);
            ps.setDouble(13, score5);
            ps.setDouble(14, average);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New course added succesfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Lấy dữ liệu trong database và đổ đầy vào bảng score
    public void getScoreValue(JTable table, String searchValue) {
        String sql = "SELECT * FROM score\n"
                + "WHERE CONCAT(id, student_id, semester) LIKE ? \n"
                + "ORDER BY id DESC;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchValue + "%");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[14];
                row[0] = rs.getInt(1);  // id
                row[1] = rs.getInt(2);  // student id
                row[2] = rs.getInt(3);  // Semester id
                row[3] = rs.getString(4);   // Course1
                row[4] = rs.getDouble(5);   // Score1
                row[5] = rs.getString(6);   // Course2
                row[6] = rs.getDouble(7);   // Score2
                row[7] = rs.getString(8);   // Course3
                row[8] = rs.getDouble(9);   // Score3
                row[9] = rs.getString(10);   // Course4
                row[10] = rs.getDouble(11);  // Score4
                row[11] = rs.getString(12);  // Course5
                row[12] = rs.getDouble(13);  // Score4
                row[13] = rs.getDouble(14);  // Average
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int id, double score1, double score2, double score3, double score4, double score5, double average) {

        String sql = "UPDATE score SET score1 = ?, score2 = ?, score3 = ?, score4 = ?, score5 = ?, average = ? WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, score1);
            ps.setDouble(2, score2);
            ps.setDouble(3, score3);
            ps.setDouble(4, score4);
            ps.setDouble(5, score5);
            ps.setDouble(6, average);
            ps.setInt(7, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Score update successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Score.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sortAverage(JTable table) {
        String sql = "select * from score order by average";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[14];
                row[0] = rs.getInt(1);  // id
                row[1] = rs.getInt(2);  // student id
                row[2] = rs.getInt(3);  // Semester id
                row[3] = rs.getString(4);   // Course1
                row[4] = rs.getDouble(5);   // Score1
                row[5] = rs.getString(6);   // Course2
                row[6] = rs.getDouble(7);   // Score2
                row[7] = rs.getString(8);   // Course3
                row[8] = rs.getDouble(9);   // Score3
                row[9] = rs.getString(10);   // Course4
                row[10] = rs.getDouble(11);  // Score4
                row[11] = rs.getString(12);  // Course5
                row[12] = rs.getDouble(13);  // Score4
                row[13] = rs.getDouble(14);  // Average
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void refreshScore(JTable table) {
        String sql = "select * from score order by id asc";
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[14];
                row[0] = rs.getInt(1);  // id
                row[1] = rs.getInt(2);  // student id
                row[2] = rs.getInt(3);  // Semester id
                row[3] = rs.getString(4);   // Course1
                row[4] = rs.getDouble(5);   // Score1
                row[5] = rs.getString(6);   // Course2
                row[6] = rs.getDouble(7);   // Score2
                row[7] = rs.getString(8);   // Course3
                row[8] = rs.getDouble(9);   // Score3
                row[9] = rs.getString(10);   // Course4
                row[10] = rs.getDouble(11);  // Score4
                row[11] = rs.getString(12);  // Course5
                row[12] = rs.getDouble(13);  // Score4
                row[13] = rs.getDouble(14);  // Average
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void searchScore(JTable table, String valueSearch) {
        String sql = "select * from score where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(valueSearch));
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs.next()) {
                row = new Object[14];
                row[0] = rs.getInt(1);  // id
                row[1] = rs.getInt(2);  // student id
                row[2] = rs.getInt(3);  // Semester id
                row[3] = rs.getString(4);   // Course1
                row[4] = rs.getDouble(5);   // Score1
                row[5] = rs.getString(6);   // Course2
                row[6] = rs.getDouble(7);   // Score2
                row[7] = rs.getString(8);   // Course3
                row[8] = rs.getDouble(9);   // Score3
                row[9] = rs.getString(10);   // Course4
                row[10] = rs.getDouble(11);  // Score4
                row[11] = rs.getString(12);  // Course5
                row[12] = rs.getDouble(13);  // Score4
                row[13] = rs.getDouble(14);  // Average
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
