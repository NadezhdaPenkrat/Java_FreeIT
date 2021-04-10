package com.freeit.additianal_interface_task1_robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Samsung head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
