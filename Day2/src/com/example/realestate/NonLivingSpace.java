package com.example.realestate;



public class NonLivingSpace extends  RealEstate {
    protected boolean workingEmployees;
    protected boolean separateBuilding;
    public String targetOccupation;

    public NonLivingSpace(double totalSpace, double meterPrice, boolean workingEmployees, boolean separateBuilding,
                          String targetOccupation){
        super(totalSpace, meterPrice);
        this.workingEmployees = workingEmployees;
        this.separateBuilding = separateBuilding;
        this.targetOccupation = targetOccupation;
    }
}
