import java.sql.Connection;
import java.sql.Statement;

public class UpdateStudent {

    public static void main(String[] args) {

        try {

            Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();

            String sql = "UPDATE student SET name='Ram', age=22 WHERE id=1";

            stmt.executeUpdate(sql);

            System.out.println("Record updated successfully!");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}