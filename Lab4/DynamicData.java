 import java.io.*;
public class DynamicData 
	{
		public static void main(String[]args) throws IOException
		{
			String name;
			
			System.out.println("enter your name");
			
			InputStreamReader i=new InputStreamReader(System.in);
			
			BufferedReader b=new BufferedReader(i);
			
			 name=b.readLine();
			 
			System.out.println("welcome " + name); 
		}
	}

