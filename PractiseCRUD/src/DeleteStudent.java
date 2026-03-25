import java.sql.Connection;
import java.sql.Statement;

public class DeleteStudent {

    public static void main(String[] args) {

        try {

            Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM student WHERE id=1";

            stmt.executeUpdate(sql);

            System.out.println("Record deleted successfully!");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}