package Methods2;

public class Person {

    private String name = "Jan";
    private String surname = "Kowalski";
    private int age = 18;
    private char gender = 'x';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void increaseAge(int age) {
        this.age = age + 1;
    }

    public String getFullName() {
        return this.name + ", " + this.surname;
    }

    public String toString() {
        return this.name + " " + this.surname + ", wiek: " + this.age;

    }
}
