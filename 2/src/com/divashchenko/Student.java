package com.divashchenko;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student extends Man {
    public Student(String name, int age, Man.Gender gender, double weight) {
        super(name, age, gender, weight);
    }

    private int[] studyAges;

    public Student(String name, int age, Gender gender, double weight, int[] studyAges) {
        super(name, age, gender, weight);
        this.studyAges = studyAges;
    }

    public int[] getStudyAges() {
        return studyAges;
    }

    //===================================================

    private static List<Student> students = new ArrayList<>();

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        Student.students = students;
    }

    public static void writeStudentsToFile (String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(getStudents().toString());
        fileWriter.close();
    }

    public static List<Student> readStudentsFromFile (String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        String fileTxt = scanner.nextLine();
        fileReader.close();


        String[] tmpArr = fileTxt.split("}, ");
        tmpArr[0] = tmpArr[0].substring(1);

        List<Student> studentsFromFile = new ArrayList<>();

        for (String aTmpArr : tmpArr) {
            String[] tmpString = aTmpArr.split(", ");

            int[] agesTmp = new int[2];
            agesTmp[0] = Integer.parseInt(tmpString[0].substring(19, 23));
            agesTmp[1] = Integer.parseInt(tmpString[1].substring(0, 4));

            String nameTmp = tmpString[2].substring(6);
            nameTmp = nameTmp.substring(0, nameTmp.length() - 1);

            int ageTmp = Integer.parseInt(tmpString[3].substring(4));

            Gender genderTmp;
            if (tmpString[4].charAt(7) == 'M') {
                genderTmp = Gender.MAN;
            } else if (tmpString[4].charAt(7) == 'W') {
                genderTmp = Gender.WOMEN;
            } else {
                genderTmp = Gender.OTHER;
            }

            double weightTmp = Double.parseDouble(tmpString[5].substring(7, 11));

            Student student = new Student(nameTmp, ageTmp, genderTmp, weightTmp, agesTmp);

            studentsFromFile.add(student);
        }

        return studentsFromFile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studyAges=" + Arrays.toString(studyAges) +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }
}
