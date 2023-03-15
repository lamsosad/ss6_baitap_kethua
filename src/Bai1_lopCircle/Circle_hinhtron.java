package Bai1_lopCircle;

public class Circle_hinhtron {
    private double radius;
    private String color = "blue";

    public Circle_hinhtron() {
    }

    public Circle_hinhtron(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + " and color: "
                + getColor();
    }
}
