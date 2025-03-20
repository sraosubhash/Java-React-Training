package com.java.leave.model;

import java.util.Date;

public class Leave {
	
	private int leaveid;
	private int empid;
	private String empName;
	private Date leaveStDate;
	private Date leaveEndDate;
	private int noDays;
	private String LeaveReason;
	private LeaveType Ltype;
	
	public Leave() {
		
	}

	public Leave(int leaveid, int empid, String empName, Date leaveStDate, Date leaveEndDate, int noDays,
			String leaveReason, LeaveType ltype) {
		
		this.leaveid = leaveid;
		this.empid = empid;
		this.empName = empName;
		this.leaveStDate = leaveStDate;
		this.leaveEndDate = leaveEndDate;
		this.noDays = noDays;
		LeaveReason = leaveReason;
		Ltype = ltype;
	}

	@Override
	public String toString() {
		return "Leave [leaveid=" + leaveid + ", empid=" + empid + ", empName=" + empName + ", leaveStDate="
				+ leaveStDate + ", leaveEndDate=" + leaveEndDate + ", noDays=" + noDays + ", LeaveReason=" + LeaveReason
				+ ", Ltype=" + Ltype + "]";
	}

	public int getLeaveid() {
		return leaveid;
	}

	public void setLeaveid(int leaveid) {
		this.leaveid = leaveid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getLeaveStDate() {
		return leaveStDate;
	}

	public void setLeaveStDate(Date leaveStDate) {
		this.leaveStDate = leaveStDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public int getNoDays() {
		return noDays;
	}

	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}

	public String getLeaveReason() {
		return LeaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		LeaveReason = leaveReason;
	}

	public LeaveType getLtype() {
		return Ltype;
	}

	public void setLtype(LeaveType ltype) {
		Ltype = ltype;
	}
	
	
	
	

}
