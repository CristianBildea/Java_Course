package ca.javacourse.Class_15;

import ca.javacourse.Class_13.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        Student s = new Student("A", "b", "12312345");

        System.out.println(s);

       // List<Student> st = new ArrayList();

        List<String> mylist = new ArrayList<>();

        mylist.add("ONE");
        mylist.add("a");
        mylist.add("b");

        mylist.add(1, "x");


       // String myval = mylist.get(1);
       // System.out.println(myval);

        //System.out.println(mylist.indexOf("b"));

        System.out.println(mylist);

        mylist.set(3, "BBB");//update
        System.out.println(mylist);


    }


}
