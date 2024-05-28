package javaSimplePrograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		int fact = factorial(num);
		System.out.println(fact);
	}
	
	
	public static int factorial(int n) {
		
		
		if(n==0) {
			
			return 1;
		}
		else {
			
			return n*factorial(n-1);
			
			
		}
	}

}
