package javaSimplePrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Revising {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		String input=sc.nextLine();
		sc.close();
		
		if(isPalindrome(input)) {
			
			System.out.println("palindrome number");
		}else {
			
			System.out.println("not a palindrome number ");
		}
	
		}
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder sbd= new StringBuilder(str);
		
		sbd.reverse();
		
		return str.equals(sbd.toString());
	}
}
 			

	




