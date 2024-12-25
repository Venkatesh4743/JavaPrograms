package javaSimplePrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int num, count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number"); 
        
        num = sc.nextInt();
        sc.close();
        // Loop through numbers from 1 to n
        for(int i = 1; i <= num; i++) {
            // Check if i is a factor of n
            if(num % i == 0) {
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


//First Iteration (i = 1):
//
//7 % 1 == 0 is true, so count is incremented by 1.
//count becomes 1.
//Second Iteration (i = 2):
//
//7 % 2 == 0 is false, so count remains 1.
//Third Iteration (i = 3):
//
//7 % 3 == 0 is false, so count remains 1.
//Fourth Iteration (i = 4):
//
//7 % 4 == 0 is false, so count remains 1.
//Fifth Iteration (i = 5):
//
//7 % 5 == 0 is false, so count remains 1.
//Sixth Iteration (i = 6):
//
//7 % 6 == 0 is false, so count remains 1.
//Seventh Iteration (i = 7):
//
//7 % 7 == 0 is true, so count is incremented by 1.
//count becomes 2.
