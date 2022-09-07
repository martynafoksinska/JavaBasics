package Exceptions;

public class Exceptions03 {

    public static void main(String[] args) {
        String str = null;
        try {
            int result = getLength(str);
            System.out.println("Długość napisu wynosi " + result + " znaków");
        } catch (NullPointerException e) {
            System.out.println("Próba wywołania metody na nieistniejącym obiekcie");
        }
    }

    public static int getLength(String str) {
        return str.length();
    }

}