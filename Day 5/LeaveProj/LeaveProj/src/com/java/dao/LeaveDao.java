package com.java.dao;
import java.util.List;

import com.java.model.Leave;

public interface LeaveDao {
    String addLeaveRequest(Leave leaveRequest);

    
    List<Leave> showAllLeaveRequests();

   int generateLeaveId();
    Leave searchLeaveRequestById(int leaveId);

    String deleteLeaveRequestById(int leaveId);

    String updateLeaveRequest(Leave leaveRequest);
}