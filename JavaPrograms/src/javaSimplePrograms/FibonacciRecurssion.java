// Package declaration
package javaSimplePrograms;

// Class definition for Fibonacci using recursion
public class FibonacciRecurssion {

    // Recursive method to find the nth Fibonacci number
    static int fibo(int n) {
        
        // Base cases: if n is 1 or 2, return 1
        if (n == 1 || n == 2) {
            return 1;
        }
        
        // Recursive case: return the sum of the (n-1)th and (n-2)th Fibonacci numbers
        return fibo(n - 1) + fibo(n - 2);
    }
    
    // Main method: entry point of the program
    public static void main(String[] args) {
        
        // Print the 2nd Fibonacci number
        System.out.println(fibo(15));
    }
}
