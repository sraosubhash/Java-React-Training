package brillio.Maven_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmploy {
	
	public static void main(String[] args) {
		
		int empno;
		double basic;
		String ename, dept,desig,gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ nmber to be updated ");
		empno = sc.nextInt();
		System.out.println("Enter Employ name");
		ename = sc.next();
		System.out.println("Enter gender (Male/Female) ");
		gender = sc.next();
		System.out.println("Department ");
		dept = sc.next();
		System.out.println("Designation");
		desig = sc.next();
		System.out.println("Enter basic ");
		basic = sc.nextDouble();
		
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio","root","root");
				String cmd = "update employ set ename = ?, gender = ?, dept = ?, desig = ?, basic = ? where empno = ?";
				PreparedStatement pst = connection.prepareStatement(cmd);
				pst.setString(1, ename);
				pst.setString(2, gender);
				pst.setString(3, dept);
				pst.setString(4, desig);
				pst.setDouble(5, basic);
				pst.setInt(6, empno);
				pst.executeUpdate();
				System.out.println("*** Records sucessfully updated ***");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
