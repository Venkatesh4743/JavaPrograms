package javaSimplePrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int n, count = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        // Loop through numbers from 1 to n
        for(int i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if(n % i == 0) {
                count++; // Increment the count of factors
            }
        }
        
        // A prime number has exactly two factors: 1 and itself
        if(count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
