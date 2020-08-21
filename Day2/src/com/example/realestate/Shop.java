package com.example.realestate;

public class Shop extends NonLivingSpace {
    protected String productsProduced;
    public String companyName;

    public Shop(double totalSpace, double meterPrice, String targetOccupation, boolean workingEmployees,
                boolean separateBuilding, String productsProduced, String companyName){
        super(totalSpace, meterPrice, separateBuilding, workingEmployees, targetOccupation);
        this.productsProduced = productsProduced;
        this.companyName = companyName;
    }
}
