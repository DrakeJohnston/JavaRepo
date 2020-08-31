/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraysproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class JavaArraysProject {

        public ArrayList<Double> grades = new ArrayList();
        public ArrayList<String> courses = new ArrayList();
        
        public boolean isFinished = false;

    private static void RunApp() {
        Scanner scanner = new Scanner(System.in);
        JavaArraysProject JAP = new JavaArraysProject();
        System.out.println("Welcome, First Enter your Name.");
        String name = scanner.nextLine();
        
        //GetCoursesArray();   
        //GetGradesArray();   
        
        System.out.println("Next Enter Your Courses");
        
        System.out.println("Enter Course 1 Please ");
        String course1 = scanner.nextLine();
        System.out.println("");
        System.out.println("Enter Course 2 Please ");
        String course2 = scanner.nextLine();
        System.out.println("");
        System.out.println("Enter Course 3 Please ");
        String course3 = scanner.nextLine();
        System.out.println("");
        System.out.println("Enter Course 4 Please ");
        String course4 = scanner.nextLine();
        System.out.println("");
        
        System.out.println("Next Enter Your Grades");
        
        System.out.println("Enter grade 1 Please ");
        double grade1 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Enter grade 2 Please ");
        double grade2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Enter grade 3 Please ");
        double grade3 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Enter grade 4 Please ");
        double grade4 = scanner.nextDouble();
        
        String courses[] = {course1, course2, course3, course4};
        double grades[] = {grade1, grade2, grade3, grade4};
        
        System.out.println(name + "'s Report");
        System.out.println("");
        System.out.println("Course\tGrade");
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println(courses[i] + "\t" + grades[i]);
            
        }
        
        System.out.println("");
        
        double average = 0.0;
        
        for (int i = 0; i < 4; i++) {
            
            average += grades[i];
            
        }
        
        average = average/4;
        System.out.println( name + " your Average mark is: " + average);
    }
    

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RunApp();
        
    }
    
}
