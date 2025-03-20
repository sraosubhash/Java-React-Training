package brillio.Exam_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteAgent {
	
	public static void main(String[] args) {
		
		int agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent ID to be deleted");
		agentid = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Deliver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
			String cmd = "Delete from agent where agentid = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, agentid);
			pst.executeUpdate();
			System.out.println("Agent record sucessfully deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
