package com.freeit.additianal_interface_task2_look;


/*
Создаём класс человек:
У человека поля:
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)
*/

import additianal_interface_task2_look.jacket.Jacket;
import additianal_interface_task2_look.pans.Pans;
import additianal_interface_task2_look.shoes.Shoes;

public class Human implements IHuman {
    private String name;
    private Jacket jacket;
    private Pans pans;
    private Shoes shoes;


    public Human() {

    }

    public Human(String name, Jacket jacket, Pans pans, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pans = pans;
        this.shoes = shoes;
    }

    @Override
    public void dressed() {

        jacket.putOn();
        pans.putOn();
        shoes.putOn();
    }

    @Override
    public void undressed() {

        jacket.putOff();
        pans.putOff();
        shoes.putOff();

    }
}
