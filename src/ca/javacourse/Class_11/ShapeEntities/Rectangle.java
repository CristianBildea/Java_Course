package ca.javacourse.Class_11.ShapeEntities;

public class Rectangle extends Square{

    private double height;

    public Rectangle(String colour, String name, double width, double height) {
        super(colour, name, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return this.height * this.width;
    }
}
