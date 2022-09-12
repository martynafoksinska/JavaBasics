package Constructor;

public class Main01 {
    public static void main(String[] args) {


        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.add(2.5, 5);
        advancedCalculator.multiply(2,3);
        advancedCalculator.divide(6,2);
        advancedCalculator.subtract(8,2);
        advancedCalculator.printOperations();
        advancedCalculator.clearOperations();

        advancedCalculator.pow(3,4);
        advancedCalculator.root(12,3);

        advancedCalculator.printOperations();

    }
}
