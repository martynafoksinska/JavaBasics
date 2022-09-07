package Methods;

public class Methods11 {

    public static void main(String[] args) {
        int a = 6;
        int b = 2;

        boolean result = divisibleBy(a,b);
        System.out.println(result);
    }


    public static boolean divisibleBy(int a, int b ) {
        if (a%b == 0) {
            return true;
        } else {
            return false;
        }
    }
}