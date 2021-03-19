package com.freeit.methodicaltasks;
/*
Создать иерархию классов,
описывающих бытовую технику.
Создать несколько
объектов описанных классов,
часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */
public class Task26Appliances {
    public static void main(String[] args) {
        PlugInable icebox = new Refrigerator("LG");
        icebox.plugIn();
        PlugInable washer = new Washer("Samsung");
        washer.plugIn();
        PlugInable hairdryer = new Hairdryer("Philips");
        hairdryer.plugIn();
    }
}

abstract class Household {
    String name;

    public Household(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

interface PlugInable {
    void plugIn();
}


class Refrigerator extends Household implements PlugInable {

    public Refrigerator(String name) {
        super(name);
    }

    public void plugIn() {
        System.out.println(this + " connected to the outlet for a refrigerator!");
    }

}

class Washer extends Household implements PlugInable {

    public Washer(String name) {
        super(name);
    }

    public void plugIn() {
        System.out.println(this + " plugged in for a washing machine!");
    }

}

class Hairdryer extends Household implements PlugInable {

    public Hairdryer(String name) {
        super(name);
    }

    public void plugIn() {
        System.out.println(this + " plugged in for a hair dryer!");
    }

}
