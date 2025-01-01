package hw;
import java.util.*;

public class spaceboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight, result;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your current Earth weight?");
		
		weight = sc.nextDouble();
		
		System.out.println("I have information for the following planets:");
		System.out.println(" 1. Venus  2.Mars  3.Jupiter  4.Saturn   5.Uranus  6.Neptune");
		System.out.println("Which planet are you visiting?: ");
		
		choice = sc.nextInt();
		
		if (choice == 1){
			result = weight*0.78;
			System.out.println("Your weight would be "+result+" pounds on that planet.");
		}
		else if (choice == 2){
			result = weight * 0.39;
			System.out.println("Your weight would be "+result+" pounds on that planet.");
		}
		else if (choice == 3){
			result = weight * 2.65;
			System.out.println("Your weight would be "+result+" pounds on that planet.");
		}
		else if (choice == 4){
			result = weight * 1.17;
			System.out.println("Your weight would be "+result+" pounds on that planet.");
		}
		else if (choice == 5){
			result = weight * 1.05;
			System.out.println("Your weight would be "+result+" pounds on that planet.");
		}
		else if (choice == 6){
			result = weight * 1.23;
			System.out.println("Your weight would be "+result+" pounds on that planet.");
		}
		
		else{
			System.out.println("Invalid choice");
		}
	}

}
