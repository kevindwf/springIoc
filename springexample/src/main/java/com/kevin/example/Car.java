package com.kevin.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private double price;

    @Override
    public String toString(){
        return "brand:" + brand + "," + "price:" + price;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
