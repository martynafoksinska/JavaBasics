package Constructor;

public class Circle extends Shape {

    public double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public void getDescription(double radius) {
        super.getDescription();
        String description = "Radius: " + this.radius;
        System.out.println(description);
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
        return area;
    }

    public double getCircut() {
        double circut = Math.PI * 2 * radius;
        System.out.println(circut);
        return circut;
    }

    public double getRadius() {
        return radius;
    }
}