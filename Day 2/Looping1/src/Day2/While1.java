package Day2;

public class While1 {
	
	public void loop() {
		int i=0,counter=10;
		while(i<counter) {
			System.out.println("Hi "+i);
			i++;
		}
	}

	public static void main(String[] args) {
		new While1().loop();

	}

}
