package studentmanager;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MarksSheet {

    Connection con = MyConnection.getConnection();
    PreparedStatement ps;

    public boolean isIdExist(int sid) {
        try {
            ps = con.prepareStatement("select * from score where student_id = ?");
            ps.setInt(1, sid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarksSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void getMarksSheetValue(JTable table, int sid) {
        String sql = "SELECT * FROM score where student_id  = ?";
              
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, sid);
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
            Logger.getLogger(MarksSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double getGPA(int sid){
        double gpa = 0.0;
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select avg(average) from score where student_id = " + sid + "");
            if(rs.next()){
                gpa = rs.getDouble(1);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarksSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gpa;
    }
}
