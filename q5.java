package hw.loophw;
import java.util.*;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=1,sum=0,count=0;
		Scanner sc = new Scanner (System.in);
		while(true){
			System.out.println("enter num. (press 'q' to quit): ");
            String input = sc.nextLine();
            if (input.equals("q")) {
                break; // Exit the loop
            }
            int number = Integer.parseInt(input);
            sum += number;
            product *= number;
            count++;
            
            if (count > 0) {
                // Calculate average
                double average = (double) sum / count;
                
                // Print the results
                System.out.printf("Average of entered numbers:"+ average);
                System.out.println("Product of entered numbers: " + product);
		}
            else {
                System.out.println("No numbers were entered.");
            }

	}

}}
