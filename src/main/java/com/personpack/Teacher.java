package com.personpack;

public class Teacher extends Person {
    private String degree;

    public Teacher(String firstName, String lastName, int age, String degree) {
        super(firstName, lastName, age);
        this.degree = degree;
    }

    public void introduction() {
        System.out.println("Hello! My name is " + getFirstName().toUpperCase() + " " + getLastName().toUpperCase());
        System.out.println("I am " + getAge() + "years old...");
        System.out.println("I have a " + this.degree.toUpperCase() + " Degree...");
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
