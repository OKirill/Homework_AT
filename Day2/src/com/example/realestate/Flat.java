package com.example.realestate;

public class Flat extends LivingSpace {
    protected int floorNumber;

    public Flat(double totalSpace, double meterPrice, int roomsNumber, boolean livingSquare, int floorNumber){
        super(totalSpace, meterPrice, livingSquare, roomsNumber);
        this.floorNumber = floorNumber;
    }
}
