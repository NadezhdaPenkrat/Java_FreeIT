package com.freeit.additianal_interface_task1_robot;

/*
Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.
*/

import additianal_interface_task1_robot.hands.SamsungHand;
import additianal_interface_task1_robot.hands.SonyHand;
import additianal_interface_task1_robot.hands.ToshibaHand;
import additianal_interface_task1_robot.heads.SamsungHead;
import additianal_interface_task1_robot.heads.SonyHead;
import additianal_interface_task1_robot.heads.ToshibaHead;
import additianal_interface_task1_robot.legs.SamsungLegs;
import additianal_interface_task1_robot.legs.SonyLegs;
import additianal_interface_task1_robot.legs.ToshibaLegs;

public class Run {

    public static void main(String[] args) {

        Robot robot1 = new Robot(new ToshibaHead(), new SonyHand(), new ToshibaLegs());
        Robot robot2 = new Robot(new SamsungHead(), new ToshibaHand(), new SamsungLegs());
        Robot robot3 = new Robot(new SonyHead(), new SamsungHand(), new SonyLegs());

        robot1.action();
        System.out.println("robot1  costs " + robot1.getPrice());
        System.out.println();
        robot2.action();
        System.out.println("robot2 costs " + robot2.getPrice());
        System.out.println();
        robot3.action();
        System.out.println("robot3 costs " + robot3.getPrice());
        System.out.println();

        int maxPrice = Math.max(robot1.getPrice(),
                Math.max(robot2.getPrice(),
                        robot3.getPrice()));

        if (robot1.getPrice() == maxPrice) {
            System.out.println("robot1Samsung max Price: " + maxPrice);
        }
        if (robot2.getPrice() == maxPrice) {
            System.out.println("robot2Sony max Price : " + maxPrice);
        }
        if (robot3.getPrice() == maxPrice) {
            System.out.println("robot3Toshiba max Price: " + maxPrice);
        }
    }
}
