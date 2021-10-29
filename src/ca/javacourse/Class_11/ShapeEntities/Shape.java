package ca.javacourse.Class_11.ShapeEntities;

import java.util.Objects;

public abstract class Shape { //not alon it means abstract

    private String colour;
    private String name;

    @Override
    public boolean equals(Object o) {
        System.out.println("Doing a manual compare...");//alt+ insert + equals and hash code
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(colour, shape.colour) && Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, name);
    }

    @Override
    public String toString()
     {
         return "I am a shape and my color is " + this.colour + " and my name is " + this.name;

     }

    public Shape(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract double getArea();
}
