package com.example.realestate;

public class PrivateHouse extends LivingSpace {
    protected int totalFloorNumber;

    public  PrivateHouse(double totalSpace, double meterPrice, int roomsNumber, boolean livingSquare,
                         int totalFloorNumber){
        super(totalSpace, meterPrice, livingSquare, roomsNumber);
        this.totalFloorNumber = totalFloorNumber;

    }

}
