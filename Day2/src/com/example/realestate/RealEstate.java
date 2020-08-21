package com.example.realestate;

public abstract class RealEstate {
    public double meterPrice;
    public double wholePrice;
    public double totalSpace;

    public RealEstate(){}

    private double getWholePrice(double meterPrice, double totalSpace){
        return totalSpace * meterPrice;
    }

    public RealEstate(double totalSpace, double meterPrice){
        this.meterPrice = meterPrice;
        this.totalSpace = totalSpace;
        this.wholePrice = getWholePrice(totalSpace, meterPrice);
    }
}


