package com.automobile;

import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;
public class TestFourWheeler {
	public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("----- LOGAN -----");
        System.out.println("Model Name : " + l.getModelName());
        System.out.println("Registration Number : " + l.getRegistrationNumber());
        System.out.println("Owner Name : " + l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        System.out.println("GPS : " + l.gps());

        System.out.println();

        Ford f = new Ford();

        System.out.println("----- FORD -----");
        System.out.println("Model Name : " + f.getModelName());
        System.out.println("Registration Number : " + f.getRegistrationNumber());
        System.out.println("Owner Name : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        System.out.println("Temperature Control : " + f.tempControl());
    }
}
