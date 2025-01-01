package hw.loophw;

import java.util.*;


public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();
        
        // Prompt the user for height in meters
        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Print the calculated BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);
        
        // Interpret the BMI value
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are slightly overweight.");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("You are obese.");
        } else {
            System.out.println("You are clinically obese.");
        }

	}

}
