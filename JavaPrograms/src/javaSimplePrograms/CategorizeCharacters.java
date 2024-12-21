package javaSimplePrograms;

public class CategorizeCharacters {
    public static void main(String[] args) {
        // Example string
        String str = "123@#abc";

        // Function call to categorize the characters
        categorizeCharacters(str);
    }

    /**
     * Function to categorize characters of the input string into special characters,
     * numbers, and alphabets.
     * @param s1 Input string containing mixed characters
     */
    public static void categorizeCharacters(String str) {
        // Strings to store categorized characters
        StringBuilder specialChars = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If the character is a digit, append it to 'numbers'
                numbers.append(ch);
           
            } else if (Character.isLetter(ch)) {
                // If the character is a letter, append it to 'alphabets'
                alphabets.append(ch);
           
            } else {
                // If the character is neither a digit nor a letter, it is a special character
                specialChars.append(ch);
            }
        }

        // Print the categorized strings
        System.out.println("Special Characters: " + specialChars.toString());
        System.out.println("Numbers: " + numbers.toString());
        System.out.println("Alphabets: " + alphabets.toString());
    }
}

//Note if else if follow this pattern

	//Difference between str.toCharArray and str.charAt(i)

	//String str = "hello";
	//char[] charArray = str.toCharArray();
	// charArray will be ['h', 'e', 'l', 'l', 'o']

	//String str = "hello";
	//char ch = str.charAt(1);
	// ch will be 'e' (the character at index 1)



//In summary, choose str.toCharArray() for working with all characters collectively,
//and
//str.charAt(i) for accessing specific characters efficiently.



