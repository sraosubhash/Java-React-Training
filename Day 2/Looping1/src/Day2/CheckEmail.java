package Day2;

import java.util.Scanner;

public class CheckEmail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter your email");
		str = sc.nextLine();
		int flag = -1;
		flag = str.indexOf("@"); //use contains method
		
		if (flag==-1) {
			System.out.println("Invalid email");
		}else {
			System.out.println("Valid email");
		}
		
		
		

	}

}
