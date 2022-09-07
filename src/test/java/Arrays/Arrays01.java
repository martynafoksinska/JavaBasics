package Arrays;

import java.text.NumberFormat;
import java.util.Locale;

public class Arrays01 {

    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
        }

        NumberFormat nf = NumberFormat.getInstance(Locale.UK);
        nf.setMinimumIntegerDigits(2);

        for (int i=0; i<arr.length; i++) {
            System.out.print(nf.format(arr[i]) + ", ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}