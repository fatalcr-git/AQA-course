package org.aston.course.Task_2;

public class Triangle extends Figure implements IShape {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double per = perimeter();
        return Math.sqrt(per*(per-sideA)*(per-sideB)*(per-sideC));
    }

    public void printInfo() {
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Area: " + area());
        System.out.println("Fill Color: " + fillColor);
        System.out.println("Border Color: " + borderColor);
    }
}
