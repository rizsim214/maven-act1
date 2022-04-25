package com.personpack;

public class Student extends Person {
    private int yearLvl;

    public Student(String firstName, String lastName, int age, int yearLvl) {
        super(firstName, lastName, age);
        this.yearLvl = yearLvl;
    }

    public void introduction() {
        System.out.println("Hello! My name is " + getFirstName().toUpperCase() + " " + getLastName().toUpperCase());
        System.out.println("I am " + getAge() + "years old...");
        System.out.println("  I am currently a " + this.yearLvl + "th Year Student");
    }

    public int getYearLvl() {
        return yearLvl;
    }

    public void setYearLvl(int yearLvl) {
        this.yearLvl = yearLvl;
    }
}
