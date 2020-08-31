/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlerectswitchsolver;

import java.util.*;

/**
 *
 * @author Jason
 */
public class CircleRectSwitchSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        
        String userName = scan.nextLine();
        System.out.println(userName + " is that correct Y or N");
        
        String YorN = scan.nextLine();
        switch(YorN) {
            case "Y":
                 System.out.println("Please Choose an option");
                 System.out.println("Option 1: Solve Rectangle");
                 System.out.println("Option 2: Solve Circle with Radius");
                 System.out.println("Option 3: Solve Circle with Diameter");
                 System.out.println("Option 4: Exit");
                 
                 System.out.println("Pick an option by typing the number");
                 int option = scan.nextInt();
                 
                 switch(option) {
                 
                     case 1:
                         //Rectangle solving
                         System.out.print("Please Input Width: ");
                         float width = scan.nextFloat();
                         System.out.print("Please Input Length: ");
                         float length = scan.nextFloat();
                         float area = width * length;
                         float peremeter = 2*(width * length);
                         
                         System.out.println("Area of your Rectangle: " + area);
                         System.out.println("Peremiter of your Rectangle: " + peremeter);
                         break;
                     case 2:
                         //circle with radius
                         System.out.println("Please input Radius");
                         double radius = scan.nextInt();
                         
                         //Math calculations
                         double circumfrenceRadi;
                         circumfrenceRadi = 2*(3.14f * radius);
                         double areaRadi = 3.14 * Math.pow(radius, 2);
                              
                         System.out.println("Circumfrence of the circle with Radius: " + circumfrenceRadi);
                         System.out.println("Area of the circle with Radius: " + areaRadi);
                         
                         break;
                     case 3:
                         //circle with diameter
                         System.out.println("Please input Diameter");
                         double diameter = scan.nextInt();
                         
                         //Math calculations
                         double circumfrenceDia;
                         circumfrenceDia = 3.14f * diameter;
                         double areaDia;
                         areaDia = 0.25 * (3.14 * Math.pow(diameter, 2));
                         
                         System.out.println("Circumfrence of the circle with Diameter: " + circumfrenceDia);
                         System.out.println("Area of the circle with Diameter: " + areaDia);
                         
                         break;
                     case 4:
                         //exit
                         System.exit(0);
                         break;
                 
                 }
                 break;
            case "N":
                System.out.println("Please restart to select again");
                System.exit(0);
                break;
            case "y":
                 System.out.println("Please Choose an option");
                 System.out.println("Option 1: Solve Rectangle");
                 System.out.println("Option 2: Solve Circle with Radius");
                 System.out.println("Option 3: Solve Circle with Diameter");
                 System.out.println("Option 4: Exit");
                 
                 System.out.println("Pick an option by typing the number");
                 int option2 = scan.nextInt();
                 
                 switch(option2) {
                 
                     case 1:
                         //Rectangle solving
                         System.out.print("Please Input Width: ");
                         float width = scan.nextFloat();
                         System.out.print("Please Input Length: ");
                         float length = scan.nextFloat();
                         float area = width * length;
                         float peremeter = 2*(width * length);
                         
                         System.out.println("Area of your Rectangle: " + area);
                         System.out.println("Peremiter of your Rectangle: " + peremeter);
                         break;
                     case 2:
                         //circle with radius
                         System.out.println("Please input Radius");
                         double radius = scan.nextInt();
                         
                         //Math calculations
                         double circumfrenceRadi;
                         circumfrenceRadi = 2*(3.14f * radius);
                         double areaRadi = 3.14 * Math.pow(radius, 2);
                              
                         System.out.println("Circumfrence of the circle with Radius: " + circumfrenceRadi);
                         System.out.println("Area of the circle with Radius: " + areaRadi);
                         
                         break;
                     case 3:
                         //circle with diameter
                         System.out.println("Please input Diameter");
                         double diameter = scan.nextInt();
                         
                         //Math calculations
                         double circumfrenceDia;
                         circumfrenceDia = 3.14f * diameter;
                         double areaDia;
                         areaDia = 0.25 * (3.14 * Math.pow(diameter, 2));
                         
                         System.out.println("Circumfrence of the circle with Diameter: " + circumfrenceDia);
                         System.out.println("Area of the circle with Diameter: " + areaDia);
                         
                         break;
                     case 4:
                         //exit
                         System.exit(0);
                         break;
                 
                 }
                 break;
            case "n":
                System.out.println("Please restart to select again");
                System.exit(0);
                break;
            default:
             // code block
        }
    }
    
}
