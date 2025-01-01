package hw;
import java.util.*;
public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Ask the user to enter the basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate the dearness allowance (DA) and house rent allowance (HRA)
        double DA = 0.40 * basicSalary;  // 40% of basic salary
        double HRA = 0.20 * basicSalary; // 20% of basic salary

        // Calculate the gross salary (Basic + DA + HRA)
        double grossSalary = basicSalary + DA + HRA;

        // Output the results
        System.out.println("Dearness Allowance (DA): " + DA);
        System.out.println("House Rent Allowance (HRA): " + HRA);
        System.out.println("Gross Salary: " + grossSalary);

	}

}
