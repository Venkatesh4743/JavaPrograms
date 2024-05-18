package javaSimplePrograms;
	import java.util.Scanner;

	public class PalindromeNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        // Create a StringBuilder from the input string
	        StringBuilder sbd = new StringBuilder(str);
	        // Reverse the StringBuilder
	        sbd.reverse();
	        // Check if the reversed string equals the original string
	        return str.equals(sbd.toString());
	    }
	}

