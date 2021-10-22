package ca.javacourse.Class_11;

public class UseCircle {

    public static void main(String[] args) throws Exception {


        //Instantiate and define this circle

        Circle c = new Circle(10, "Blue", true);

        System.out.println(c.getArea());

        c.setRadius(20);

        System.out.println(c.getArea());

        //c = null;



    }
}
