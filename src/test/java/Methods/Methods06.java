package Methods;

public class Methods06 {

    public static void main(String[] args) {
        System.out.println(checkMaturity(17));
        System.out.println(checkMaturity(18));
        System.out.println(checkMaturity(20));
        System.out.println(checkMaturity(35));

    }

    public static boolean checkMaturity(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}