package Methods;

public class Methods07 {

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(2));
        System.out.println(checkEvenOdd(5));
        System.out.println(checkEvenOdd(6));
        System.out.println(checkEvenOdd(19));

    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}