package hw.loophw;
import java.util.*;


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input,output = 1;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a num ");
		input = sc.nextInt();
		
		for (int i = 1; i<=input;i++){
			output *= i;
		}
		System.out.println("output:"+output);

	}

}
