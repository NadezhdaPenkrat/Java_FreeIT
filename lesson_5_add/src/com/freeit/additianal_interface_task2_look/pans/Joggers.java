package com.freeit.additianal_interface_task2_look.pans;

public class Joggers implements Pans {
    @Override
    public void putOn() {
        System.out.println(" Joggers on");
    }

    @Override
    public void putOff() {
        System.out.println(" Joggers off");
    }
}
