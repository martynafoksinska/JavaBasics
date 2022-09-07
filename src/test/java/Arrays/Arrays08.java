package Arrays;

public class Arrays08 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 5;
        boolean result = contains(arr, element);
        System.out.println(result);

    }

    public static boolean contains(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        } return false;
    }
}