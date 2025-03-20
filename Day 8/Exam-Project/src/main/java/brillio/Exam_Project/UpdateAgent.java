package brillio.Exam_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAgent {
	
	public static void main(String[] args) {
		
		int agentid,MaritalStatus;
		String name, city, gender;
		double Premium;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent ID to update record ");
		agentid = sc.nextInt();
		System.out.println("Enter Agent Name ");
		name = sc.next();
		System.out.println("Enter city ");
		city = sc.next();
		System.out.println("Enter Gender (Male/Female) ");
		gender = sc.next();
		System.out.println("Enter Marital Status");
		MaritalStatus = sc.nextInt();
		System.out.println("Enter Premium ");
		Premium = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
			String cmd = "Update agent set name = ?, city = ?, gender = ?, MaritalStatus = ?, Premium = ? where agentid = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, name);
			pst.setString(2, city);
			pst.setString(3, gender);
			pst.setInt(4, MaritalStatus);
			pst.setDouble(5, Premium);
			pst.setInt(6, agentid);
			
			pst.executeUpdate();
			System.out.println("***Record sucessfully updated***");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
