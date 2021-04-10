package com.freeit.additianal_interface_task1_robot.legs;

public class SamsungLegs implements ILeg {
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    public SamsungLegs() {
    }

    @Override
    public void step() {
        System.out.println("Samsung  leg foot has stepped .");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
