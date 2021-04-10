package com.freeit.additianal_interface_task2_look;

import additianal_interface_task2_look.jacket.*;
import additianal_interface_task2_look.pans.*;
import additianal_interface_task2_look.shoes.*;


public class Run {
    public static void main(String[] args) {

        Human human1 = new Human("Amanda", new Bomber(), new Joggers(), new Lofers());
        Human human2 = new Human("Odri", new Trench(), new Chinos(), new Wellingtons());
        System.out.println();
        human1.dressed();
        human1.undressed();
        System.out.println();
        human2.dressed();
        human2.undressed();
        System.out.println();

    }
}