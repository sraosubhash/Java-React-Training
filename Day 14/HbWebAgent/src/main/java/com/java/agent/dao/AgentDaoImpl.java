package com.java.agent.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.agent.model.Agent;
import com.java.agent.util.SessionHelper;



public class AgentDaoImpl implements AgentDao{
	
	SessionFactory sessionFactory;
	Session session;

	@Override
	public List<Agent> showAgentDao() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Agent");
		List <Agent> agentList = query.list();
		return agentList;
	}

	@Override
	public Agent searchAgentDao(int agentid) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Agent where agentid = "+agentid);
		Agent agent = (Agent)query.uniqueResult();
		return agent;
	}
 
	@Override
	public String updateAgentDao(Agent agent) {
		sessionFactory = SessionHelper.getConnection();
		session =  sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(agent);
		trans.commit();
		return "Agent Record Updated....";
	}

	@Override
	public String deleteAgentDao(int agentid) {
		sessionFactory = SessionHelper.getConnection();
		session =  sessionFactory.openSession();
		Agent agent = searchAgentDao(agentid);
		System.out.println(agent);
		Transaction trans = session.beginTransaction();
		session.delete(agent);
		trans.commit();
		return "Agent Record Deleted....";
	}

	@Override
	public String addAgentDao(Agent agent) {
		sessionFactory = SessionHelper.getConnection();
		session =  sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(agent);
		trans.commit();
		return "Agent Record Inserted....";
	}

}
