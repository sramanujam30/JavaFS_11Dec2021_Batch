
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10, j = 0;
		System.out.println("Initial value of i: "+i);
		System.out.println("Initial value of j: "+j+ "\n");

		j = i++; //post-increment operator
		System.out.println("Current value of i: "+i);
		System.out.println("Current value of j: "+j+ "\n");
		
		j = ++i; //pre-increment operator
		System.out.println("Current value of i: "+i);
		System.out.println("Current value of j: "+j+ "\n");
		
		j = --i; //pre-decrement operator
		System.out.println("Current value of i: "+i);
		System.out.println("Current value of j: "+j+ "\n");
		
		j = i--; //post-decrement operator
		System.out.println("Current value of i: "+i);
		System.out.println("Current value of j: "+j+ "\n");
	}

}
