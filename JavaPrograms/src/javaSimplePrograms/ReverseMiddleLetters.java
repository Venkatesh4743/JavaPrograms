package javaSimplePrograms;

import java.util.Scanner;

public class ReverseMiddleLetters {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with at least three words:");

        String sentence = sc.nextLine();
        sc.close();
        String[] words = sentence.split(" ");
        
        // Ensure the sentence has at least three words
        if (words.length < 3) {
            System.out.println("The sentence must have at least three words.");
            return;
        }
        
        // Identify the middle two words
        int midIndex = words.length / 2;
        String middleFirst = words[midIndex - 1];
        String middleSecond = words[midIndex];
        
        // Reverse the middle two words
        String reversedMiddleFirst = new StringBuilder(middleFirst).reverse().toString();
        String reversedMiddleSecond = new StringBuilder(middleSecond).reverse().toString();
        
        // Reconstruct the sentence with the reversed middle words
        words[midIndex - 1] = reversedMiddleFirst;
        words[midIndex] = reversedMiddleSecond;
        
        // Join the words back into a sentence
        String result = String.join(" ", words);
        
        // Print the result
        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + result);
    }
}

