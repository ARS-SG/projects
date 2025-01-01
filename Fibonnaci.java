
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1 , n3;
		for (int i = 1; i<=10; i++){
			System.out.println(n1);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

	}

}
