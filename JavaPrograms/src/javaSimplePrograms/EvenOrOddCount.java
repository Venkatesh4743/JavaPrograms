package javaSimplePrograms;
import java.util.Scanner;

public class EvenOrOddCount {
    
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int evenCount = 0;
        int oddCount = 0;
        int digit;

        while (number != 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);
    }
}
