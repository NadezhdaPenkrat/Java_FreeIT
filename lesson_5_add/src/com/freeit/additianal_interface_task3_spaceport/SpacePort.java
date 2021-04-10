package com.freeit.additianal_interface_task3_spaceport;

/*
Создаем класс Космодром.
В классе создаем метод:
• запуск

Метод запуск
принимает объект типа IStart.

В методе первым делом осуществляем
предстартовую проверку переданного объекта,
если она провалилась(метод вернул false)
выводим сообщение «Предстартовая проверка провалена».

Если проверка прошла успешно, то производим
запуск двигателей
(вызываем метод запуска двигателя).

После этого производиться обратный отсчет (10 ..... 1).

После обратного отсчета
вызываем метод
старт переданного объекта.
*/
public class SpacePort {
    public void launch(IStart iStart) {
        if (iStart.preLaunchSystemCheck()) {
            iStart.engineStart();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println("The test is successful!");
            iStart.start();
        } else {
            System.out.println("Prelaunch check failed");
        }
    }
}
