package javaSimplePrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		
		System.out.println("Enter a term");
		Scanner sc = new Scanner(System.in);
		term=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=term;i++) {
			
			System.out.println(a);
			
			c=a+b;
			a=b;
			b=c;
		}
	}

}
