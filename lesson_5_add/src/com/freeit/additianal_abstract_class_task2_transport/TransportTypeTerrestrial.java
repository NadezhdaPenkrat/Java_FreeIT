package com.freeit.additianal_abstract_class_task2_transport;

/*
В классе Наземный добавляются поля:
 -Количество колёс
 - Расход топлива(л/100км)
 */
public abstract class TransportTypeTerrestrial extends Transport {

    int numberOfWheels;
    double fuelConsumption;

    public TransportTypeTerrestrial
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel,

             int numberOfWheels,
             double fuelConsumption) {
        super(enginePowerHorsePower, maxSpeedKmH, massKg, brandModel);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public String TransportTypeTerrestrialInfo() {
        return super.TransportInfo() +
                "number of wheels = " + numberOfWheels +'\n'+
                " fuel consumption, l/100km = " + fuelConsumption +'\n'+
                " ";
    }

}

