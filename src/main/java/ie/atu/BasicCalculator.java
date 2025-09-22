package ie.atu;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        double firstNum = scan.nextDouble();
        System.out.printf("You entered %s %n%n", firstNum);

        System.out.print("Please enter a second number: ");
        double secondNum = scan.nextDouble();
        System.out.printf("You entered %s %n%n", secondNum);

    }
}
