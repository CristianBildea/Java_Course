package ca.javacourse.Class_02;

import java.math.BigDecimal;

public class Arithmetic {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int c = a + b;
        double d = a / b;

        double e = 5.0 /2;

        double f = (double)5 / 2;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int x = 4;
        long y = 22;

        int z = x + (int)y;

        System.out.println(14 / 8);

        // To the power of (exponent)

        double p = Math.pow(2.0, 2.0);

        double radius = 5.0;

        double circleArea = Math.PI * (radius * radius);

        double circleArea2 = Math.pow(Math.PI * radius, 2.0); //the same like up but more like java
        System.out.println(p);
        System.out.println(circleArea2);

        BigDecimal costOfMeal = new BigDecimal( "22.99");
        costOfMeal = costOfMeal.add(new BigDecimal("1.0"));
        System.out.println(costOfMeal);




    }
}
