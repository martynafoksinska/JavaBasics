package Arrays;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {
        int[] numbers = new int [] {3, 5, 7, 2, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        int[] reverse = Arrays.copyOf(numbers,5);
        for(int i = reverse.length -1; i>=0;i--) {
            System.out.print(reverse[i] + ", ");
        }
    }
}