import java.util.*;

public class ForSumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,average;
		System.out.println("enter 5 numbers: ");
		Scanner sc = new Scanner (System.in);
		for (int i = 1; i<=5; i++){
			sum += sc.nextInt();
		}
		System.out.println("sum: "+sum);
		average = sum/5;
		System.out.println("Average: "+ average);

	}

}
