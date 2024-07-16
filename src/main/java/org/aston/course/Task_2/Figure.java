package org.aston.course.Task_2;

public abstract class Figure {
    protected String fillColor;
    protected String borderColor;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }
    public String getBorderColor() {
        return borderColor;
    }
}
