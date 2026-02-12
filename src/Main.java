import java.util.Scanner;

class Calculator {

    // Methods
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Divide by zero not allowed");
            return 0;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator(); // OOP object

        int choice;

        do {
            System.out.println("\n=== Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1:
                        result = calc.add(a, b);
                        break;
                    case 2:
                        result = calc.subtract(a, b);
                        break;
                    case 3:
                        result = calc.multiply(a, b);
                        break;
                    case 4:
                        result = calc.divide(a, b);
                        break;
                }

                System.out.println(" Result: " + result);
            }

        } while (choice != 5); // loop

        sc.close();
        System.out.println("Calculator closed.");
    }
}
