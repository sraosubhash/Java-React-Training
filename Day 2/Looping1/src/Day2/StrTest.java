package Day2;

public class StrTest {
	
	public void test() {
		String str = "Welcome to Java Programming.. with trainer Prasanna";
		System.out.println("String is "+str);
		System.out.println("Length of string is "+str.length());
		System.out.println("Char at 5th position is "+ str.charAt(5));
		System.out.println("First occurance of charater 'o is "+ str.indexOf('o'));
		System.out.println("7Lower case of string "+ str.toLowerCase());
		System.out.println("Upper case of string "+ str.toUpperCase());
		String s1="ASH",s2="Subhash";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(str.compareTo(s1));
		System.out.println("Replacing string: " + str.replace("Java","J2EE"));
	}
	
	public static void main(String[] args) {
		
		new StrTest().test();
		
	}

}
