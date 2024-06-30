package javaSimplePrograms;

import java.util.HashMap;

	public class NumberCountOccurrence {
	    public static void main(String[] args) {
	        // Create a HashMap to store number counts
	        HashMap<Integer, Integer> numberCountMap = new HashMap<>();

	        // Sample array
	        int[] ar = {2, 4, 5, 2, 2, 4, 8, 9, 8};

	        // Iterate over each number in the array
	        for (int num : ar) {
	            // If the number is already in the map, increment its count
	            if (numberCountMap.containsKey(num)) {
	                numberCountMap.put(num, numberCountMap.get(num) + 1);
	            } else {
	                // If the number is not in the map, add it with a count of 1
	                numberCountMap.put(num, 1);
	            }
	        }

	        // Iterate over the map and print each key-value pair
	        for (HashMap.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
	            System.out.println("Number: " + entry.getKey() + " Count: " + entry.getValue());
	        }
	    }
	}


