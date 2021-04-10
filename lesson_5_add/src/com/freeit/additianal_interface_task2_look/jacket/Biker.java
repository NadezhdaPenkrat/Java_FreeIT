package com.freeit.additianal_interface_task2_look.jacket;

public class Biker implements Jacket {
    @Override
    public void putOn() {
        System.out.println(" Biker  on ");
    }

    @Override
    public void putOff() {
        System.out.println("Biker  off");
    }
}

