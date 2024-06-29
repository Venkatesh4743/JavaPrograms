package javaSimplePrograms;
import java.util.Scanner;

public class EvenOrOddCount {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int evenCount = 0;
        int oddCount = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num =num/ 10;
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }
}
