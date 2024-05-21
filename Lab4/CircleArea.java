package sample;
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Do you want to find the area of a circle? (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();
        
                if (response.equals("yes")) {
            
            System.out.println("Please enter the radius of the circle:");
            double radius = scanner.nextDouble();
          
            double area = Math.PI * radius * radius;
            
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
        } else {
            
            System.out.println("Exiting the program");
        }
        
        
        scanner.close();
    }


}
