public class Main11 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }
        }
        int i = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            } i=i+1;
        }
    }
}