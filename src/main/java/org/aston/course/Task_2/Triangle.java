package org.aston.course.Task_2;

public class Triangle implements IShape {
    private int sideA;
    private int sideB;
    private int sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(int sideA, int sideB, int sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public void printInfo() {
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Area: " + area());
        System.out.println("Fill Color: " + fillColor);
        System.out.println("Border Color: " + borderColor);
    }
}
