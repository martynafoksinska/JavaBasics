package Methods;

public class Methods03 {

    public static void main(String[] args) {
        double pln = 20;
        double kurs = 4.04;

        double result = convertToUsd(pln, kurs);
        System.out.println(result);
    }

    public static double convertToUsd(double waluta, double przelicznik) {
        return waluta / przelicznik ;
    }
}