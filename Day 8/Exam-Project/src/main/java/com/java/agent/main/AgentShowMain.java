package com.java.agent.main;

import java.sql.SQLException;
import java.util.List;

import com.java.agent.dao.AgentDao;
import com.java.agent.dao.AgentDaoImp;
import com.java.agent.model.Agent;

public class AgentShowMain {
	
	public static void main(String[] args) {
		AgentDao dao = new AgentDaoImp();
		try {
			List<Agent> agList = dao.showAgent();
			for (Agent agent : agList) {
				System.out.println(agent);
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
