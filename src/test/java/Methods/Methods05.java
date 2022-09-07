package Methods;

public class Methods05 {

    public static void main(String[] args) {
        double gross = 9.99;
        double vat = 0.23;

        double result = calculateNetto(gross, vat);
        System.out.println(result);
    }
    public static double calculateNetto(double gross, double vat) {
        return gross * vat;
    }
}