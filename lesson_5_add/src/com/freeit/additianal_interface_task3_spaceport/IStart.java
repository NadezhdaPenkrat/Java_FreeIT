package com.freeit.additianal_interface_task3_spaceport;

/*
Создаем интерфейс IStart.

В интерфейсе определяем методы:
• предстартовая проверка систем(возвращает true/false)
• запуск двигателей(void)
• старт(void)
*/
public interface IStart {

    boolean preLaunchSystemCheck();

    void engineStart();

    void start();

}
