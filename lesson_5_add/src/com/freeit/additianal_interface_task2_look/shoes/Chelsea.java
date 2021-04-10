package com.freeit.additianal_interface_task2_look.shoes;

public class Chelsea implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Chelsea on");
    }

    @Override
    public void putOff() {
        System.out.println(" Chelsea off");
    }
}
