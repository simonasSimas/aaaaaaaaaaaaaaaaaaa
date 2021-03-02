package com.company.Interface;

public class Hovercraft implements IsSeaVehicle,IsLandVehicle {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int maxDisplacement;
    private int numWheels;
    void enterLand() {
        System.out.println("Entered land");
    }

    void enterSea() {
        System.out.println("Entered sea");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int a) {
        this.numWheels=a;
    }

    @Override
    public void drive() {
        System.out.println("Vehicle is driving");
    }

    @Override
    public int getDisplacement() {
        return maxDisplacement;
    }

    @Override
    public void setDisplacement(int a) {
        this.maxDisplacement=a;
    }

    @Override
    public void launch() {
        System.out.println("Vehicle has been launched");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String a) {
        this.name=a;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int a) {
        this.maxPassengers=a;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int a) {
        this.maxSpeed=a;
    }
}

