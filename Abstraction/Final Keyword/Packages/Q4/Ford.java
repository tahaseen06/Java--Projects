package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Kiran";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        return 22;
    }
}