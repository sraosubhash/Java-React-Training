package Day2;

import java.util.Scanner;

public class Stud {
	
	static Scanner sc = new Scanner(System.in);
	public void readstud(int n) {
		Student[] StArr = new Student[n];
		for(int i=0;i<StArr.length;i++) {
			System.out.println("Enter "+(i+1)+" student details");
			System.out.println("Enter student ID, Name, City and CGPA");
			StArr[i]=new Student();
			StArr[i].sid=sc.nextInt();
			StArr[i].name = sc.next();
			StArr[i].city = sc.next();
			StArr[i].cgpa = sc.nextDouble();
			
		}
		
		System.out.println("------------------------");
		for (Student s : StArr) {
			System.out.println(s);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number of students");
		n = sc.nextInt();
		new Stud().readstud(n);
		

	}

}
