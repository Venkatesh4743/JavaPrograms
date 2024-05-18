package javaSimplePrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//This can apply for both number and string
		Scanner sc = new  Scanner(System.in);		
		System.out.println("Enter a Stringliterals");
		String num= sc.next();
		sc.close();
		// using StringBuffer class
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println(rev);
		
		//Using StringBuilder class
		StringBuilder sbd= new StringBuilder();
		sbd.append(num);
		StringBuilder rev=sbd.reverse();
		System.out.println(rev);
		
		
		
	}

}
