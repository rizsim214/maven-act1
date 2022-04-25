package com.vehiclepack;

public class Car extends Vehicle {
    private double storage_capacity;

    public Car(int noWheels, String engineType, double storage_capacity){
        super(noWheels, engineType);
        this.storage_capacity = storage_capacity;
    }
    public Car(int noWheels, String engineType, double storage_capacity, double gasTank, double gasConsume, String vehicleName){
        super(noWheels, engineType, gasTank, gasConsume, vehicleName);
        this.storage_capacity = storage_capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Number of Wheels: " + getNoWheels() + "\nEngine Type: " + getEngineType().toUpperCase() + "\nStorage Capacity: " + storage_capacity + " Seats");
    }

    public double getStorage_capacity() {
        return storage_capacity;
    }
 
    public void setStorage_capacity(double storage_capacity) {
        this.storage_capacity = storage_capacity;
    }
}
