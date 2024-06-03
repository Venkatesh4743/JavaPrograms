package javaSimplePrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//This can apply for both number and string
		Scanner sc = new  Scanner(System.in);		
		System.out.println("Enter a Numbers");
		int num= sc.nextInt();
		sc.close();
		// using StringBuffer class
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println(rev);
		
		//Using StringBuilder class
//		StringBuilder sbd= new StringBuilder();
//		sbd.append(num);
//		StringBuilder rev=sbd.reverse();
//		System.out.println(rev);
		// Initialize a variable to store the reversed number
		
		int reversedNum = 0;

		// Loop to reverse the digits of the number 'num'
		// Continue looping until 'num' is greater than 0
		while (num > 0) {
		    // Get the last digit of 'num' using the modulus operator
		    int remainder = num % 10;
		    
		    // Build the reversed number by shifting the current digits
		    // of 'reversedNum' to the left and adding the remainder
		    reversedNum = (reversedNum * 10) + remainder;
		    
		    // Remove the last digit from 'num' by performing integer division by 10
		    num = num / 10;
		    
		    // Print the current state of 'reversedNum' to the console
		    System.out.println(reversedNum);
		}

		}

	}


