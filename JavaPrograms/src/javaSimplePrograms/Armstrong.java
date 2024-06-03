package javaSimplePrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		  // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number");
        
        // Read the user input and store it in the variable 'num'
        int num = sc.nextInt();
        
        // Close the scanner as it's no longer needed
        sc.close();
        
        // Store the original number for later comparison
        int originalNum = num;
        
        // Initialize a variable to hold the sum of the cubed digits
        int cubedNum = 0;

        // Loop through each digit of the number
        while (num > 0) {
            // Get the last digit of the number
            int remainder = num % 10;
            
            // Add the cube of the digit to 'cubedNum'
            cubedNum = cubedNum + (remainder * remainder * remainder);
            
            // Remove the last digit from the number
            num = num / 10;
        }

        // Check if the original number is equal to the sum of the cubed digits
        if (originalNum == cubedNum) {
            // Print that the number is an Armstrong number
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            // Print that the number is not an Armstrong number
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
}