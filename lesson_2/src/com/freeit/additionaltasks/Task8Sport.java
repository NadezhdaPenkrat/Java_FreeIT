package com.freeit.additionaltasks;
/*  8) Начав тренировки,
спортсмен в первый день
пробежал 10 км.
 Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 Какой суммарный путь пробежит спортсмен за 7 дней?
*/
public class Task8Sport {
    public static void main(String[] args) {
            double distanceDay = 10;
            double increasedDaily = 10;
        for (int i = 0; i < 7; i++) {
            distanceDay = distanceDay * 1.1;
            increasedDaily += distanceDay;
            }
            System.out.println("an athlete will run in 7 days   " + increasedDaily);
    }
}
