package ca.javacourse.Class_10;

public class UseCircle {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 20;

        System.out.println(c.getArea());

        System.out.println(c2.getArea());

    }
}
