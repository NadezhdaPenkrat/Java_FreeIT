package com.freeit.methodicaltasks;
/*
7) Имеется прямоугольное отверстие
 размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int r = 5;
        if (r * r >= (a * a + b * b) / 4) {
            System.out.println(" Determine. " +
                    "Rectangular hole size completely cover with a round cardboard radius" );
        } else {
            System.out.println("Do not define. " +
                    "Rectangular hole size does not completely cover with a round cardboard radius" );
        }
    }
}Rectangular