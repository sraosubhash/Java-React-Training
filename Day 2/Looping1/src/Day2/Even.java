package Day2;

import java.util.Scanner;

public class Even {
	
	public void Show(int n) {
		int i=0;
		while(i<n) {
			i=i+2;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter value of n");
		n= sc.nextInt();
		new Even().Show(n);

	}

}
