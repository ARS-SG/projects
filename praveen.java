package hw;
import java.util.*;


public class praveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fare;
		int distance;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance: ");
		distance = sc.nextInt();
		
		if (distance<=10){
			fare = 80;
			System.out.println("Fare: " + fare);
		}

	}

}
