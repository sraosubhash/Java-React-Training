package Day2;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		String x="",p="";
		System.out.println("Enter a string");
		s = sc.nextLine();
		for(int i=0;i<s.length();i++){
			
			 if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
		                || s.charAt(i) == 'u' || s.charAt(i) == 'A'|| s.charAt(i) == 'E' 
		                || s.charAt(i) == 'I'|| s.charAt(i) == 'O'|| s.charAt(i) == 'U') {
				 x+=s.charAt(i);
				 
			}else {
				p+=s.charAt(i);
			}
		}
		System.out.println("String without vowels "+p);
		System.out.println(x);
	}

}
