package brillio.Exam_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddAgent {
	
	public static void main(String[] args) {
		
		int agentid,MaritalStatus;
		String name, city, gender;
		double Premium;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Agent ID ");
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
			String cmd = "insert into agent values (?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, agentid);
			pst.setString(2, name);
			pst.setString(3, city);
			pst.setString(4, gender);
			pst.setInt(5, MaritalStatus);
			pst.setDouble(6, Premium);
			
			pst.executeUpdate();
			
			System.out.println("***Record sucesfully added***");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
