//A00729057 William Hu COMP 1150 Set 1B

import java.util.Scanner; 

// Circle.java 
    //
    //Print the area of a circle with two different radii

public class Circle {
    
    public static void main(String[] args) {
        
        final double PI = 3.14159;  //set as constant
        int radius1;

        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter radius of circle 1: ");
        radius1 = scan.nextInt();   //input radius of circle 1
        
        double area1 = PI * radius1 * radius1; //calculate the area of circle 1
        double circumference1 = 2 * PI * radius1; //calculate the circumferance of circle 1
        
        System.out.println("The area of a circle with radius " + radius1 + " is " + area1); //calculate the area of circle 1
        System.out.println("The circumference of a circle with radius " + radius1 + " is " + circumference1); //calculate the circumferance of circle 1 
        System.out.println(""); //spacing
        
        int radius2;
       
        System.out.print("Enter radius of circle 2: ");
        radius2 = scan.nextInt();
        
        double area2 = PI * radius2 * radius2; //calc of area circle 2
        double circumference2 = 2 * PI * radius2; //calc of circumferance of circle 2
        
        System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius2 + " is " + circumference2);
        System.out.println(""); //spacing
        
        double difference_a = area2 / area1;  //calculation of difference ratio
        
        System.out.println("The area factor changed between circle 1 and circle 2 is: " + difference_a);
        
        double difference_circumference = circumference2 / circumference1; //calculation of different circumferance
        
        System.out.println("The circumference factor changed between circle 1 and circle 2 is: " + difference_circumference);
        
     }
    
  
    
   
}
