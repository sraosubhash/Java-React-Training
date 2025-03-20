package com.java.model;

import java.util.Date;

public class Leave{



        private int leaveId;       
        private int empId;            
        private String empName;       
        private Date leaveStartDate;  
        private Date leaveEndDate;    
        private int noOfDays;         
        private String leaveReason;   
        private LeaveType leaveType;  

        
    public Leave() {
            
        }

        
    public Leave(int empId, String empName, Date leaveStartDate,
                Date leaveEndDate, int noOfDays, String leaveReason, LeaveType leaveType) {
            this.empId = empId;
            this.empName = empName;
            this.leaveStartDate = leaveStartDate;
            this.leaveEndDate = leaveEndDate;
            this.noOfDays = noOfDays;
            this.leaveReason = leaveReason;
            this.leaveType = leaveType;
        }

        
        public int getLeaveId() {
            return leaveId;
        }


        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public Date getLeaveStartDate() {
            return leaveStartDate;
        }

        public void setLeaveStartDate(Date leaveStartDate) {
            this.leaveStartDate = leaveStartDate;
        }

        public Date getLeaveEndDate() {
            return leaveEndDate;
        }

        public void setLeaveEndDate(Date leaveEndDate) {
            this.leaveEndDate = leaveEndDate;
        }

        public int getNoOfDays() {
            return noOfDays;
        }

        public void setNoOfDays(int noOfDays) {
            this.noOfDays = noOfDays;
        }

        public String getLeaveReason() {
            return leaveReason;
        }

        public void setLeaveReason(String leaveReason) {
            this.leaveReason = leaveReason;
        }

        public LeaveType getLeaveType() {
            return leaveType;
        }

        public void setLeaveType(LeaveType leaveType) {
            this.leaveType = leaveType;
        }

        @Override
        public String toString() {
            return "LeaveRequest [leaveId=" + leaveId + ", empId=" + empId + ", empName=" + empName +
                    ", leaveStartDate=" + leaveStartDate + ", leaveEndDate=" + leaveEndDate +
                    ", noOfDays=" + noOfDays + ", leaveReason=" + leaveReason + ", leaveType=" + leaveType + "]";
        }
    }