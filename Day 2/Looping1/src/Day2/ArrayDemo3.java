package Day2;

public class ArrayDemo3 {
	
	public void copy() {
		int [] a = {1,3,4,5,7,11};
		int [] b = a;
		for (int i : b) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new ArrayDemo3().copy();

	}

}
