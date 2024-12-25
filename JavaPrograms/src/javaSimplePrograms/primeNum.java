package javaSimplePrograms;

import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class primeNum {
	
	
public static void main(String[] args) {
	
	int num,count=0;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter a number");
	
	num=sc.nextInt();
	
	sc.close();
	
	
	for(int i=1;i<=num;i++) {
		
		if(num%i==0) {
			
			count++;
		}
	}
		if(count==2){
			System.out.println("Prime number");
			
		}else {
			
			System.out.println("Not a prime number");
		}
	}
}
	
	

	