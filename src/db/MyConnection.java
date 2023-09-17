
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
    private static final String username ="root";
    private static final String password ="toilatrungduc6";
    private static final String url = "jdbc:mysql://localhost:3306/student_management";
    private static Connection con = null;
    public static Connection getConnection(){
        try {
            // JDBC 4.0 trở đi hỗ trợ autoloading của driver mà không cần gọi classforName.
            // Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
     public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("Successful!");
        } else {
            System.out.println("Erorr!");
        }
    }
}
