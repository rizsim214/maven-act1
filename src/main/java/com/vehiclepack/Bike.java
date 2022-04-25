package com.vehiclepack;

public class Bike extends Vehicle {
    private double wheelPower;

    public Bike(int noWheels, String engineType, double wheelPower) {
        super(noWheels, engineType);
        this.wheelPower = wheelPower;
    }

    public Bike(int noWheels, String engineType, double wheelPower, double gasTank, double gasConsume, String vehicleName) {
        super(noWheels, engineType, gasTank, gasConsume, vehicleName);
        this.wheelPower = wheelPower;
    }

    @Override
    public void displayInfo() {
        System.out.println("Number of Wheels: " + getNoWheels() + "\nEngine Type: " + getEngineType().toUpperCase() + "\nHorse Power: " + this.wheelPower + " CC");
    }

    public double getwheelPower() {
        return wheelPower;
    }

    public void setwheelPower(double wheelPower) {
        this.wheelPower = wheelPower;
    }
}
