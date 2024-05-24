package Anudip;

public class EmployeeIDCard {
    static int number=123123;
    static String companyName="Anudip";
    
    int empid;
    String empname;
        EmployeeIDCard(String ename) {
    	this.empid = number;
    	this.empname = ename;
    }
    
    // static method to display employee details
    static void displayEmployeedetails(EmployeeIDCard emp) {
    	System.out.println("Employee ID: " + emp.empid);
    	System.out.println("Employee Name: " + emp.empname);
    	System.out.println("company Name: "+ companyName);
    }
    public static void main(String[] args)  
    {
           EmployeeIDCard emp=new EmployeeIDCard("max field");   
             displayEmployeedetails(emp);
    }
}   





