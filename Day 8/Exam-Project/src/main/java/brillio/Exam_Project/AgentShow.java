package brillio.Exam_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgentShow {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
			String cmd = "select * from agent";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Agent ID "+rs.getInt("agentid"));
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
