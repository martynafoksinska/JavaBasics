package Exceptions;

public class Exceptions05 {

    public static void main(String[] args) {
        int elements[] = {1, 2, 3, 4, 5, 6};
        int value = 7;
        int result = indexOf(elements, value);
        System.out.println(result);


    }

    public static int indexOf(int[] elements, int value) {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i] + " ");
        } return value;
    }
}