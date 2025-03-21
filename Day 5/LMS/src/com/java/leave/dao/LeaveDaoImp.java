package com.java.leave.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.leave.model.Leave;

public class LeaveDaoImp implements LeaveDao{
	
	static Scanner sc;
	static List<Leave> Levlist;
	
	static {
		sc = new Scanner(System.in);
		Levlist = new ArrayList<Leave>();
	}

	@Override
	public String addLeaveDao(Leave leave) {
		Levlist.add(leave);
		return "Leave sucessfully applied";
	}

	@Override
	public List<Leave> showLeaveDao() {
		return Levlist;
	}

	@Override
	public Leave searchLeaveDao(int leaveid) {
		Leave leaveFound=null;
		for (Leave leave : Levlist) {
			if(leave.getLeaveid() == leaveid) {
				leaveFound = leave;
				break;
			}
		}
		return leaveFound;
		
	}

	@Override
	public String deleteLeaveDao(int leaveid) {
		
		Leave leaveFound = searchLeaveDao(leaveid);
		if (leaveFound != null) {
			Levlist.remove(leaveFound);
			return "Leave record sucessfully deleted";
		}
		return "Leave record not found";
	}

	@Override
	public String updateLeaveDao(Leave levUpdate) {
		
		Leave levFound = searchLeaveDao(levUpdate.getLeaveid());
		if (levFound != null) {
						
			levFound.setEmpid(levUpdate.getEmpid());
			levFound.setEmpName(levFound.getEmpName());
			levFound.setLeaveStDate(levUpdate.getLeaveStDate());
			levFound.setLeaveEndDate(levUpdate.getLeaveEndDate());
			levFound.setLeaveReason(levUpdate.getLeaveReason());
			levFound.setLtype(levUpdate.getLtype());
			return "Leave record sucessfully updated";
		
		}
		return "Leave record not found";
	}

}
