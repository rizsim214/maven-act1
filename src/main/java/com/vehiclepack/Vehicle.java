package com.vehiclepack;
 
public class Vehicle { 
    private int noWheels;
    private String engineType;
    private double gasTank;
    private double gasConsume;
    private String vehicleName;

    public Vehicle(int noWheels, String engine) { 
        this.noWheels = noWheels;
        this.engineType = engine;
    }

    public Vehicle(int noWheels, String engine, double gasTank, double gasConsume, String vehicleName) { 
        this.noWheels = noWheels;
        this.engineType = engine;
        this.gasTank = gasTank;
        this.gasConsume = gasConsume;
        this.vehicleName = vehicleName;
    }
    
    public void displayInfo() { 
        System.out.println("Number of Wheels: " + this.noWheels + "\nEngine Type: " + this.engineType.toUpperCase());
    }

    public String getEngineType() { 
        return engineType;
    }

    public void setEngineType(String engineType) { 
        this.engineType = engineType;
    }

    public int getNoWheels() {
        return noWheels;
    }

    public void setNoWheels(int noWheels) {
        this.noWheels = noWheels;
    }

    public double getGasTank() {
        return gasTank;
    }

    public void setGasTank(double gasTank) {
        this.gasTank = gasTank;
    }

    public double getGasConsume() {
        return gasConsume;
    }

    public void setGasConsume(double gasConsume) {
        this.gasConsume = gasConsume;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
       
}
