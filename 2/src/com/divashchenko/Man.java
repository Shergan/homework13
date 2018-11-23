package com.divashchenko;

public class Man {
    protected enum Gender {
        MAN, WOMEN, OTHER
    }

    protected String name;
    protected int age;
    protected Gender gender;
    protected double weight;

    public Man(String name, int age, Gender gender, double weight) {
        if (age <= 0 || weight <= 0 || name.length() == 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }
}
