package com.freeit.additianal_interface_task1_robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println(" Sony  head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
