package hw.loophw;

import java.util.*;


public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Variable to hold the reversed number
        int reversedNumber = 0;

        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
	}

}
