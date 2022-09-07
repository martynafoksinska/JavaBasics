package Exceptions;

public class Exceptions04 {

    public static void main(String[] args) {
        String str = "Martyna";
        try {
            int result = toInt(str);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Nieprawidłowy format");
        }
    }
    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

}