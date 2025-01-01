package hw.loophw;
import java.util.*;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = sc.nextInt();
        
        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;
        
        System.out.println("Percentage of classes attended:"+ attendancePercentage);
        
        if (attendancePercentage >= 75){
        	System.out.println("The student is allowed to sit in the exam.");
        }
        else{
        	System.out.print("Do you have a medical cause? (Y/N): ");
        	String medicalCause = sc.next();
        	if (medicalCause == "Y") {
                System.out.println("The student is allowed to sit in the exam due to medical cause.");
            } else {
                System.out.println("The student is NOT allowed to sit in the exam due to insufficient attendance.");
        }

	}

}
}