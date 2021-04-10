package com.freeit.additianal_interface_task1_robot.legs;

public class SonyLegs implements ILeg {
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }

    @Override
    public void step() {
        System.out.println("Sony  leg foot has stepped");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
