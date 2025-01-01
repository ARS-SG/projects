import java.util.*;

public class StudentMarksDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		String branch;
		double t1,t2,t3,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name  = sc.nextLine();
		System.out.println("Enter ID:");
		id = sc.nextInt();
		System.out.println("Enter Branch:");
		branch  = sc.next();
		System.out.println("Enter Test1 Marks:");
		t1 = sc.nextDouble();
		System.out.println("Enter Test2 Marks:");
		t2 = sc.nextDouble();
		System.out.println("Enter Test3 Marks:");
		t3 = sc.nextDouble();
		
		avg = (t1+t2+t3)/3;
		
		System.out.println("--------------Student Details are----------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("NAME"+"\t"+"ID"+"\t"+"BRANCH"+"\t"+"TEST1"+"\t"+"TEST2"+"\t"+"TEST3"+"\t"+"AVG");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(name+"\t"+id+"\t"+branch+"\t"+t1+"\t"+t2+"\t"+t3+"\t"+avg);
		System.out.println("-------------------------------------------------------------------------------");
		
		
		
		//System.out.println("Branch:"+branch);
		//System.out.println("ID:"+id); 
		//System.out.println("Test1 Marks:"+t1);
		//System.out.println("Test2 Marks:"+t2);
		//System.out.println("Test3 Marks:"+t3);

		//System.out.println("Average of marks are:"+avg);
		
	}

}
