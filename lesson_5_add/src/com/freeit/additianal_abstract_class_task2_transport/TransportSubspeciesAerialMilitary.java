package com.freeit.additianal_abstract_class_task2_transport;
/*
В классе Военный  добавляются поля:
- Наличие системы катапультирования (true/false)
- Кол-во ракет на борту

разработать метод описание,
 который будет возвращать составленную строку с описанием всех характеристик объекта.
 В строку включить ещё один параметр:
  мощность в киловаттах (кВ) .
 Расчёт мощности в киловаттах
  производится в отдельном методе : 1 л.с = 0.74 кВ

Для Военных самолётов делаем метод выстрел,
проверяем
если кол-во ракет не равно 0
то выводим на консоль “ Ракета пошла…”,
если 0 то
“Боеприпасы отсутствуют”.

А так же метод катапультирование,
который проверит
если наличие системы катапультирования true,
 то выводим “Катапультирование прошло успешно”,
 если false, то “У вас нет такой системы ”
 */

public class TransportSubspeciesAerialMilitary extends TransportTypeAerial {
    boolean ejectionSystemAvailability;
    int numberMissilesOnBoard;

    public TransportSubspeciesAerialMilitary
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel,
             int wingspanM,
             int minimumRunwayLengthForTakeOff,
             boolean ejectionSystemAvailability,
             int numberMissilesOnBoard) {
        super(enginePowerHorsePower, maxSpeedKmH, massKg, brandModel,
                wingspanM, minimumRunwayLengthForTakeOff);
        this.ejectionSystemAvailability = ejectionSystemAvailability;
        this.numberMissilesOnBoard = numberMissilesOnBoard;
    }

    public int getNumberMissilesOnBoard() {
        return numberMissilesOnBoard;
    }

    public void setNumberMissilesOnBoard(int numberMissilesOnBoard) {
        this.numberMissilesOnBoard = numberMissilesOnBoard;
    }

    public double powerInKilowatt(int enginePowerHorsePower) {
        return enginePowerHorsePower * 0.74;
    }

    public void missilesLaunch() {
        System.out.println(numberMissilesOnBoard-- > 0 ? "Missile launched" : "No missiles");
    }

    public void catapulting() {
        System.out.println(ejectionSystemAvailability ? "System launch. ejection System Availability." : "System is not available");
    }

    public String TransportSubspeciesAerialMilitaryInfo() {
        return "Military " + super.TransportTypeAerialInfo() +
                "ejection System Availability  = " + ejectionSystemAvailability +'\n'+
                " number Missiles On Board = " + numberMissilesOnBoard +'\n'+
                " Kw= " + powerInKilowatt(enginePowerHorsePower) +'\n'+
                " ";
    }
}

