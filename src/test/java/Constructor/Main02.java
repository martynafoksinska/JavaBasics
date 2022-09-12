package Constructor;

public class Main02 {

    public static void main(String[] args) {
        Shape shape1 = new Shape(3, 2, "red");
        Shape shape2 = new Shape(-3, 8, "blue");

        shape1.getDescription();
        shape2.getDescription();

        System.out.println(shape1.getDistance(shape2));
        Circle circle = new Circle(5,10,"yellow",20);
        circle.getDescription(circle.getRadius());
        circle.getCircut();
        circle.getArea();

    }
}