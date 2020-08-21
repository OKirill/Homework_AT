package com.example.realestate;

public class LivingSpace extends RealEstate {
    protected boolean livingSquare;
    public int roomsNumber;


    public LivingSpace(double totalSpace, double meterPrice, boolean livingSquare, int roomsNumber){
        super(totalSpace, meterPrice);
        this.livingSquare = livingSquare;
        this.roomsNumber = roomsNumber;
    }
}
