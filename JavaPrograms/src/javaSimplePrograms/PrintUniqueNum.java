package javaSimplePrograms;

import java.util.ArrayList;

public class PrintUniqueNum {

	
		public static void main(String[] args) {
	        // Initialize the array with duplicate values
	        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

	        // Create an ArrayList to store unique elements from the array
	        ArrayList<Integer> uniqueElements = new ArrayList<>();

	        // Iterate through the array to identify unique numbers
	        for (int i = 0; i < a.length; i++) {
	            int count = 0;

	            // Check if the current element is already in the uniqueElements list
	            if (!uniqueElements.contains(a[i])) {
	                uniqueElements.add(a[i]);
	                count++; // Increment count for the current element

	                // Check for duplicates of the current element in the rest of the array
	                for (int j = i + 1; j < a.length; j++) {
	                    if (a[i] == a[j]) {
	                        count++;
	                    }
	                }

	                // Print the element if it is unique
	                if (count == 1) {
	                    System.out.println(a[i] + " is a unique number");
	                }
	            }
	        }
	    }
	

	}


