package com.freeit.methodicaltasks;
/*
Создать класс и объекты описывающие Банкомат.
 Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
 количеством купюр номиналом 20 50 100.
  Сделать методы для добавления денег в банкомат.
  Сделать функцию снимающую деньги.
  На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет).
При снятии денег функция должна рапечатывать:
 каким количеством купюр - какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.
 */

import java.util.Scanner;

public class Task25CashMashine {
    double nominalCurrency20, nominalCurrency50, nominalCurrency100;
    private static double oldBalance, currentBalanceAllMoney, newBalanceAllMoney;

    //конструктор , применяемый при указании всех размеров
    public void CashMashine
    (double nominalCurrency20,
     double nominalCurrency50,
     double nominalCurrency100) {
        nominalCurrency100 = 100;
        nominalCurrency50 = 50;
        nominalCurrency20 = 20;
    }

    //конструктор ,применяемый в отсутствие размеров
    public void CashMashine() {
        double nominalCurrency100 = -1;
        double nominalCurrency50 = -1;
        double nominalCurrency20 = -1;
    }

    public void addMoney
            (double addMoney20,
             double addMoney50,
             double addMoney100) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        double amountallAddMoney = input.nextDouble();
        nominalCurrency20 += addMoney20;
        nominalCurrency50 += addMoney50;
        nominalCurrency100 += addMoney100;

        System.out.println("Your deposit nominal Currency 20: " + (amountallAddMoney / nominalCurrency20));
        System.out.println("Your deposit nominal Currency 50: " + (amountallAddMoney / nominalCurrency50));
        System.out.println("Your deposit nominal Currency 100: " + (amountallAddMoney / nominalCurrency100));
        System.out.println("Your deposit amount: " + amountallAddMoney);
        currentBalanceAllMoney += amountallAddMoney;
        System.out.println("Your new balance is: " + currentBalanceAllMoney);
    }

    public static double displayBalance() {
        oldBalance = 0.00;
        double newBalanceAllMoney = currentBalanceAllMoney + oldBalance;
        System.out.println("Total balance is: $" + newBalanceAllMoney);

        return 1;
    }

    public boolean takeAwayMoney
            (double withdrawMoney20,
             double withdrawMoney50,
             double withdrawMoney100,
             double sum) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter withdraw amount:");
        double amountWithdrawMoney = input.nextDouble();

        nominalCurrency20 -= withdrawMoney20;
        nominalCurrency50 -= withdrawMoney50;
        nominalCurrency100 -= withdrawMoney100;
        currentBalanceAllMoney -= amountWithdrawMoney;
        System.out.println("Your  withdraw Money 20: " + (amountWithdrawMoney / nominalCurrency20));
        System.out.println("Your  withdraw Money 50: " + (amountWithdrawMoney / nominalCurrency50));
        System.out.println("Your  withdraw Money 100: " + (amountWithdrawMoney / nominalCurrency100));
        System.out.println("Your  amount Withdraw Money: " + amountWithdrawMoney);

        System.out.println("Your new balance is: " + currentBalanceAllMoney);

        if (sum > nominalCurrency20 * 20 + nominalCurrency50 * 50 + nominalCurrency100 * 100) {
            sum += nominalCurrency20 * 20 + nominalCurrency50 * 50 + nominalCurrency100 * 100;
            System.out.println("Сongratulations, take the cash!");
            return true;
        } else {
            System.out.println("There are not enough nominal Currency in the Cash Mashine.");
            System.out.println("This operation cannot be performed");
            return false;
        }

    }

    public void requestCash
            (double requestCash,
             double nominalCurrency20,
             double nominalCurrency50,
             double nominalCurrency100) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum, please, enter correct sum");
        } else {
            boolean firstAnswer;

            if (nominalCurrency100 * 100 + nominalCurrency50 * 50 + nominalCurrency20 * 20 >= requestCash) {
                System.out.println("Request Cash confirmed");
                firstAnswer = true;
            } else {
                firstAnswer = false;
                System.out.println("Not enough money");
            }

        }

    }
}

class AccessMenuATM extends Task25CashMashine {
    public static void main(String[] args) {

        Task25CashMashine subObj = new Task25CashMashine();

        subObj.addMoney(20, 50, 100);
        System.out.println();
        subObj.displayBalance();
        System.out.println();
        subObj.takeAwayMoney(1, 20, 50, 1000);
        System.out.println();
        subObj.displayBalance();
        System.out.println();
        subObj.requestCash(100, 20, 50, 100);
        System.out.println();

    }
}
