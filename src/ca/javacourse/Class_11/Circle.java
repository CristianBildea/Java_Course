package ca.javacourse.Class_11;

public class Circle {

    private double radius;  // this are the values
    private String colour = null;
    private boolean isVisible;



    //Constructor Method
    public Circle(double r, String c, boolean v) throws Exception{


        if (r < 5)
        {
            throw new Exception ("Any value of value less that 5 is not permitted ");
        }
        this.radius = r; //this. - is means value of the object (outside from construction (radius from public double))
        this.colour = c;
        this.isVisible = v;
    }


    public Circle() {}  // Empty construction

    //Getter for radius

    public double getRadius()
    {
        //Validation : is the person allowed to get this value?
        return this.radius;
    }

    //Setter for radius
    public void setRadius(double radius)
    {
        //Is the value provided ok? Should we validate?
        this.radius = radius;
    }

     //Normal Method
    public double getArea()
    {
        return Math.pow(Math.PI * radius, 2);
    }

    public String getColour() {
        // Is the user allowed to set this value?
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
