package ca.javacourse.Class_10;

public class String_BuilderEx {

    public static void main(String[] args) {

        //String str1 = "Hello";
       // str1 = str1 + " World";

        StringBuilder sb = new StringBuilder("Hello");// in oop(object orientated program) or ooc(object orientated coding) - is constructor

        sb.append(" World");

        System.out.println(sb);


        System.out.println(sb.reverse());
    }
}
