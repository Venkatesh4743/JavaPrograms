package javaSimplePrograms;

public class ArraySecondLargest {
	

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 4, 45, 99, 67};

	        int firstLargest, secondLargest;

	        // Initialize the largest and second largest with the minimum possible integer value
	        firstLargest = secondLargest = Integer.MIN_VALUE;

	        // Loop through all elements of the array
	        for (int i = 0; i < arr.length; i++) {

	            // If the current element is larger than the first largest,
	            // then update second largest and first largest
	            if (arr[i] > firstLargest) {
	                secondLargest = firstLargest;
	                firstLargest = arr[i];
	            } 
	            // If the current element is not equal to the first largest and is greater than the second largest,
	            // then update the second largest
	            else if (arr[i] > secondLargest && arr[i] != firstLargest) {
	                secondLargest = arr[i];
	            }
	        }

	        // Handle the case when there is no second largest element
	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element in the array.");
	        } else {
	            System.out.println("The second largest element in the array is: " + secondLargest);
	        }
	    }
	}


