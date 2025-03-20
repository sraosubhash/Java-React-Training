package com.java.agent.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.agent.model.Agent;

public interface AgentDao {
	
	List<Agent> showAgent () throws SQLException, ClassNotFoundException;
	Agent searchAgent(int agentid) throws ClassNotFoundException, SQLException;

}
