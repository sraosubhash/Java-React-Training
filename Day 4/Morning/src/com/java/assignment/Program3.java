package com.java.assignment;

import java.util.Scanner;

public class Program3 {
	
	public static String numToWords(int num) {
        if (num < 1 || num > 9999) {
            return "Number out of range (1-9999 only)";
        }

        String result = "";

        // For thousands place
        int thousands = num / 1000;
        if (thousands > 0) {
            result += getWord(thousands) + " Thousand ";
        }
        num %= 1000;

        // For hundreds place
        int hundreds = num / 100;
        if (hundreds > 0) {
            result += getWord(hundreds) + " Hundred ";
        }
        num %= 100;

        // For tens and ones
        if (num > 10 && num < 20) {
            result += getTeens(num);
        } else {
            int tens = num / 10;
            if (tens > 0) {
                result += getTens(tens) + " ";
            }
            int ones = num % 10;
            if (ones > 0) {
                result += getWord(ones) + " ";
            }
        }

        return result.trim(); // Trim any trailing spaces
    }

    private static String getWord(int num) {
        switch (num) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

    private static String getTeens(int num) {
        switch (num) {
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            default: return "";
        }
    }

    private static String getTens(int num) {
        switch (num) {
            case 1: return "Ten";
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be converted into words:");
        num = sc.nextInt();

        Program3 obj = new Program3();
        System.out.println(obj.numToWords(num));
    }

}
