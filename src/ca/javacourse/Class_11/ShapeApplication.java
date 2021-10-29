package ca.javacourse.Class_11;

import ca.javacourse.Class_11.ShapeEntities.Circle;

public class ShapeApplication {

    public static void main(String[] args) {

        Circle c = new Circle("Red", "Bob", 10);
        Circle d = new Circle("Red", "Bob", 10);

        boolean isSame = c.equals(d);
        System.out.println(isSame);

        System.out.println(c);
    }
}
