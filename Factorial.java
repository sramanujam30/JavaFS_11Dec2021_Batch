import java.util.Scanner;

public class Factorial {
	 public static void main(String args[]){  
		  int i,fact=1;  
		  int number;
		  Scanner input =new Scanner (System.in);
		  System.out.println("Enter number to calculate factorial: ");
		  number = input.nextInt();
		  for(i=1;i<=number;i++){    
		      fact*=i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);
		  input.close();
		 } 

}
