package Constructor;

    public class AdvancedCalculator extends Calculator{

        public void pow(double num1, double num2) {
            double result = Math.pow(num1, num2);
            String text = num1 + " ^ " + num2 + " equals " + result;
            addOperations(text);
        }

        public void root(double num1, double num2) {
            double result = Math.pow(num1, 1/num2);
            String text = num2 + " root of " + num1 + " equals " + result;
            addOperations(text);
        }
    }
