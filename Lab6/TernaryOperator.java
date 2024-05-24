package Anudip;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
           int a,b,c;
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter any three numbers:- ");
           a=scanner.nextInt();
           b=scanner.nextInt();
           c=scanner.nextInt();
           int large = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
           System.out.println("The Largest number is: " + large );
                 scanner.close();
		}    
	        
}
         