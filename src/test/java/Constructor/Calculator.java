package Constructor;

import java.util.Arrays;

public class Calculator {

    String[] operation;

    public Calculator() {
        operation = new String[0];
    }

    public void add(double num1, double num2) {
        double result = num1 + num2;
        String text = "added " + num1 + " to " + num2 + " got " + result;
        addOperations(text);
    }


    public void multiply(int num1, int num2) {
        int result = num1 * num2;
        String text = "multiplied " + num1 + " with " + num2 + " got " + result;
        addOperations(text);
    }

    public void subtract(double num1, double num2) {
        double result = num1 - num2;
        String text = "subtracted " + num1 + " from " + num2 + " got " + result;
        addOperations(text);
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("You can't divide by zero");
            throw new ArithmeticException();
        } else {
            double result = num1 / num2;
            String text = "divided " + num1 + " by " + num2 + " got " + result;
            addOperations(text);
        }
    }

    public void addOperations(String text) {
        this.operation = Arrays.copyOf(this.operation, this.operation.length + 1);
        this.operation[this.operation.length - 1] = text;
    }

    public void clearOperations() {
        this.operation = new String[0];
    }

    public void printOperations() {
        for (int i = 0; i <this.operation.length; i++) {
            System.out.println(this.operation[i]);
        }
    }
}
