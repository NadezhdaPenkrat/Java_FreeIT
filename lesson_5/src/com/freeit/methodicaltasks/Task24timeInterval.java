package com.freeit.methodicaltasks;

/*
Создать класс и объекты описывающие промежуток времени.
Сам промежуток в классе должен задаваться тремя свойствами:
секундами, минутами, часами.
Сделать методы для получения полного
количества секунд в объекте,
сравнения двух объектов (метод должен работать
аналогично compareTo в строках).
Создать два конструктора:
получающий общее количество секунд, и часы, минуты и секунды
по отдельности.
Сделать метод для вывода данных.
 */
class Task24timeInterval {
    private int hour, minut, second;

    public Task24timeInterval(int h, int m, int s, int allsec) {
        hour = h;
        minut = m;
        second = s;

    }
    private int allseconds;
    public Task24timeInterval( int allsec) {
        allseconds = allsec;
    }


    public int returnAllSecond() {
        return hour * 3600 + minut * 60 + second;
    }

    public void printAllTime() {
        System.out.println("Object1 \\(only seconds\\) = " + second);
    }

    public void printDividedTime() {
        System.out.println(String.format("Object2 have %s hours, %s minuts, %s seconds", hour, minut, second));
    }

    public int compareTime() {
        if (this.second >= this.returnAllSecond()) {
            System.out.println("Object1 => Object2");
        } else {
            System.out.println("Object1 < Object2");
        }

        return this.second - this.returnAllSecond();

    }
}

class MainTimeInterval {

    public static void main(String[] args) {
        Task24timeInterval obj1 = new Task24timeInterval(15000,5632,45,553531);
        Task24timeInterval obj2 = new Task24timeInterval(24,15,1,269433);
        obj1.printAllTime();
        obj2.printDividedTime();
        obj2.compareTime();
    }

}
