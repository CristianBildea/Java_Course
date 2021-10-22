package ca.javacourse.Class_11.ShapeEntities;

public class Square extends Shape {

    protected  double width;


    public Square(String colour, String name, double width) {
        super(colour, name);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea()
    {
        return this.width * 2;
    }
}
