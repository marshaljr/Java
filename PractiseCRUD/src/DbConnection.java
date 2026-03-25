import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection connect() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:3306/studentdb";
            String user = "root";
            String password = "root";

            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connection Successful!");

        } catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }

        return conn;
    }
}