package com.freeit.additianal_interface_task2_look.jacket;

public class Trench implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Trench on");
    }

    @Override
    public void putOff() {
        System.out.println("Trench off");
    }
}
