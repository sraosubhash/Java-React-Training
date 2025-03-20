package brillio.Maven_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username ");
		String user = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio","root","root");
			String cmd = "select count(*) cnt from userdata where username = ? and passcode = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2, pwd);
			
			ResultSet rs=pst.executeQuery();
			rs.next();
			
			int count=rs.getInt("cnt");
			if(count == 1) {
				System.out.println("Correct credentials ....");
			}
			else {
				System.out.println("Invalid Credentilals");
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
