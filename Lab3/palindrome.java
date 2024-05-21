import java.util.Scanner;
public class palindrome {

		// TODO Auto-generated method stub

		  int reverse (int n) 
		  {
			  int digit=0,rev=0;
		  while(n!=0)
		  {
			  digit=n%10;
			  rev=rev*10+digit;
			  n=n/10;
			  
		  }
			return rev; 
			
		  }
	
	  public static void main(String[]args)
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a number: ");
		  int num=scan.nextInt();
		  palindrome ob=new palindrome();
		  
		      if(ob.reverse(num)==num)
		      System.out.println(num+ " is a palindrome number");
		      else
			  System.out.println(num+ " is not a palindrome number");
		     scan.close();    
	  }    
		  
}	  
		  
		  
		  
	  

