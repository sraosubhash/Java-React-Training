package com.java.leave.blay;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.java.leave.dao.LeaveDao;
import com.java.leave.dao.LeaveDaoImp;
import com.java.leave.exception.LeaveException;
import com.java.leave.model.Leave;

public class LeaveBlay {
	
	static LeaveDao levDao;
	static StringBuilder sb;
	static Scanner sc;
	
	static {
		levDao = new LeaveDaoImp();
		sc = new Scanner(System.in);
	}
	
	public boolean validateLeave(Leave leaveDetails) {
		sb=new StringBuilder();
		boolean isValid=true;
		
		Date date = new Date();
		
		
		long diffStart =  leaveDetails.getLeaveStDate().getTime()-date.getTime() ;
		long days1 = (diffStart/(1000*60*60*24));
		days1++;
		
		if(days1<1) {
			sb.append("start date can't be in past\n");
			isValid=false;
		}
		
		long diffEnd =  leaveDetails.getLeaveEndDate().getTime()-date.getTime();
		long days2 = (diffEnd/(1000*60*60*24));
		days2++;
		if(days2<1) {
			sb.append("end date can't be in past\n");
			isValid=false;
		}
	
		long ms = diffEnd-diffStart;
		long days = (ms/(1000*60*60*24));
		days++;
		if(days<0) {
			sb.append("leaveStartDate cannot be greater than leaveEndDate\n");
			isValid=false;
		}
		
		return isValid;
	}
	
	public String addLeaveBlay(Leave lev) throws LeaveException {
		if (validateLeave(lev)) {
			return levDao.addLeaveDao(lev);
		}
		throw new LeaveException(sb.toString());
	}
	
	public List<Leave> showLeaveBlay(){
		return levDao.showLeaveDao();
	}
	
	public Leave searchLeaveBlay(int leaveid) {
		return levDao.searchLeaveDao(leaveid);
	}
	
	public String deleteLeaveBlay(int leaveid) {
		return levDao.deleteLeaveDao(leaveid);
	}

}
