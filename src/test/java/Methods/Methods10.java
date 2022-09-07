package Methods;

public class Methods10 {

    public static void main(String[] args) {
        double wiek_psa = 7;


        double result = dogAge(wiek_psa);
        System.out.println(result);
    }

    public static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return 21 + ((dogAge * 4));
        }
    }
}
