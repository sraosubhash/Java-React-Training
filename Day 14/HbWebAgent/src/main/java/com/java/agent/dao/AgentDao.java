package com.java.agent.dao;

import java.util.List;

import com.java.agent.model.Agent;


public interface AgentDao {
	
	List<Agent> showAgentDao();
	Agent searchAgentDao(int agentid);
	String updateAgentDao(Agent agent);
	String deleteAgentDao(int agentid);
	String addAgentDao(Agent agent);

}
