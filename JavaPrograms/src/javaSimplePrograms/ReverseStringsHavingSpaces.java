package javaSimplePrograms;

import java.util.Scanner;

public class ReverseStringsHavingSpaces {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the input string from the user
        // Example: input -> "I  am  XYZ"
        String s1 = sc.nextLine();
        
        // Close the scanner to free up resources
        sc.close();
        
        // Convert the input string into a character array
        char c1[] = s1.toCharArray();
        
        // Create another character array of the same length to store the result
        char c2[] = new char[c1.length];
        
        // Preserve spaces in the result array
        for (int i = 0; i < c1.length; i++) {
            // If the current character is a space
            if (c1[i] == ' ') {
                // Copy the space to the corresponding index in the result array
                c2[i] = ' ';
            }
        }

        // Initialize a pointer to start from the end of the result array
        int j = c2.length - 1;

        // Dry-run example:
        // Input: "I  am  XYZ"
        // c1 = ['I', ' ', ' ', 'a', 'm', ' ', ' ', 'X', 'Y', 'Z']
        // c2 = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']
        // After preserving spaces: c2 = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']

        // Reverse non-space characters
        for (int i = 0; i < c1.length; i++) {
            // If the current character is not a space
            if (c1[i] != ' ') {
                // Move the `j` pointer to skip spaces in the result array
                while (c2[j] == ' ') {
                    j--;
                }
                // Place the character from the input array into the result array
                c2[j] = c1[i];
                // Move the pointer for the result array to the left
                j--;
            }
        }

        // Dry-run after the loop:
        // c2 = ['Z', ' ', ' ', 'Y', 'X', ' ', ' ', 'm', 'a', 'I']
        // Resulting string: "Z  YX  maI"
        
        // Convert the result array to a string and print it
        System.out.println(String.valueOf(c2));
    }
}