package com.java;

public class P17 {
public static void main(String[] args) {
try {
System.out.println("B");
throw new NumberFormatException();
} catch(ArithmeticException e) {
System.out.println("A");
} catch(NumberFormatException e) {
System.out.println("X");
} catch(Exception e) {
System.out.println("C");
} finally {
System.out.println("Z");
}
}

}