import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println(" ");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            System.out.println("");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.println("__________________________");
                    System.out.println("Addition of the two numbers "+num1+" and "+num2+ " :" + add(num1, num2));
                    System.out.println("__________________________");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("__________________________");
                    System.out.println("Subtraction of the two numbers "+num1+" and "+num2+ " :" + subtract(num1, num2));
                    System.out.println("__________________________");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("__________________________");
                    System.out.println("Multiplication of the two numbers "+num1+" and "+num2+ " :" + multiply(num1, num2));
                    System.out.println("__________________________");

                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    if (num2 != 0) {
                        System.out.println("__________________________");
                        System.out.println("Division of the two numbers "+num1+" and "+num2+ " :" + divide(num1, num2));
                        System.out.println("__________________________");
                        System.out.println("");
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}

