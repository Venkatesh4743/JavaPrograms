package javaSimplePrograms;

public class CharacterOccurences {
	
	    public static void main(String[] args) {
	        String str = "Hello, World!"; // Change this to your input string
	        char target = 'l'; // Change this to the character you want to count
	        int count = countOccurrences(str, target);
	        System.out.println("Number of occurrences of '" + target + "' in the string: " + count);
	    }

	    // Method to count the occurrences of a character in a string
	    public static int countOccurrences(String str, char target) {
	        int count = 0; // Initialize a variable to count occurrences
	        // Loop through each character in the string
	        for (char c : str.toCharArray()) {
	            // Check if the current character matches the target character
	            if (c == target) {
	                count++; // Increment the count if there is a match
	            }
	        }
	        return count; // Return the total count of occurrences
	    }
	}


