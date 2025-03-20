package Day2;

public class StudTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.sid = 1;
		s1.name = "ASH";
		s1.city = "Zoroland";
		s1.cgpa = 9;
		
		s2.sid = 2;
		s2.name = "Subhash";
		s2.city = "Loguetown";
		s2.cgpa = 8.75;
		
		s3.sid = 3;
		s3.name = "Kirito";
		s3.city = "Whole Cake Island";
		s3.cgpa = 9.5;
		
		s4.sid = 4;
		s4.name = "Zoro";
		s4.city = "Raftel";
		s4.cgpa = 3.75;
		
		Student[] st = new Student[] {s1,s2,s3,s4};
		
		for (Student stud : st) {
			System.out.println(stud);
		}
		

	}

}
