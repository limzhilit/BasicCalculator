package ie.atu;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Get first num
        System.out.print("Please enter a number: ");
        double firstNum = scan.nextDouble();
        System.out.printf("You entered %s %n%n", firstNum);

        //Get second num
        System.out.print("Please enter a second number: ");
        double secondNum = scan.nextDouble();
        System.out.printf("You entered %s %n%n", secondNum);

        scan.nextLine();

        //Get operation
        System.out.print("Choose the operation (add, subtract, multiply, divide): ");
        String operation = scan.nextLine();

        //check input
        while (!operation.equals("add") && !operation.equals("subtract") && !operation.equals("multiply") && !operation.equals("divide")) {
            System.out.print("Invalid input,");
            System.out.print(" choose the operation (add, subtract, multiply, divide): ");
            operation = scan.nextLine();
        }
        System.out.printf("You entered %s %n%n", operation);

        //Get result
        boolean isError = false;
        double result = switch (operation) {
            case "add" -> {
                yield (firstNum + secondNum);
            }
            case "subtract" -> firstNum - secondNum;
            case "multiply" -> firstNum * secondNum;
            case "divide" -> {
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero");
                    isError = true;
                    yield 0;
                } else {
                    yield(firstNum / secondNum);
                }
            }
            default -> {
                System.out.println("Invalid operation");
                isError = true;
                yield 0;
            }
        };

        //print result
        if (isError) {
            System.out.print("Operation error\n");
            isError = false;
        } else {
            System.out.printf("The result is %s %n", result);
        }




    }
}
