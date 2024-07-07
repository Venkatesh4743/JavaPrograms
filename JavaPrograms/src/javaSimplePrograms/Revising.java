package javaSimplePrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;


class Revising {

	public static void main(String[] args) {
		int count=0,n;

	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
			 n=sc.nextInt();
			sc.close();
			for(int i=1;i<=n;i++) {
				
				if(n%i==0) {
					count++;
				}
			}
					if(count==2) {
						
						System.out.println("prime number");
					}else {
						System.out.println("not a prime number");
					}
				}
		}


