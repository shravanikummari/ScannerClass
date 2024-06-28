import java.util.Scanner;
public class ArithmeticApp {
    private Scanner scanner;

    public ArithmeticApp() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to perform the chosen operation
    public void performOperation(int choice) {
        double num1, num2, result;

        switch (choice) {
            case 1: // Addition
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case 2: // Subtraction
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case 3: // Multiplication
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case 4: // Division
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 5: // Exit
                System.out.println("Exiting the application.");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        ArithmeticApp app = new ArithmeticApp();
        int choice;

        do {
            app.showMenu();
            choice = app.scanner.nextInt();
            if (choice != 5) {
                app.performOperation(choice);
            }
        } while (choice != 5);
    }
}