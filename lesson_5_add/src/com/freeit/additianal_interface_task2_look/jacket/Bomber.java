package com.freeit.additianal_interface_task2_look.jacket;

public class Bomber implements Jacket {
    @Override
    public void putOn() {
        System.out.println(" Bomber  on");
    }

    @Override
    public void putOff() {
        System.out.println(" Bomber  off");
    }
}
