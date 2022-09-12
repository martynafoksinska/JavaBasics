package FirstClass;

public class Main01 {

        public static void main(String[] args) {
            Cat cat = new Cat();
            Dog dog = new Dog();

            Cat cat2 = cat;

            if (cat.equals(dog)) {
                System.out.println("Są równe");
            } else {
                System.out.println("Są różne");
            }
        }
    }

