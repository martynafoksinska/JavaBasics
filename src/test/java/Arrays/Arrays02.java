package Arrays;

import java.util.Random;

public class Arrays02 {

    public static void main(String[] args) {

        int min = 100;
        int[] randNumbers = new int[20];
        Random r = new Random();

        for (int i = 0; i < randNumbers.length; i++)
        {
            int a = r.nextInt(101);
            randNumbers[i] = a;

            if (a < min)
            {
                min = a;
            }

            System.out.print(randNumbers[i] + ", ");
        }
        System.out.println();
        System.out.print("Minimalna wartość tablicy:" + min);
    }
}