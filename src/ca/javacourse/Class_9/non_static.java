package ca.javacourse.Class_9;

public class non_static {

    public static void main(String[] args) {

        //Math.PI // Static



        Calculator c = new Calculator(); // c is a object, by clicking on calculator  right mouse and goto Implementation and is show the calculator class which we used

        Calculator c2 = new Calculator(); // c and c2 are wo different objects

        c.x = 2;
        c.y = 3;
        c2.x = 7;
        c2.y = c.x;

        System.out.println(c.addNums());
        System.out.println(c2.addNums());


    }


}
