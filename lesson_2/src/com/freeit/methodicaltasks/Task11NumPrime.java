package com.freeit.methodicaltasks;
/*
11) Имеется целое число,
определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
 */
public class Task11 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("Compositive number ");
        } else {
            System.out.println("Prime number");
        }
    }
}
