package Exceptions;

public class Exceptions02 {

    public static void main(String[] args) {
        String[] tab = {"z", "x", "y", "w", "d"};
        int index = 5;
        try {
            String result = safeGet(tab, index);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Próba pobrania nieistniejącego elementu");
        }
    }

    public static String safeGet(String[] strTab, int index) {
        return strTab[index];
    }

}