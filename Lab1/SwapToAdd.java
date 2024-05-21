
public class SwapToAdd {

	public static void swap(int a,int b) {
      int temp=0;
      temp=a;
      b=temp;
	}
       public static void add(int a,int b) {
    	   int c=0;
    	   c=a+b;
    	   System.out.println(c);
    	   
       }
       public static void main(String[]args) {
    	   int a=10;
    	   int b=20;
    	   swap(a,b);
    	   add(a,b);
       }
}
