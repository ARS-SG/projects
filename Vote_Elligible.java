import java.util.*;

public class Vote_Elligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		if (age>=18){
			System.out.println("you can vote.");
			
		}
		else{
			System.out.println("you cannot vote.");
		}

	}

}
