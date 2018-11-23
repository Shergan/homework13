package com.divashchenko;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Oleg", 19, Man.Gender.MAN, 75.5, new int[]{2016, 2020});
        Student student2 = new Student("Inna", 21, Man.Gender.WOMEN, 51, new int[]{2014, 2018});
        Student student3 = new Student("Oleg", 22, Man.Gender.MAN, 82.3, new int[]{2014, 2020});

        System.out.println("Student1: " + student1.toString());
        System.out.println("Student2: " + student2.toString());
        System.out.println("Student3: " + student3.toString());
        System.out.println();

        Student.getStudents().add(student1);
        Student.getStudents().add(student2);
        Student.getStudents().add(student3);

        System.out.println(Student.getStudents());
        Student.writeStudentsToFile("Students.txt");
        System.out.println();

        Student.setStudents(null);
        System.out.println(Student.getStudents());
        System.out.println();

        Student.setStudents(Student.readStudentsFromFile("Students.txt"));
        System.out.println(Student.getStudents());
    }
}
