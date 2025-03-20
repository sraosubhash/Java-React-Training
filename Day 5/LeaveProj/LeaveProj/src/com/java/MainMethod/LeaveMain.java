package com.java.MainMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


import com.exception.LeaveException;
import com.java.dao.LeaveBal;
import com.java.model.Leave;
import com.java.model.LeaveType;

public class LeaveMain {
    static LeaveBal leaveBal; 
    static Scanner sc; 
    static SimpleDateFormat sdf; 

   
    static {
        leaveBal = new LeaveBal();
        sc = new Scanner(System.in);
        sdf = new SimpleDateFormat("yyyy-MM-dd");
    }

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("------ Leave Management System ------");
            System.out.println("1. Add Leave Request");
            System.out.println("2. Show All Leave Requests");
            System.out.println("3. Search Leave Request");
            System.out.println("4. Update Leave Request");
            System.out.println("5. Delete Leave Request");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        addLeaveRequest();
                    } catch (ParseException | LeaveException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    showAllLeaveRequests();
                    break;
                case 3:
                    searchLeaveRequest();
                    break;
                case 4:
                    try {
                        updateLeaveRequest();
                    } catch (ParseException | LeaveException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 5:
                    deleteLeaveRequest();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }

  
    public static void addLeaveRequest() throws ParseException, LeaveException {
        Leave leaveRequest = new Leave();

        System.out.println("Enter Employee ID: ");
        leaveRequest.setEmpId(sc.nextInt());

        System.out.println("Enter Employee Name: ");
        leaveRequest.setEmpName(sc.next());

        System.out.println("Enter Leave Start Date (yyyy-MM-dd): ");
        leaveRequest.setLeaveStartDate(sdf.parse(sc.next()));

        System.out.println("Enter Leave End Date (yyyy-MM-dd): ");
        leaveRequest.setLeaveEndDate(sdf.parse(sc.next()));


        System.out.println("Enter Leave Type (EL/PL/ML): ");
        leaveRequest.setLeaveType(LeaveType.valueOf(sc.next().toUpperCase()));

        System.out.println("Enter Leave Reason: ");
        leaveRequest.setLeaveReason(sc.next());

//        System.out.println("Enter Number of Days: ");
//        leaveRequest.setNoOfDays(sc.nextInt());

        System.out.println(leaveBal.addLeaveRequest(leaveRequest));
    }

    
    public static void showAllLeaveRequests() {
        List<Leave> leaveRequests = leaveBal.showAllLeaveRequests();
        if (leaveRequests.isEmpty()) {
            System.out.println("No leave requests found.");
        } else {
            for (Leave leaveRequest : leaveRequests) {
                System.out.println(leaveRequest);
            }
        }
    }

    
    public static void searchLeaveRequest() {
        System.out.println("Enter Leave ID to search: ");
        int leaveId = sc.nextInt();

        Leave leaveRequest = leaveBal.searchLeaveRequestById(leaveId);
        if (leaveRequest != null) {
            System.out.println(leaveRequest);
        } else {
            System.out.println("Leave request not found.");
        }
    }

   
    public static void updateLeaveRequest() throws ParseException, LeaveException {
        System.out.println("Enter Leave ID to update: ");
        int leaveId = sc.nextInt();

        Leave leaveRequest = leaveBal.searchLeaveRequestById(leaveId);

        if (leaveRequest != null) {
            System.out.println("Enter updated Leave Start Date (yyyy-MM-dd): ");
            leaveRequest.setLeaveStartDate(sdf.parse(sc.next()));

            System.out.println("Enter updated Leave End Date (yyyy-MM-dd): ");
            leaveRequest.setLeaveEndDate(sdf.parse(sc.next()));

            System.out.println("Enter updated Employee ID: ");
            leaveRequest.setEmpId(sc.nextInt());

            System.out.println("Enter updated Employee Name: ");
            leaveRequest.setEmpName(sc.next());

            System.out.println("Enter updated Leave Type (EL/PL/ML): ");
            leaveRequest.setLeaveType(LeaveType.valueOf(sc.next().toUpperCase()));

            System.out.println("Enter updated Leave Reason: ");
            leaveRequest.setLeaveReason(sc.next());

            System.out.println("Enter updated Number of Days: ");
            leaveRequest.setNoOfDays(sc.nextInt());

            System.out.println(leaveBal.updateLeaveRequest(leaveRequest));
        } else {
            System.out.println("Leave request not found.");
        }
    }

    
    public static void deleteLeaveRequest() {
        System.out.println("Enter Leave ID to delete: ");
        int leaveId = sc.nextInt();

        System.out.println(leaveBal.deleteLeaveRequestById(leaveId));
    }
}
