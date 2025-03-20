package com.java.jdk8;


import java.io.FileReader;
import java.io.IOException;

public class Task2 {
	
	public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }	
	
    public static void main(String[] args) {

        try {
        	FileReader fr = new FileReader("C:/files/test.txt");
        	
            StringBuilder Content = new StringBuilder();
            
            int character;
            while ((character = fr.read()) != -1) {
                Content.append((char) character);
            }


            String[] words = Content.toString().split(" ");
            for (String word : words) {
                if (isInteger(word)) {
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
