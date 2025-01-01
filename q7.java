package hw.loophw;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Armstrong numbers between 100 and 500 are:");

        // Loop through numbers from 100 to 500
        for (int number = 100; number < 500; number++) {
            // Extract digits
            int hundreds = number / 100; // Get the hundreds place
            int tens = (number / 10) % 10; // Get the tens place
            int units = number % 10; // Get the units place
            
            // Calculate the sum of cubes of its digits
            int sumOfCubes = (hundreds * hundreds * hundreds) + 
                             (tens * tens * tens) + 
                             (units * units * units);
                             
            // Check if the sum of cubes is equal to the number
            if (sumOfCubes == number) {
                System.out.println(number); // Print the Armstrong number
            }
        }
	}

}
