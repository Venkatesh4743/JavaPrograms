package javaSimplePrograms;

public class StringToIntConversion {

	public static void main(String[] args) {
		   // Convert String to Integer
        String strNumber = "12345"; // Change this to any numeric string
        int number = Integer.parseInt(strNumber);
        System.out.println("String to Integer Conversion: " + number);

        // Convert Integer to String
        int intNumber = 12345; // Change this to any integer
        String strConverted = String.valueOf(intNumber);
        System.out.println("Integer to String Conversion: " + strConverted);
    }

		
	}


