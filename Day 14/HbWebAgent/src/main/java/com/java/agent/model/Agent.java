package com.java.agent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "Agent")
public class Agent {
	
	@Id
	@Column(name = "AgentID")
	private int agentid;
	@Column(name = "Name")
	private String name;
	@Column(name = "City")
	private String city;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "MaritalStatus")
	private int MaritalStatus;
	@Column(name = "Premium")
	private double Premium;
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(int agentid, String name, String city, String gender, int maritalStatus, double premium) {
		super();
		this.agentid = agentid;
		this.name = name;
		this.city = city;
		this.gender = gender;
		MaritalStatus = maritalStatus;
		Premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [agentid=" + agentid + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	
	

}
