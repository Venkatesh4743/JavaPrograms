package javaSimplePrograms;

import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class practice {
	
	public static void main(String[] args) {
	
	String str ="level";
	
	String rstr="";
	
	
	for(int i=0;i<str.length();i++) {
		
		char ch = str.charAt(i);
		
		rstr=ch+rstr;
	}
		System.out.println(rstr);
		
		
		if(str.equals(rstr)) {
			
			System.out.println("Given word is palindrome");
		}else {
			
			System.out.println("not a palindrome");
		}
	}
	
	
	
	
}
