package com.personpack;
import java.util.Scanner;

import com.vehiclepack.Vehicle;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private String travelVehicle;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public Person(String firstName, String lastName, int age, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }

    public void introduction() {
        System.out.println("Hello! My name is " + firstName.toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("I am " + age + "years old...");
    }

    public void travel(Vehicle vehicle){
        Scanner scan = new Scanner(System.in);

        System.out.println("Where do you want to travel?");
        String destination = scan.nextLine();
        System.out.print("Travel Distance: ");
        double distance = scan.nextDouble();

        double gasUsed = distance / vehicle.getGasConsume();
        scan.close();
        
        System.out.println("Gas Used: " + gasUsed);
        System.out.println("Remaining Gas" + vehicle.getGasTank());
        if(gasUsed < vehicle.getGasTank()){
            this.location = destination;
            this.travelVehicle = vehicle.getVehicleName();
            double newGas = vehicle.getGasTank() - gasUsed;
            vehicle.setGasTank(newGas);
            System.out.println(this.firstName + " " + this.lastName + " traveled to " + this.location.toUpperCase() + " using " + this.travelVehicle.toUpperCase());
            System.out.println("Current Remaining Gas: " + vehicle.getGasTank());
        }else{
            System.out.println("Your vehicle lacks the gas tank capacity to travel to that distance...");
        }
        
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getTravelVehicle() {
        return travelVehicle;
    }


    public void setTravelVehicle(String travelVehicle) {
        this.travelVehicle = travelVehicle;
    }
}
