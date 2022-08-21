package tamara.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static double firstValue;
    private static double secondValue;
    private static String operation;
    private static double result;
    private static String answer;

    private static double calc() {


        System.out.println("Enter first Value");
        firstValue = new Scanner(System.in).nextDouble();
        System.out.println("Enter second Value");
        secondValue = new Scanner(System.in).nextDouble();
        ;
        System.out.println("Enter operation");
        operation = new Scanner(System.in).next();

        switch (operation) {
            case "+" -> result = firstValue + secondValue;
            case "-" -> result = firstValue - secondValue;
            case "*" -> result = firstValue * secondValue;
            case "/" -> result = firstValue / secondValue;
            case "^" -> result = Math.pow(firstValue, secondValue);
            case "%" -> result = firstValue % secondValue;
            default -> System.out.println("Incorrect command");

        }


        System.out.println("Result " + result);
        return result;
    }

    public static void useCalc() throws InputMismatchException {
        double res;
        answer = "y";

        while ("y".equalsIgnoreCase(answer)) {
            try {
                res = calc();
            } catch (Exception e) {
                System.out.println("Please put down numbers");
            }
            System.out.println("Продолжить? (y/n)");
            answer = new Scanner(System.in).next();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Calculator.useCalc();
    }
}