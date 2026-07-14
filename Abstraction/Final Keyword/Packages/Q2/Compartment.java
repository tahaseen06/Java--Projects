package com.wipro.automobile.ship;

public class Compartment {
	private int height;
    private int width;
    private int breadth;

    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Height : " + height);
        System.out.println("Width  : " + width);
        System.out.println("Breadth: " + breadth);
    }

    public static void main(String[] args) {
        Compartment c = new Compartment(10, 20, 30);
        c.display();
    }
}
