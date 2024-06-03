package javaSimplePrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		
		int[]ar= {4,8,9,7,7,1};
		
		int start=0;
		int last= ar.length-1;
		
		int temp;
		
		while(start>last) {
			
			 temp=ar[start];
			 ar[start]=ar[last];
			 
			 ar[last]=temp;
			 
			 start++;
			 last--;
			 
		}			
		System.out.println(Arrays.toString(ar));

	}

}
