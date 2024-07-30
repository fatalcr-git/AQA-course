package org.aston.course.Task_2;

public class Rectangle extends Figure implements IPrintable, IArea, IPerimeter {
    private int width;
    private int length;

    public Rectangle(int width, int length, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

    @Override
    public double area() {
        return width * length;
    }

    public void printInfo() {
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Area: " + area());
        System.out.println("Fill Color: " + fillColor);
        System.out.println("Border Color: " + borderColor);
    }
}
