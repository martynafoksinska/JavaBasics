public class Main10 {

    public static void main(String[] args) {
        int resultFor = 0, resultWhile = 0;
        for (int i = 1; i <= 10; i++) {
            resultFor += i;
        }
        int i = 1;
        while (i <= 10) {
            resultWhile += i;
            i++;
        }
        System.out.println(resultFor);
        System.out.println(resultWhile);
    }

}