package brillio.Exam_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {
	
	public static void main(String[] args) {
		
		int agentid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Agent ID to be searched");
		agentid = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
			String cmd = "select * from agent where agentid = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, agentid);
			
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Agent Name "+rs.getString("name"));
				System.out.println("Agent city "+rs.getString("city"));
				System.out.println("Gender "+rs.getString("gender"));
				System.out.println("Marital Status " +rs.getInt("MaritalStatus"));
				System.out.println("Premium "+rs.getString("Premium"));
				System.out.println("-----------------------------");
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
