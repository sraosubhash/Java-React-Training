package Day2;

import java.util.Scanner;

public class DuplicateStr {
	 static Scanner sc= new Scanner(System.in);
	
	public void Isdup(int n) {
		String str[]= new String[n];
		System.out.println("Enter the string : ");
		for(int i=0;i<n;i++) {
		  str[i]= sc.next();
		}
		
		for(int i=0;i<str.length;i++){
			int count=0;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j]))
				count++;
				
			}
			if(count>0) {
				System.out.println(str[i]);
				break;
			}
		}
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n value : ");
		n=sc.nextInt();
		new DuplicateStr().Isdup(n);
		
 
	}
 
}
 