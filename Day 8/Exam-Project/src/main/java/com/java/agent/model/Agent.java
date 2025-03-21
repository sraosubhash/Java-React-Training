package com.java.agent.model;

public class Agent {
	
	private int agentid;
	private String name;
	private String city;
	private Gender gender;
	private int MaritalStatus;
	private double Premium;
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(int agentid, String name, String city, Gender gender, int maritalStatus, double premium) {
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
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
