package Day2;

import java.util.Scanner;

public class Factors {
	
	public void show(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		n = sc.nextInt();
		System.out.println("Factors of "+n+" are:");
		new Factors().show(n);

	}

}
