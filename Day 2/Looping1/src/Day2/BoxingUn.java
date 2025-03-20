package Day2;

public class BoxingUn {
	
	public void show(Object ob) {
		if (ob instanceof Integer) {
			int x = (Integer)ob;
			System.out.println("integer Casting "+x);
		}
		if (ob instanceof String) {
			String x = (String)ob;
			System.out.println("String Casting "+x);
		}
		if (ob instanceof Double) {
			double x = (Double)ob;
			System.out.println("Double Casting "+x);
		}
	}

	public static void main(String[] args) {
		int a = 12;
		double b = 12.5;
		String s ="Hello";
				
				/* Implementing Boxing*/
		Object ob1 = a;
		Object ob2 = b;
		Object ob3 = s;
		
				/*Implementing Un-boxing*/
		
		BoxingUn box = new BoxingUn();
		box.show(a);
		box.show(b);
		box.show(s);
	}

}
