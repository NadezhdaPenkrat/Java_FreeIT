package com.freeit.additionaltasks;

import java.util.Random;

/* 7)  В переменную записываете количество программистов.
В зависимости от количества программистов
необходимо вывести правильно окончание.
Например:
• 2 программиста
• 1 программиста
• 10 программистов • и т.д.
*/
public class Task7Specialist {
    public static void main(String[] args) {
        Random random = new Random();
        int specialist = random.nextInt(10);
        System.out.print(" Дано количество программистов: " + specialist);

                if (specialist == 0) {
        System. out .println( " программистов" ); //Ноль программистов
    } else if (specialist==1) {
        System. out .println( " программист" ); //Один программист
    } else if (specialist>=2 && specialist<=4) {
        System. out .println( " программиста" ); //2 или 3 или 4программиста
    } else {
        System. out .println( " программистов" ); //10 программистов • и т.д.
    }
}
}
