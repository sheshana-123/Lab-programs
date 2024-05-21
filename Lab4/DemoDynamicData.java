package sample;
import java.util.Scanner;
public class DemoDynamicData {

	    public static void main(String[]args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two numbers :");
		int a=scanner.nextInt();
		
		int b=scanner.nextInt();
		
		int c=a+b;
		System.out.println("Addition result :" +c);

		 c=a-b;
		System.out.println("Subtraction result :" +c);

	  
		 c=a*b;
		System.out.println("Multiplication result :" +c);

	 
		 c=a/b;
		System.out.println("Division result :" +c);
        
		scanner.close();

	}

}
