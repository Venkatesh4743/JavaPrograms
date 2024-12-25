package javaSimplePrograms;


	public class ArrayMissingNum {
		
	    public static void main(String[] args) {
	        int numbers[] = {1, 2, 4, 5, 6};
	        int totalNumbers = 6;
	        
	        // Calculate the sum of all numbers from 1 to totalNumbers
	        int totalSumOfAllNumbers = (totalNumbers * (totalNumbers + 1)) / 2;
	        System.out.println("Total sum of numbers from 1 to " + totalNumbers + ": " + totalSumOfAllNumbers);

	        // Calculate the sum of the numbers in the given array
	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum = sum + numbers[i];
	        }

	        System.out.println("Sum of the numbers in the array: " + sum);
	        
	        // Find and print the missing number
	        System.out.println("The missing number is: " + (totalSumOfAllNumbers - sum));
	    }
	}

