package hw.loophw;
import java.util.*;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        // Define the cost per unit
        int costPerUnit = 100;
        
        // Prompt the user for quantity
        System.out.print("Enter the quantity of items you want to purchase: ");
        int quantity = sc.nextInt();
        
        // Calculate total cost without discount
        int totalCost = quantity * costPerUnit;
        
        // Apply discount if total cost exceeds 1000
        if (totalCost > 1000) {
            totalCost *= 0.9; // Apply 10% discount
            System.out.println("A discount of 10% has been applied.");
        }
        
        // Print the final total cost
        System.out.println("The total cost is: " + totalCost);

	}

}
