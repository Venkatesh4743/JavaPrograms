package javaSimplePrograms; // Package name

public class VowelsFinding { // Class declaration

    public static void main(String[] args) { // Main method

        String str = "automation"; // String variable with value "automation"
        
        // Loop through each character in the string(ITERATOR)
        for(int i = 0; i < str.length(); i++) {
            
            // Check if the character is a vowel()||get the character at the i-th index of a string
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                // Print the vowel
                System.out.println(str.charAt(i));
            }
        }
    }
}
