import java.util.Scanner;

class Calculator {

    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;

            case "sub":
            case "-":
                return a - b;

            case "mul":
            case "*":
                return a * b;

            case "div":
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        try {
            double result = calc.calculate(a, b, op);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
