package com.java.leave.main;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.java.leave.blay.LeaveBlay;
import com.java.leave.model.Leave;

public class LeaveMain {
	
	static LeaveBlay levBlay;
	static Scanner sc;
	static SimpleDateFormat sdf;
	
	static {
		levBlay = new LeaveBlay();
		sc = new Scanner(System.in);
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public static void addLeaveMain() {
		Leave lev = new Leave(); 
	}

}
