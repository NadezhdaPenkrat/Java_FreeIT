package com.freeit.additionaltasks;

import java.util.Scanner;

/*9)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
*/
public class Task9Ameba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int x = scan.nextInt();
        int res = 1;
        for (int i = 0; i < x / 3; i++) {
            res *= 2;
        }
        System.out.printf("За %d часов получится %d амеб.", x, res);
    }
}
