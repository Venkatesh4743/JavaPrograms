package javaSimplePrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
	    
	    // Initialize an array with given values
	    int[] a = {10, 5, 5, 8, 7, 8, 5};
	    
	    // Create a HashSet to store unique elements
	    Set<Integer> st = new HashSet<Integer>();
	    
	    // Add each element of the array to the HashSet
	    for (int i = 0; i < a.length; i++) {
	        st.add(a[i]);
	    }
	    
	    // Convert the HashSet to an array of Integers
	    Integer[] b = st.toArray(new Integer[st.size()]);
	    
	    // Print the array of unique elements
	    System.out.println(Arrays.toString(b));
	}
}
