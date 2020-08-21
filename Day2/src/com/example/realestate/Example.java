package com.example.realestate;

public class Example {
    public static void main(String[] args){
        Shop sampleShop = new Shop(323, 10000, "sales", true,
                true, "fastfood", "mcDonalds");
        System.out.println(sampleShop.wholePrice);
        System.out.println(sampleShop.companyName);

        PrivateHouse samplePrivateHouse = new PrivateHouse(123, 849, 4, true, 1);
        System.out.println(samplePrivateHouse.wholePrice);
        System.out.println(samplePrivateHouse.roomsNumber);



    }
}
