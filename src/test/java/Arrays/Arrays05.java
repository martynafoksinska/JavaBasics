package Arrays;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {
        int[] numbers = new int [] {3, 2, 1, 4, 5, 10, 7, 8, 9, 6};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}