package com.freeit.additianal_abstract_class_task2_transport;

/*
В классе Гражданский добавляются поля:
 - Кол-во пассажиров
 - Наличие бизнес класса (true/false)

 разработать метод описание,
  который будет возвращать составленную строку
   с описанием всех характеристик объекта.
 В строку включить ещё один параметр :
 мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах
 производится в отдельном методе : 1 л.с = 0.74 кВ.

Для Гражданских самолётов
разработать метод,
 который проверит ,
 можно ли разместить в него xxx  пассажиров

Метод должен проверять,
 если это кол-во пассажиров помещается в самолёт,
  то выводит в консоль ”самолёт загружен”,
 если кол-во пассажиров,
  которое нужно загрузить больше , чем то
  которое может влезть в наш самолёт
   то выводим
 “Вам нужен самолёт побольше ”.
*/
public class TransportSubspeciesAerialСivilian extends TransportTypeAerial {
    int numberOfPassengers;
    boolean businessClassAvailability;

    public TransportSubspeciesAerialСivilian
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel,
             int wingspanM,
             int minimumRunwayLengthForTakeOff,
             int numberOfPassengers,
             boolean businessClassAvailability) {
        super(enginePowerHorsePower, maxSpeedKmH, massKg, brandModel,
                wingspanM, minimumRunwayLengthForTakeOff);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double powerInKilowatt(int enginePowerHorsePower) {
        return enginePowerHorsePower * 0.74;
    }

    public void boarding(int people) {
        if (people <= numberOfPassengers) {
            System.out.println("The plane is loaded");
        } else {
            System.out.println("You need a larger  plane");
        }
    }

    public String TransportSubspeciesAerialСivilianInfo() {
        return "Сivilian  " + super.TransportTypeAerialInfo() +
                "number Of Passengers , capacity = " + numberOfPassengers +'\n'+
                " passengers, business class availability = " + businessClassAvailability +'\n'+
                " Kw= " + powerInKilowatt(enginePowerHorsePower) +'\n'+
                " ";
    }
}
