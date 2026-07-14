package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {

    public static void main(String[] args) {

        Hero h1 = new Hero();

        System.out.println("----- HERO -----");
        System.out.println("Model : " + h1.getModelName());
        System.out.println("Registration No : " + h1.getRegistrationNumber());
        System.out.println("Owner : " + h1.getOwnerName());
        System.out.println("Speed : " + h1.getSpeed());
        h1.radio();

        System.out.println();

        Honda h2 = new Honda();

        System.out.println("----- HONDA -----");
        System.out.println("Model : " + h2.getModelName());
        System.out.println("Registration No : " + h2.getRegistrationNumber());
        System.out.println("Owner : " + h2.getOwnerName());
        System.out.println("Speed : " + h2.getSpeed());
        h2.cdplayer();
    }
}