package javaSimplePrograms;

public class ReverseLastTwoLetters {
	
	    public static void main(String[] args) {
	        // Sample word
	        String word = "Automation";
	        
	     // Ensure the word has at least two characters
	        if (word.length() < 2) {
	            System.out.println("Word must have at least two characters.");
	            return;
	        }
	        
	        // Get the part of the word excluding the last two characters
	        String initialPart = word.substring(0, word.length() - 2);
	        
	        // Get the last two characters and reverse them
	        String lastTwoReversed = new StringBuilder(word.substring(word.length() - 2)).reverse().toString();
	        
	        // Concatenate the initial part with the reversed last two characters
	        String result = initialPart + lastTwoReversed;
	        
	        // Print the result
	        System.out.println("Original word: " + word);
	        System.out.println("Modified word: " + result);
	    }
	}


