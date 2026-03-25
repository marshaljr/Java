import java.sql.*;
import java.util.Scanner;

public class LoginTest {

   public static void main(String[] args) throws Exception {
       Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/logindb",
               "root",
               "root");

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter username: ");
       String username = sc.nextLine();

       System.out.print("Enter password: ");
       String password = sc.nextLine();

       // Vulnerable query: user values are concatenated into the SQL string
       String sql = "SELECT * FROM users WHERE username='" + username
                    + "' AND password='" + password + "'";
       System.out.println(sql); // useful for showing the actual query

       Statement stmt = conn.createStatement();
       ResultSet rs = stmt.executeQuery(sql);

       if (rs.next())
           System.out.println("Login Successful");
       else
           System.out.println("Login Failed");

       conn.close();
       sc.close();
   }
}


//import java.sql.*;
//import java.util.Scanner;
//
//public class LoginTest {
//
//   public static void main(String[] args) throws Exception {
//       Connection conn = DriverManager.getConnection(
//               "jdbc:mysql://localhost:3306/logindb",
//               "root",
//               "password");
//
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Enter username: ");
//       String username = sc.nextLine();
//
//       System.out.print("Enter password: ");
//       String password = sc.nextLine();
//
//       // Safe query: use placeholders for user values
//       String sql = "SELECT * FROM users WHERE username=? AND password=?";
//       PreparedStatement ps = conn.prepareStatement(sql);
//       ps.setString(1, username);
//       ps.setString(2, password);
//
//       ResultSet rs = ps.executeQuery();
//
//       if (rs.next())
//           System.out.println("Login Successful");
//       else
//           System.out.println("Login Failed");
//
//       conn.close();
//   }
//}
