package javaSimplePrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num=sc.nextInt();
		 sc.close();
		 int originalNum = num;
		 int cubedNum=0;
		 
		 while(num>0) {
			 
			 int remainder = num%10;
			  cubedNum = cubedNum+(remainder*remainder*remainder);
			 num= num/10;
			 
			 
		 }if(originalNum==cubedNum) {
			 
			 System.out.println(originalNum+" It is a Armstrong number");
		 }else {
			 
			 System.out.println(originalNum+" Not a Armstrong number");
		 }
	}

}
