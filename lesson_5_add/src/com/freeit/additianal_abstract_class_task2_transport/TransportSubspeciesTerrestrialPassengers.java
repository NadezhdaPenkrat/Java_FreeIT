package com.freeit.additianal_abstract_class_task2_transport;

/*
В классе Легковой добавляются поля:
- Тип кузова
- Кол-во пассажиров

разработать метод описание,
 который будет возвращать составленную строку
 с описанием всех характеристик объекта.
 В строку включить ещё один параметр мощность в киловаттах (кВ) .
Расчёт мощности в киловаттах производится в отдельном методе : 1 л.с = 0.74 кВ

Для легкового разработать метод,
 который будет принимать время и считать
 сколько километров
 проедет машина,
  двигаясь с максимальной скоростью и
  сколько топлива она израсходует за это время,
 результат вывести в консоль,
 расчёт расходуемого топлива вынести в отдельный метод private.

Результат работы метода должен вывести такую строчку:
За время (ваше введённое время) ч, автомобиль (марка автомобиля)
двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
проедет (xxx) км  и израсходует (xxx) литров топлива.

Мой результат выглядит так:
“За время 2,5 часа, автомобиль Audi
двигаясь с максимальной скоростью 230 км/ч
израсходует 46.0 литров топлива”

 */
public class TransportSubspeciesTerrestrialPassengers extends TransportTypeTerrestrial {
    String carcassType;
    int numberOfPassengers;

    public TransportSubspeciesTerrestrialPassengers
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel,
             int numberOfWheels,
             double fuelConsumption,
             String carcassType,
             int numberOfPassengers) {
        super(enginePowerHorsePower, maxSpeedKmH, massKg, brandModel,
                numberOfWheels, fuelConsumption);
        this.carcassType = carcassType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getCarcassType() {
        return carcassType;
    }

    public void setCarcassType(String carcassType) {
        this.carcassType = carcassType;
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

    public void keepingCosts(double timeHours) {
        double distance = getMaxSpeedKmH() * timeHours;
        System.out.println("For " + timeHours +'\n'+
                " car,h " + this.getBrandModel() +'\n'+
                " travelling with the maximum speed " + getMaxSpeedKmH() +'\n'+
                " km,distance" + distance + '\n'+"  km/h will consume  " +'\n'+
                fuelConsumptionCalculate(distance, getFuelConsumption()) +
                " litres of fuel.");
    }

    private double fuelConsumptionCalculate(double distance, double fuelConsumption) {
        return distance * fuelConsumption * 0.01;
    }

    public String TransportSubspeciesTerrestrialPassengersInfo() {
        return "Passengers  " + super.TransportTypeTerrestrialInfo() +
                "  carcass Type =" + carcassType +'\n'+
                " number Of Passengers = " + numberOfPassengers +'\n'+
                " Kw= " + powerInKilowatt(enginePowerHorsePower) +'\n'+
                " ";
    }
}
