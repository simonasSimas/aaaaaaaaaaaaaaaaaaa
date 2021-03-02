package com.company.exceptions;

import java.util.List;

public class Monitoring {
    public void pingAllDevices(List<Device> deviceList) throws DeviceIsOffException {
        System.out.println("Started pinging");
        System.out.println("<------------------------------------->");
        System.out.println();
        for (Device list : deviceList){
            list.ping();
        }
        System.out.println();
        System.out.println("<------------------------------------->");
        System.out.println("Finished pinging");
    }
}
