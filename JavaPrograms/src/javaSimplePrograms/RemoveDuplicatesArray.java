package javaSimplePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		
		int[]a= {10,5,5,8,7,8,5};
		Set<Integer> st=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			st.add(a[i]);
		}
		Integer[] b = st.toArray(new Integer[st.size()]);
		
		System.out.println(Arrays.toString(b));
	}

}
