package entities;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        double heightSquared = height * height;
        double widthSquared  = width  * width;
        return Math.sqrt(heightSquared + widthSquared);
    }
}