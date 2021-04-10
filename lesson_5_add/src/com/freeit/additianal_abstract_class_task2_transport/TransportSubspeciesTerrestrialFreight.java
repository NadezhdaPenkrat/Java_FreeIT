package com.freeit.additianal_abstract_class_task2_transport;

/*
В классе Грузовой добавляется  поле:
- Грузоподъёмность(т)

разработать метод описание,
 который будет возвращать
 составленную строку
 с описанием всех характеристик объекта.
 В строку включить ещё один параметр мощность в киловаттах (кВ) .
 Расчёт мощности в киловаттах
 производится в отдельном методе : 1 л.с = 0.74 кВ

 Для грузового разработать метод,
  который проверит можно ли загрузить в него xxx  груза
Метод должен проверять
 если это кол-во груза помещается в грузовик
  то выводит в консоль ”Грузовик загружен”,
если кол-во груза, которое нужно загрузить больше ,
 чем то которое может влезть в наш грузовик,
  то выводим
 “Вам нужен грузовик побольше ”.
 */
public class TransportSubspeciesTerrestrialFreight extends TransportTypeTerrestrial {
    int carryingCapacityTons;

    public TransportSubspeciesTerrestrialFreight
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel,
             int numberOfWheels,
             double fuelConsumption,
             int carryingCapacityTons) {
        super(enginePowerHorsePower, maxSpeedKmH, massKg, brandModel,
                numberOfWheels, fuelConsumption);
        this.carryingCapacityTons = carryingCapacityTons;
    }


    public int getCarryingCapacityTons() {
        return carryingCapacityTons;
    }

    public void setCarryingCapacityTons(int carryingCapacityTons) {
        this.carryingCapacityTons = carryingCapacityTons;
    }

    public double powerInKilowatt(int enginePowerHorsePower) {
        return enginePowerHorsePower * 0.74;
    }

    public void loadTruck(int truck) {
        if (truck <= carryingCapacityTons) {
            System.out.println("The truck is loaded.");
        } else {
            System.out.println("You need a larger truck.");
        }
    }

    public String TransportSubspeciesTerrestrialFreightInfo() {
        return "Freight  " + super.TransportTypeTerrestrialInfo() +
                " carrying Capacity Tons=" + carryingCapacityTons +'\n'+
                " Kw= " + powerInKilowatt(enginePowerHorsePower) +'\n'+
                " ";
    }

}
