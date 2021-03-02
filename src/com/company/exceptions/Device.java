package com.company.exceptions;

public class Device {
    private boolean isOn;
    private int id;

    public Device(boolean isOn, int id) {
        this.isOn = isOn;
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void ping() throws DeviceIsOffException {

        try {
            if (isOn) {
                System.out.println("Device " + getClass().getSimpleName() + " with id " + getId() + " is ON");
            }else {
                throw new DeviceIsOffException();
            }
        }catch (DeviceIsOffException e){
            System.out.println("Device " + getClass().getSimpleName() + " with id " + getId() + " is OFF");
        }

    }
}
