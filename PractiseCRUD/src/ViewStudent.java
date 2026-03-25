import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewStudent {

    public static void main(String[] args) {

        try {

            Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM student";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age")
                );
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}