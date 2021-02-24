package com.freeit.src;
// Определить число, полученное выписыванием в обратном порядке цифр
// любого 4-х значного натурального числа n.
public class Task4ReverseOrderNumber {
    public static void main(String[] args) {

        int number = 3011;
        while (number>0){
            System.out.print(number%10);
            number/=10;
        }
    }
}
