package Methods;

public class Methods08 {

    public static void main(String[] args) {
        System.out.println(maxOfThree(5, 10, 15));


    }

    public static int maxOfThree(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        } else if ((b > c)) {
            return b;
        } else {
            return c;
        }
    }
}