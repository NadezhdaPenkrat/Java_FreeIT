package com.freeit.additianal_interface_task1_robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Toshiba  head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
