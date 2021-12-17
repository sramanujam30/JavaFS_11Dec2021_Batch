import java.util.Scanner;

public class PermutationCombination {
	
	int factorial(int n) {
		int fact =1;
		for(int i = 1;i <= n;i++){    
		      fact*=i;    
		  }
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r, perm, comb;
		PermutationCombination pnc = new PermutationCombination();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n = input.nextInt();
		
		System.out.println("Enter value of r: ");
		r = input.nextInt();
		
		if (n >= r) {
			perm = pnc.factorial(n)/pnc.factorial(n-r);
			System.out.println ("\n"+n+"P"+r+": "+perm);
			comb = pnc.factorial(n)/(pnc.factorial(r) * pnc.factorial(n-r));
			System.out.println (n+"C"+r+": "+comb);
		}
		
		input.close();
	}

}
