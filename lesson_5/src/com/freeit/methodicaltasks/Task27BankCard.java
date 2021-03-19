package com.freeit.methodicaltasks;

/*
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */
class Task27BankCard {

    private static String clientName;
    private static int lastnumbCard;

    public Task27BankCard(String clientName, int numb) {
        this.clientName = clientName;
        this.lastnumbCard = numb;

    }

    public static void main(String[] args) {
        Task27BankCard mastercard1 = new Task27BankCard("BobbyNewberry", 6445);
        System.out.println(" clientName" + "   " + clientName + "   " + "lastnumbCard" + "   " + lastnumbCard);
        Task27BankCard mastercard2 = new Task27BankCard("KevinMaher", 1323);
        System.out.println(" clientName" + "   " + clientName + "   " + "lastnumbCard" + "   " + lastnumbCard);
        Task27BankCard visa = new Task27BankCard("BryanFreeman", 4122);
        System.out.println(" clientName" + "   " + clientName + "   " + "lastnumbCard" + "   " + lastnumbCard);
    }

    class MasterCard extends Task27BankCard {
        private final char currency = '$';

        public char getСurrency() {
            return currency;
        }

        public MasterCard(String clientName, int numb) {
            super(clientName, numb);
        }
    }

    class Visa extends Task27BankCard {
        private final char currency = '€';

        public char getСurrency() {
            return currency;
        }

        public Visa(String clientName, int numb) {
            super(clientName, numb);
        }

    }
}
