package com.java.dao;

import java.util.Date;
import java.util.List;

import com.exception.LeaveException;
import com.java.model.Leave;

public class LeaveBal {
    private LeaveDao leaveDao;
    StringBuilder sb;

    
    public LeaveBal() {
        leaveDao = new LeaveDaoImpl();
    }

    
    public boolean validateLeaveRequest(Leave leaveRequest) throws LeaveException {
        StringBuilder sb = new StringBuilder();
        boolean isValid = true;

        
        Date today = new Date();
        if (leaveRequest.getLeaveStartDate().before(today)) {
            sb.append("Leave Start Date cannot be a past date.\n");
            isValid = false;
        }

        if (leaveRequest.getLeaveStartDate().after(leaveRequest.getLeaveEndDate())) {
            sb.append("Leave Start Date cannot be after Leave End Date.\n");
            isValid = false;
        }

     
        if (!isValid) {
            throw new LeaveException(sb.toString());
        }
        return isValid;
    }


    public String addLeaveRequest(Leave leaveRequest) throws LeaveException {
    	 System.out.println("your leave id is :" +leaveDao.generateLeaveId());
         long ms_noofdays=leaveRequest.getLeaveEndDate().getTime()-leaveRequest.getLeaveStartDate().getTime();
         int days=(int)(ms_noofdays/(1000*60*60*24));
         leaveRequest.setNoOfDays(days);
         System.out.println("number of days: "+days);
        
        if (validateLeaveRequest(leaveRequest)) {
        	
            return leaveDao.addLeaveRequest(leaveRequest); 
        }
        throw new LeaveException(sb.toString());
       
    }

    
    public List<Leave> showAllLeaveRequests() {
        return leaveDao.showAllLeaveRequests();
    }

   
    public Leave searchLeaveRequestById(int leaveId) {
        return leaveDao.searchLeaveRequestById(leaveId);
    }

   
    public String deleteLeaveRequestById(int leaveId) {
        return leaveDao.deleteLeaveRequestById(leaveId);
    }

   
    public String updateLeaveRequest(Leave leaveRequest) throws LeaveException {
        if (validateLeaveRequest(leaveRequest)) {
            return leaveDao.updateLeaveRequest(leaveRequest); 
        }
        return "Validation failed!";
    }
}
