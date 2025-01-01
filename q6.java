package hw.loophw;

import java.util.*;


public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Variable to hold the sum of digits
        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10;       // Remove the last digit from the number
        }

        // Print the result
        System.out.println("The sum of the digits is: " + sum);

	}

}
