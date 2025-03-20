package brillio.Maven_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	
	public static void main(String[] args) {
		
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ nmber to be searched ");
		empno = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio","root","root");
			String cmd = "select * from employ where empno = ?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				System.out.println("Employ No " +rs.getInt("empno"));
				System.out.println("Employ Name "+rs.getString("ename"));
				System.out.println("Gender "+rs.getString("gender"));
				System.out.println("Department "+rs.getString("dept"));
				System.out.println("Designation "+rs.getString("desig"));
				System.out.println("Basic "+rs.getDouble("basic"));
				System.out.println("----------------------------------");
			} else {
				System.out.println("*** Record not found***");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
