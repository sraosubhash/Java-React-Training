package Day2;

import java.util.Scanner;

public class Factorial {
	
	public void show(int x) {
		int f =1,i=1;
		while(i<=x) {
			f = f*i;
			i++;
		}
		System.out.println("Factorial value is "+f);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value ");
		n= sc.nextInt();
		new Factorial().show(n);

	}

}
