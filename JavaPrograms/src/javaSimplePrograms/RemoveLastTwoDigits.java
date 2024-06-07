package javaSimplePrograms;

public class RemoveLastTwoDigits {
    // Define the main class

    public static void main(String[] args) {
        // The main method where program execution begins

        int[] array = {1234, 5678, 91011, 121314};
        // Initialize an array with example integers

        int[] modifiedArray = removeLastTwoDigits(array);
        // Call the function to remove the last two digits from each array element
        // and store the result in 'modifiedArray'

        System.out.println("Modified array:");
        // Print a header for the output

        for (int num : modifiedArray) {
            System.out.println(num);
            // Print each number in the modified array
        }
    }

    /**
     * Function to remove the last two digits of each number in the array
     * @param array Input array of integers
     * @return Modified array with last two digits removed from each element
     */
    public static int[] removeLastTwoDigits(int[] array) {
        // Define a static method to perform the operation on the array

        int[] modifiedArray = new int[array.length];
        // Create a new array of the same length as the input array
        // to store the modified values

        for (int i = 0; i < array.length; i++) {
            // Iterate over each element in the input array

            modifiedArray[i] = array[i] / 100;
            // Remove the last two digits by dividing the element by 100
            // and store the result in the new array
        }

        return modifiedArray;
        // Return the modified array
    }
}

