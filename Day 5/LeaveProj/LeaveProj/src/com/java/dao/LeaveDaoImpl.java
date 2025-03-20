package com.java.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.model.Leave;
public class LeaveDaoImpl implements LeaveDao{
    private static List<Leave> leaveRequests = new ArrayList<>();

    public int generateLeaveId() {
		if(leaveRequests.size()==0) {
			return 1;
		}
		return leaveRequests.get(leaveRequests.size()-1).getLeaveId()+1;
	}

    @Override
    public String addLeaveRequest(Leave leaveRequest) {
       int id = generateLeaveId();
       
      
        leaveRequests.add(leaveRequest);
        return "Leave request added successfully!";
    }

    @Override
    public List<Leave> showAllLeaveRequests() {
        return leaveRequests;
    }

    @Override
    public Leave searchLeaveRequestById(int leaveId) {

        for (Leave leaveRequest : leaveRequests) {
            if (leaveRequest.getLeaveId() == leaveId) {
                return leaveRequest;
            }
        }
        return null; 
    }

    @Override
    public String deleteLeaveRequestById(int leaveId) {
        
        Leave leaveRequest = searchLeaveRequestById(leaveId);
        if (leaveRequest != null) {
            leaveRequests.remove(leaveRequest);
            return "Leave request deleted successfully!";
        }
        return "Leave request not found!";
    }

    @Override
    public String updateLeaveRequest(Leave leaveRequest) {
       
        Leave existingLeaveRequest = searchLeaveRequestById(leaveRequest.getLeaveId());

        if (existingLeaveRequest != null) {
     
            existingLeaveRequest.setEmpId(leaveRequest.getEmpId());
            existingLeaveRequest.setEmpName(leaveRequest.getEmpName());
            existingLeaveRequest.setLeaveStartDate(leaveRequest.getLeaveStartDate());
            existingLeaveRequest.setLeaveEndDate(leaveRequest.getLeaveEndDate());
            existingLeaveRequest.setNoOfDays(leaveRequest.getNoOfDays());
            existingLeaveRequest.setLeaveReason(leaveRequest.getLeaveReason());
            existingLeaveRequest.setLeaveType(leaveRequest.getLeaveType());
            return "Leave request updated successfully!";
        }
        return "Leave request not found!";
    }

	
}