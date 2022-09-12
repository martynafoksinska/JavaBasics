package Methods2;

public class Main01 {

    public static void main(String[] args) {
        Person vip = new Person();
        vip.setAge(40);
        vip.setName("Prezydent");
        vip.setSurname("Kononowicz");
        vip.setGender('M');
        vip.increaseAge(40);
        vip.getFullName();

        System.out.println(vip);
    }
}
