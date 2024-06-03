package javaSimplePrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAscendingAndDesscending {

	public static void main(String[] args) {

		
		ArrayList<Integer> alist= new ArrayList<Integer>();
		
		alist.add(45);
		alist.add(78);
		alist.add(12);
		alist.add(16);
		alist.add(2);
		
		System.out.println(alist);
		
		Collections.sort(alist);
		System.out.println(alist);
		
		Collections.sort(alist,Collections.reverseOrder());//here after alist comma(,)need to be used not dot(.)
		System.out.println(alist);

	}

}
