package basic.programming;

import java.util.Scanner;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int first_Number, second_Number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first_Number = input.nextInt();
        System.out.print("Enter second number: ");
        second_Number = input.nextInt();
        System.out.println("1.Addition: ");
        System.out.println("2.Subtraction: ");
        System.out.println("3.Multiplication: ");
        System.out.println("4.Division: ");
        System.out.println("5.Remainder: ");
        System.out.println("6.Exit ");
        System.out.println("Enter your choice: ");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                int addition = first_Number + second_Number;
                System.out.println("Addition: " + addition);
                break;
                case 2:
                    int subtraction = first_Number - second_Number;
                    System.out.println("Subtraction: " + subtraction);
                    break;
                    case 3:
                        int multiplication = first_Number * second_Number;
                        System.out.println("Multiplication: " + multiplication);
                        break;
                        case 4:
                            int division = first_Number / second_Number;
                            System.out.println("Division: " + division);
                            break;
                            case 5:
                                int remainder = first_Number % second_Number;
                                System.out.println("Remainder: " + remainder);
                                break;
                                case 6:
                                    System.out.println("Exit ");
                                    break;
            default:
                System.out.println("Invalid operation");

        }
    }
}
