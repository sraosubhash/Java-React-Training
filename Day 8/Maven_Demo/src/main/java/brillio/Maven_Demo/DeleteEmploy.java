package brillio.Maven_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmploy {

public static void main(String[] args) {
		
		
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter Employ no : ");
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/brillio","root","root");
			String cmd="Delete from employ where empno = ?";
			
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empno);
		
			pst.executeUpdate();
			System.out.println("*** Record Deleted ****");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
 
}
 

