package Day2;

public class EmpTest {
	
	public static void main(String[] args) {
		Employ emp1 = new Employ();
		emp1.empno = 1;
		emp1.name = "ASH";
		emp1.basic = 29876;
		
		Employ emp2 = new Employ();
		emp2.empno = 2;
		emp2.name = "Subhash";
		emp2.basic = 47865;
		
		Employ emp3 = new Employ();
		emp3.empno = 1;
		emp3.name = "Harshi";
		emp3.basic = 86586;
		
		Employ emp4 = new Employ();
		emp4.empno = 2;
		emp4.name = "Zoro";
		emp4.basic = 0;
		
		Employ[] emparr = new Employ[] {emp1,emp2,emp3,emp4};
		
		for (Employ employ : emparr) {
			System.out.println(employ);
		}
		
	}

}
