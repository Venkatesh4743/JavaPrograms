package javaSimplePrograms;

public class StringIsNumeric {

		 public static void main(String[] args) {
		        String input = "12345"; // Change this to any input string
		        System.out.println(isNumeric(input));
		    }

		    public static boolean isNumeric(String str) {
		        if (str == null || str.isEmpty()) {
		            return false;
		        }
		        for (char c : str.toCharArray()) {
		            if (!Character.isDigit(c)) {
		                return false;
		            }
		        }
		        return true;
		    }
		
	}

//for (char c : str.toCharArray()) { ... }: This line converts the input string into an array of characters 
//and 
//then iterates through each character in that array.
//char c represents each character in the string during each iteration of the loop.
//if (!Character.isDigit(c)) { return false; }: Inside the loop, 
//this line checks if the current character (c) is not a digit. If it's not a digit, the method immediately returns false, indicating that the string is not numeric.
