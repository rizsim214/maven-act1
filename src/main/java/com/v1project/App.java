package com.v1project;

import com.personpack.Person;
import com.personpack.Student;
import com.personpack.Teacher;
import com.vehiclepack.Vehicle;
import com.vehiclepack.Bike;
import com.vehiclepack.Car;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // activityOne();
        activityTwo();
    }
    // Activity II
    public static void activityTwo(){
        Person riz = new Person("Riz", "Sim", 25, "Borongan");
        System.out.println("This Person " + riz.getFirstName().toUpperCase() + " " + riz.getLastName().toUpperCase() + " is currently located at " + riz.getLocation().toUpperCase());

        Vehicle mustang = new Vehicle(4, "8 Strokes", 20, 15, "Mustang");

        riz.travel(mustang);
        
    }
    // Activity I
    public static void activityOne(){
        int personAge = 28;
        int studentAge = 18;
        int teacherAge = 48;  
        int yearLvl = 4;
        int vehicleWheel = 4;
        int bikeWheel = 2; 
        int carWheel = 4; 
        int storage = 6; 
        int wheelPower = 450;
        
        System.out.println("PERSON PACKAGE");
        // Initialize instance of Person
        Person person1 = new Person("Mike", "Shinoda", personAge);
        Student student1 = new Student("Axle", "Rose", studentAge, yearLvl);
        Teacher teacher1 = new Teacher("Slack", "Bot", teacherAge, "Master");
        // Call introduction method
        System.out.println("PERSON");
        person1.introduction();
        System.out.println("STUDENT");
        student1.introduction();
        System.out.println("TEACHER");
        teacher1.introduction();
        // Initialize Vehicles
        System.out.println("VEHICLE PACKAGE");
        Vehicle vehicle1 = new Vehicle(vehicleWheel, "Eight Strokes");
        Car car1 = new Car(carWheel, "Twelve Strokes", storage);
        Bike bike1 = new Bike(bikeWheel, "Four Strokes", wheelPower);
        // Call Vehicle Display Info
        System.out.println("VEHICLE");
        vehicle1.displayInfo();
        System.out.println("CAR");
        car1.displayInfo();
        System.out.println("BIKE");
        bike1.displayInfo();
    }
}
