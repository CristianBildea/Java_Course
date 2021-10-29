package ca.javacourse.Class_11.ShapeEntities;

public class Circle extends Shape
{
    private double radius;

    public Circle(String colour, String name, double radius) {
        super(colour, name); //super class(parent class) is shape for circle
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString();
    }
}
