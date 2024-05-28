package javaSimplePrograms;

import java.util.Scanner;

public class prm {

	public static void main(String[] args) {
		int n,count=0;
		
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
				count++;
				
			}if(count==1) {
				System.out.println("Prime number");
				
				
			}else {
				System.out.println("Not a prime number");
			}
		}
		
	}

}
