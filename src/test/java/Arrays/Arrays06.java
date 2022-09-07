package Arrays;

public class Arrays06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumbers = {3, 4};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println(sum);
        int suma = 0;
        for (int i : secondNumbers) {
            suma += i;
        }

        System.out.println(suma);

    }
}