package hw;
import java.util.*;


public class gendergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name, last_name, gender, married_status;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your gender (M or F): ");
		gender = sc.nextLine();
		
		System.out.println("First name: ");
		first_name = sc.nextLine();
		
		System.out.println("Last name: ");
		last_name = sc.nextLine();
		
		System.out.println("Age: ");
		age = sc.nextInt();
		
		if (gender.equals("F")){
			if (age>=20){
				System.out.println("Are you married, "+ first_name + " (y or n)? " );
				married_status = sc.next();
				if(married_status.equals("y")){
					System.out.println("Then I shall call you Mrs. "+ last_name);
				}
				else{
					System.out.println("Then I shall call you Ms. "+ last_name);
				}
			}
			else{
				System.out.println("Then I shall call you "+first_name+ " "+last_name);
			}
		}
		else{
			if (age>=20){
				System.out.println("Then I shall call you Mr. "+ last_name);
			}
			else{
				System.out.println("Then I shall call you "+first_name+ " "+last_name);
			}
		}

	}

}
