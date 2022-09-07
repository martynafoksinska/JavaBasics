package JavaBasics;

public class Main14 {

    public static void main(String[] args) {
        int[] numbers = {4, 643, 112, 9999, 69};
        int sum = 0;
        for (int i = 0; i <= 4 ; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

}