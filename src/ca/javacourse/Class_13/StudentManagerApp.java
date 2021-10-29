package ca.javacourse.Class_13;

public class StudentManagerApp {

    public static void main(String[] args) {

        Student.setLastID(10);

        Student st1 = new Student( "Brendan", "Wood", "W00B12345");

        Student st2 = new Student ( "Bildea", "Cristian",  "B00CV67788");

        System.out.println(st1.getId());

        System.out.println(st2.getId());

       // DBClass x //Non static



    }
}
