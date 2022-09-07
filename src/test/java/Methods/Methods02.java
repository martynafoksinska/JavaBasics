package Methods;

//podnoszenie liczby do kwadratu

public class Methods02 {

    public static void main(String[] args) {
        int num = 2;


        int result = square(num);
        System.out.println(result);
    }

    public static int square(int num) {
        return num * num;
    }
}