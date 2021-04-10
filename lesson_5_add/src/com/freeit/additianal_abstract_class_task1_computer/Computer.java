package com.freeit.additianal_abstract_class_task1_computer;
/*
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)
Методы:
- метод описание(вывод всех полей)
- метод включить,
при включении может произойти сбой,
при вызове метода рандом загадывает число (0 либо 1).
 вы вводите число с клавиатуры:
 если угадали - комп включается,
 если нет сгорает.
  Если комп сгорел,
 при попытке включить нужно выдать сообщение,
  что ему - конец
- выключить (аналогично включению)
- при превышении лимита - ресурса комп сгорает
 */

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private String randomAccessMemory;
    private String hardDisk;
    private int resourceFullCycleLife;
    private String strSwitch;
    private boolean on = false;
    private boolean functioning = true;

    public Computer(String processor,
                    String randomAccessMemory,
                    String hardDisk,
                    int resourceFullCycleLife) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.resourceFullCycleLife = resourceFullCycleLife;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(String randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getResourceFullCycleLife() {
        return resourceFullCycleLife;
    }

    public void setResourceFullCycleLife(int resourceFullCycleLife) {
        this.resourceFullCycleLife = resourceFullCycleLife;
    }

    public boolean getFunctioning() {
        return functioning;
    }

    public void setFunctioning(boolean functioning) {
        this.functioning = functioning;
    }

    public String ComputerInfo() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", randomAccessMemory='" + randomAccessMemory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", resourceFullCycleLife=" + resourceFullCycleLife +
                '}';
    }

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int randomNumber = random.nextInt();

    public void switchOn() {
        if (!functioning) {
            System.out.println("Computer burned when trying to switch wrong number ");
            return;
        }
        if (!on) {
            System.out.println("Turn on the computer. Enter the number 0 or 1 ");
            strSwitch = scanner.nextLine();
            switch (strSwitch) {
                case "0":
                case "1":
                    break;
                default:
                    System.out.println("Big Fail");
                    collapse();
            }
            if (strSwitch.equals(Integer.toString(randomNumber))) {
                System.out.println("The computer successfully enabled");
                on = true;
            } else {
                ComputerInfo();
            }

        } else {
            System.out.println("The computer still enabled");
        }
    }

    public void switchOff() {
        if (!functioning) {
            System.out.println("computer burned");
            return;
        }
        if (on) {

            System.out.println("Turn off the computer. Enter the number 0 or 1");
            strSwitch = scanner.nextLine();
            switch (strSwitch) {
                case "0":
                case "1":
                    break;
                default:
                    System.out.println("Big Fail");
                    ComputerInfo();
            }

            if (strSwitch.equals(Integer.toString(randomNumber))) {
                resourceFullCycleLife--;
                if (resourceFullCycleLife == 0) {
                    System.out.println("Your computer burned out due to resource limit exceeding");
                    ComputerInfo();
                } else {
                    System.out.println("Computer shut down successfully");
                    on = false;
                }
            } else {
                ComputerInfo();
            }
        } else {
            System.out.println("Computer still off");
        }
    }

    private void collapse() {
        System.out.println("collapse, computer burned ");

    }

    public static void main(String[] args) {
        Computer computer = new Computer
                ("Aspire",
                        "8GB DDR4Memory",
                        "Acer 315",
                        30);

        System.out.println(computer.ComputerInfo());

        while (computer.functioning) {
            computer.switchOn();
            computer.switchOff();
        }
        System.out.println(computer.ComputerInfo());
    }
}

