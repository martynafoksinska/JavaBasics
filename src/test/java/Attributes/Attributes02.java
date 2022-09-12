package Attributes;

public class Attributes02 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "a";
        testAttribute.protectedAttribute = "b";

        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);


    }
}