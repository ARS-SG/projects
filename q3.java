package hw.loophw;
import java.util.*;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
        int count = 10;

        // Loop to take 10 integers as input
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter integer " + i + ": ");
            int number = sc.nextInt(); // Read the integer from user
            sum += number; // Add the number to the sum
        }

        // Calculate the average
        double average = (double) sum / count;

        // Print the average value
        System.out.printf("The average of the entered integers is: %.2f\n", average);
	}

}
