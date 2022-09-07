package Methods;

public class Methods09 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        int result = 1;
        if (n<=0) {
            return 0;
        } else {
            for (int i=1; i<=n; i++) {
                result *= i;
            }
        }
        return result;
    }
}