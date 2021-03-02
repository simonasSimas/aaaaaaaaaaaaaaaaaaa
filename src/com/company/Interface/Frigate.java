package com.company.Interface;

public class Frigate implements IsSeaVehicle {

    private int displacement;
    private int maxPassengers;
    private int maxSpeed;
    private String name;


    void fireGun(){
         System.out.println("Fires Gun");
     }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int a) {
        this.displacement=a;
    }

    @Override
    public void launch() {

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
