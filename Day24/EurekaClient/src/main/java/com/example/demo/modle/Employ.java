package com.example.demo.modle;

public class Employ {
	
	private Long employId;
	
	public Employ(Long employId) {
		super();
		this.employId = employId;
	}

	public Long getEmployId() {
		return employId;
	}

	public void setEmployId(Long employId) {
		this.employId = employId;
	}

	private String name;
	private String practiceArea;
	private String designation;
	private String companyInfo;
	
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employ(String name, String practiceArea, String designation, String companyInfo) {
		super();
		this.name = name;
		this.practiceArea = practiceArea;
		this.designation = designation;
		this.companyInfo = companyInfo;
	}



	@Override
	public String toString() {
		return "Employ [employId=" + employId + ", name=" + name + ", practiceArea=" + practiceArea + ", designation="
				+ designation + ", companyInfo=" + companyInfo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPracticeArea() {
		return practiceArea;
	}

	public void setPracticeArea(String practiceArea) {
		this.practiceArea = practiceArea;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	
	
}
