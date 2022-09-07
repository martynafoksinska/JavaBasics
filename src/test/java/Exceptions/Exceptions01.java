package Exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
        String liczba1 = "8";
        String liczba2 = "0";
        average(liczba1, liczba2);
    }

    public static void average(String a, String b) {
        try {
            int konwersja = Integer.parseInt(a) / Integer.parseInt(b);
            System.out.println(konwersja);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero!");
        } finally {
            System.out.println("Wynik");
        }
    }
}