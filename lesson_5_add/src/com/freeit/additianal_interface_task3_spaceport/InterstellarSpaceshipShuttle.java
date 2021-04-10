package com.freeit.additianal_interface_task3_spaceport;

import java.util.Random;

/*
Создаем класс Шатл.
Шатл реализует интерфейс IStart.
• В методе предстартовой проверки
генерируем случайное число в диапазоне от 0 до 10.
Если сгенерированное число
больше 3-х то проверка прошла успешно.
Если нет не успешно.
• В методе запуска двигателей
выводим строку в консоль
«Двигатели Шатла запущены. Все системы в норме.»
• В методе старт выводим строку в консоль.
«Старт Шатла»
*/

public class InterstellarSpaceshipShuttle implements IStart {

    public boolean preLaunchSystemCheck() {
        Random random = new Random();
        int check = random.nextInt(10);
        if (check % 2 == 0) {
            System.out.println("The test is successful!");
            return true;
        } else {
            System.out.println("Check failed!");
            return false;
        }
    }

    public void engineStart() {
        System.out.println("Shuttle engines are running. All systems are normal.");
    }

    public void start() {
        System.out.println("Shuttle Launch");
    }
}
