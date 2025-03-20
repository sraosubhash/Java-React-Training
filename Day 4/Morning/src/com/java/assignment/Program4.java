package com.java.assignment;

import java.util.Scanner;

public class Program4 {
	
	public String revFun(String s) {
		String res=" ";
		for(int i=0;i<s.length();i++) {
			res=s.charAt(i)+res;
		}
		return res;
	}
	
 
	public void revCall(String s) {
		String res="";
		String arr[]=s.split(" ");
		int index=0;
		for (String str : arr) {
			if(index%2==0) {
				res=res+" "+revFun(str);
			}
			else {
				res=res+" "+str;
			}
			
		index++;
	}
	System.out.println(res);
	
}
 
	public static void main(String[] args) {
		
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be Reversed : ");
		s=sc.nextLine();
		
		new Program4().revCall(s);
		sc.close();
 
	}
	

}
