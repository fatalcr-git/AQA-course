package org.aston.course.Task_2;

public class Circle extends Figure implements IPrintable, IArea, IPerimeter {
    private int radius;

    public Circle(int radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printInfo() {
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Area: " + area());
        System.out.println("Fill Color: " + fillColor);
        System.out.println("Border Color: " + borderColor);
    }
}
