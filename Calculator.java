import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the operator (+, -, *, /):)：");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter the next number:");
            double num2 = scanner.nextDouble();

            double result = 0.0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}