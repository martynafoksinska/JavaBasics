package Constructor;

public class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void getDescription() {
        String description = "Shape: x= " + this.x + " y= " + this.y + " color = " + this.color;
        System.out.println(description);
    }

    public double getDistance(Shape shape) {
        double distance = Math.pow(Math.pow((shape.x - this.x), 2) + Math.pow((shape.y - this.y), 2), 0.5);
        return distance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
