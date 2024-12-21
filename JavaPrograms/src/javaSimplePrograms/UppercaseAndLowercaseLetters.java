package javaSimplePrograms;

public class UppercaseAndLowercaseLetters {

	public static void main(String[] args) {
		String str = "Welcome to Automation";
		int lower = 0, upper = 0;

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
		   
			// Get the character at the current index of the string
			char c = str.charAt(i);//we need to convert String to char
		   
		    if (c >= 'A' && c <= 'Z') {
		        upper++;
		   
		    } else if (c >= 'a' && c <= 'z') {// Note=here else if not else 
		        lower++;
		    }
		}
		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);

	}

}
