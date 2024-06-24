package javaSimplePrograms;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a numbers");
		int num = sc.nextInt();
		sc.close();
		
		int sum=0;
		while(num>0) {
			
			int remainder = num%10;
			 sum=sum+remainder;
			 
			 num=num/10;
			 
			
		}
		System.out.println(sum);
	}

}
