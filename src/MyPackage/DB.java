package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            // IMPORTANT (fix for common error)
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/minshu?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "@Minshu123@";

            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Connection Error:");
            e.printStackTrace();
        }

        return conn;
    }
}