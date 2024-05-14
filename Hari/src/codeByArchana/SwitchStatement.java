package codeByArchana;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int a, b;   float c, d;
        String choice;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your operation (add/sub/mul/div/percent): ");
        choice = sc.next();
        
        
        System.out.println("Enter your first number: ");
        a = sc.nextInt();
        
        System.out.println("Enter your second number: ");
        b = sc.nextInt();
        
        
        
        switch(choice) {
            case "add": 
                System.out.println("Addition: " + (a + b));
                break;
            case "sub": 
                System.out.println("Subtraction: " + (a - b));
                break;
            case "mul": 
                System.out.println("Multiplication: " + (a * b));
                break;
            case "div": 
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            case "percent": 
            	
                
                System.out.println("Enter obtained marks: ");
                c = sc.nextFloat();
                System.out.println("Enter total marks: ");
                d = sc.nextFloat();
                System.out.println("Percentage: " + ((c / d) * 100));
                break;
            default: 
                System.out.println("Enter appropriate operation");
        }
        
        sc.close();
    }
}
