package javaSimplePrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesString {

    public static void main(String[] args) {

        // Define the input string
        String str = "collection";
        
        // Create a LinkedHashSet to store characters, ensuring uniqueness and maintaining insertion order
        Set<Character> set = new LinkedHashSet<Character>();
        
        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Add each character to the set (duplicates will be automatically ignored)
            set.add(str.charAt(i));
        }
        
        // Create a StringBuffer to build the result string
        StringBuffer sf = new StringBuffer();
        
        // Iterate over each character in the set
        for (Character ch : set) {
            // Append the character to the StringBuffer
            sf.append(ch);
            
            // Print the current state of StringBuffer after each addition
            System.out.println(sf);
        }
    }
}
