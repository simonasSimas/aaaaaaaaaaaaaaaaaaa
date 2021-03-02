package com.company.Interface;

public class Jeep implements IsLandVehicle{
    private int maxSpeed;
    private int maxPassenger;
    private int numWheels;
    private String name;
    void soundHorn() {
        System.out.println("Beep");
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
        System.out.println("Driving");
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
        return maxPassenger;
    }

    @Override
    public void setMaxPassengers(int a) {
        this.maxPassenger=a;
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
