package hw;
import java.util.*;

public class littlequiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, score = 0;
		
		System.out.println("Are you ready for a quiz? ");
		System.out.println("Okay, here it comes! ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Q1) What is the capital of Alaska? ");
		System.out.println("1) Melbourne");
		System.out.println("2) Anchorage");
		System.out.println("3) Juneau");
		
		choice = sc.nextInt();
		
		if (choice == 1){
			System.out.println("Wrong");

		}
		else if(choice == 2){
			System.out.println("Wrong");
		}
		else if(choice == 3){
			score = score + 1;
			System.out.println("Thats right!");

		}
		else{
			System.out.println("Invalid");
		}

		System.out.println("Q2) Can you store the value 'cat' in a variable of type int? ");
		System.out.println("1) yes");
		System.out.println("2) no");
		
		choice = sc.nextInt();
		
		if (choice == 1){
			System.out.println("Sorry 'cat' is a string. ints can only store numbers.");

		}
		else if(choice == 2){
			score = score + 1;
			System.out.println("Thats right!");

		}
		else{
			System.out.println("Invalid");
		}
		
		
		System.out.println("Q3) What is the result of 9+6/3? ");
		System.out.println("1) 5");
		System.out.println("2) 11");
		System.out.println("3) 15/3");
		
		choice = sc.nextInt();
		
		if (choice == 1){
			System.out.println("Wrong!");

		}
		else if(choice == 2){
			score = score + 1;
			System.out.println("Thats correct!");

		}
		else if(choice == 3){
			System.out.println("Wrong!");

		}
		else{
			System.out.println("Invalid");
		}
		
		System.out.println("Overall, you got "+ score+ " out of 3 correct.");
		System.out.println("Thanks for playing!");

	}

}
