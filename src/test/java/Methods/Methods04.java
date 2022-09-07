package Methods;

public class Methods04 {

    public static void main(String[] args) {
        String imię = "Jan";
        String nazwisko = "Nowak";
        String pseudonim = "chudy";
        String result = createName(imię, nazwisko, pseudonim);
        System.out.println(result);

    }

    public static String createName(String name, String surname, String nickname) {
        return name + " "+ nickname + " " + surname;
    }
}