import java.sql.Connection;
import java.sql.Statement;

public class InsertStudent {

    public static void main(String[] args) {

        try {

            // Get connection
            Connection conn = DbConnection.connect();

            // Create statement
            Statement stmt = conn.createStatement();

            // SQL insert query
            String sql = "INSERT INTO student (id, name, age) VALUES (1, 'John', 20)";

            // Execute query
            stmt.executeUpdate(sql);

            System.out.println("Record inserted successfully!");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}