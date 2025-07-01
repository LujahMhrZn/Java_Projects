//Create a consol based calculator app that takes user input, 
//performs basic arithmetic operations, and displays the result.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Java Calculator App!");

        while(true){
            System.out.println("\nPlease select an operation:");
                            System.out.println("1. Addition (+)");
                            System.out.println("2. Subtraction (-)");
                            System.out.println("3. Multiplication (*)");
                            System.out.println("4. Division (/)");
                            System.out.println("5. Exit");

                            System.out.println("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            

            }
            System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    double additionResult = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + additionResult);  
                    break;
                case 2:
                    double subtractionResult = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + subtractionResult);
                    break;
                case 3:
                    double multiplicationResult = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + multiplicationResult);
                    break;
                case 4:
                    double divisionResult = num1 / num2;
                    if (num2 != 0) {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + divisionResult);
                    } else {
                        System.out.println("Error: Division by one is not allowed.");
                    }
            
                default:
                    break;
            }
        }
        scanner.close();
    }
}