package Day2;

import java.util.Scanner;

public class ForFact {
	public void show(int x) {
		int f =1;
		for(int i=1; i<=x;i++) {
			f=f*i;
			System.out.println("Factorial of "+i+" is "+f);
		}
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value ");
		n= sc.nextInt();
		new ForFact().show(n);

	}

}
