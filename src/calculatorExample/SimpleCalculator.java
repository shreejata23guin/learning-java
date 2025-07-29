import java.util.Scanner;

public class SimpleCalculator {

    // Method to add two numbers
    static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();  // take first number

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();  // take second number

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = input.next().charAt(0);  // take operator symbol

        double result;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;  // exit program
        }

        System.out.println("Result: " + result);

        input.close();  // close scanner
    }
}
