package ca.javacourse.Class_15;

import ca.javacourse.Class_13.Student;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, String> provinces = new HashMap<>();

        provinces.put("QC", "Quebec");
        provinces.put("ON", "Ontario");
        provinces.put("NS", "Nova Scotia");

        System.out.println("The provinces for QC is " + provinces.get("QC"));

        for (String x : provinces.values())
        {
            System.out.println(x);
        }

        Student s1 = new Student("Brendan", "Wood", "Woo1234");
        Student s2 = new Student("Maria", "Doe", "34577");
        Student s3 = new Student("Jane", "San", "8774564");

        HashMap<Integer, Student> studentList = new HashMap<>();

        studentList.put(s1.getId(), s1);
        studentList.put(s2.getId(), s2);
        studentList.put(s3.getId(), s3);

        Student targetStudent = studentList.get(2);//get a student who id is 2
        System.out.println(targetStudent);

    }
}
