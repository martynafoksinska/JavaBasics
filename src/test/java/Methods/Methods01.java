package Methods;

public class Methods01 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        int result = multiply(a,b);
        System.out.println(result);
    }

    public static int multiply(int multiplier, int index) {
        return multiplier * index;
    }
}