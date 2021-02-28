package com.freeit.additionaltasks;
// 10) Вычислить: 1+2+4+8+...+256
public class Task10Calculate {
    public static void main(String[] args) {

        int calculate = 0;
        for (int i = 1; i <= 256; i *= 2) {
            calculate += i;
        }
        System.out.println("Вычислить: 1+2+4+8+...+256  = " +calculate);
    }
}

