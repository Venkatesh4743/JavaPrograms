package javaSimplePrograms;

import java.util.Scanner;

public class CountNumOfWords {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER SENTENCE YOU LIKE");
		String str = sc.nextLine();
		sc.close();
		
		String[] strarry = str.split(" ");
		
	System.out.println(strarry.length);
	}

}
