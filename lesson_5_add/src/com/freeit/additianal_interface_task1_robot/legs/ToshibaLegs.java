package com.freeit.additianal_interface_task1_robot.legs;

public class ToshibaLegs implements ILeg {
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    public ToshibaLegs() {
    }

    @Override
    public void step() {
        System.out.println("Toshiba   leg foot has stepped");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
