import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input:");        
		int n = input.nextInt();
		System.out.println("Multiplication table for "+n+":");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        input.close();
    }
}
