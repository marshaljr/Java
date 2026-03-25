package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRepository {
	public void save(Student s) {
		try {
			// Step 1: allocate a database connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root" // replace
																												// with
																												// your
																												// MySQL
			// credentials
			);

			// Step 2: prepare SQL INSERT statement
			String sql = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, s.sid);
			ps.setString(2, s.name);
			ps.setDouble(3, s.pop);
			ps.setDouble(4, s.cn);
			ps.setDouble(5, s.db);
			ps.setDouble(6, s.total);
			ps.setDouble(7, s.average);
			ps.setString(8, s.result);

			// Step 3: execute the update – returns number of rows affected
			ps.executeUpdate();

			conn.close();
			System.out.println("\nStudent saved to database successfully.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}