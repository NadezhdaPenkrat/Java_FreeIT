package com.freeit.src;

//Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//А) минут + секунд,
//В) часов + минут + секунд,
//С) дней + часов + минут + секунд,
//D) недель + дней + часов + минут + секунд.
public class Task3TimePrinter {
    public static void main(String[] args) {
        int s = 4500; //Имеется 4500 секунд

        int sec = s % 60;
        int m = (s - sec) / 60; //А) минут + секунд.
        int min = m % 60;
        int h = m / 60;  //В) часов + минут + секунд.
        int hour = h % 60;
        int d = h / 24; //С) дней + часов + минут + секунд.
        int day = d % 24;
        int w = d / 7; //D) недель + дней + часов + минут + секунд.
        int week = w % 7;
        // Вывести в консоль содержащихся в этом количестве секунд:
        System.out.println(min + " минут " + sec + "секунд");
        System.out.println(hour + " часов " + min + " минут " + sec + "секунд");
        System.out.println(day + " дней " + hour + " часов " + min + " минут " + sec + "секунд");
        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + "секунд");
    }
}



