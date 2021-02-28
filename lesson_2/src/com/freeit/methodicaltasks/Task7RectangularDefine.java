package com.freeit.methodicaltasks;
import java.util.Random;
/*
7) Имеется прямоугольное отверстие
 размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class Task7RectangularDefine {
    public static void main(String[] args) {
        Random random = new Random();
        int sideA = 5;
        int sideB = 8;
        int radius = 5;
        if (radius * radius >= (sideA * sideA + sideB * sideB) / 4) {
            System.out.println(" Determine. " +
                    "Rectangular hole size completely cover with a round cardboard radius" );
        } else {
            System.out.println("Do not define. " +
                    "Rectangular hole size does not completely cover with a round cardboard radius" );
        }
    }
}
