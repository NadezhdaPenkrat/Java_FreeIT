package com.freeit.additianal_abstract_class_task2_transport;

/*
В классе Транспорт есть поля:
- Мощность(в лошадиных силах)
- Максимальная скорость(км/ч)
- Масса (кг)
- Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )

 */
public abstract class Transport {
    int enginePowerHorsePower;
    int maxSpeedKmH;
    int massKg;
    String brandModel;

    public Transport
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel) {
        this.enginePowerHorsePower = enginePowerHorsePower;
        this.maxSpeedKmH = maxSpeedKmH;
        this.massKg = massKg;
        this.brandModel = brandModel;
    }

    public int getEnginePowerHorsePower() {
        return enginePowerHorsePower;
    }

    public void setEnginePowerHorsePower(int enginePowerHorsePower) {
        this.enginePowerHorsePower = enginePowerHorsePower;
    }

    public int getMaxSpeedKmH() {
        return maxSpeedKmH;
    }

    public void setMaxSpeedKmH(int maxSpeedKmH) {
        this.maxSpeedKmH = maxSpeedKmH;
    }

    public int getMassKg() {
        return massKg;
    }

    public void setMassKg(int massKg) {
        this.massKg = massKg;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String TransportInfo() {
        return "Transport{" +'\n' +
                "enginePowerHorsePower=" + enginePowerHorsePower +'\n' +
                " maxSpeedKmH=" + maxSpeedKmH +'\n' +
                " massKg=" + massKg +'\n' +
                " brandModel=" + brandModel +'\n'+
                '}'+'\n';
    }
}
