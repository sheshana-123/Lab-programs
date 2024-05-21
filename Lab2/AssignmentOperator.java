package Samplepackage;
public class AssignmentOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10, b=5 ;
        boolean x=true;
        
        System.out.println("a =" + a + ",b = " +b);
        
        a +=b;
        System.out.println("a ="+ a);
        
        a -=b;
        System.out.println("a ="+ a);

        a *=b;
        System.out.println("a ="+ a);
        
        a /=b;
        System.out.println("a ="+ a);

                a %=b;
        System.out.println("a ="+ a);

                       x |=(a>b);
        System.out.println("a ="+ x);

                x &=(a>b);
        System.out.println("a ="+ x);
 	
     	
	}

}
