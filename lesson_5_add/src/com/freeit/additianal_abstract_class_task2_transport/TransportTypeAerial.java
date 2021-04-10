package com.freeit.additianal_abstract_class_task2_transport;

/*
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта

 */
public abstract class TransportTypeAerial extends Transport {
    int wingspanM;
    int minimumRunwayLengthForTakeOff;

    public TransportTypeAerial
            (int enginePowerHorsePower,
             int maxSpeedKmH,
             int massKg,
             String brandModel,

             int wingspanM,
             int minimumRunwayLengthForTakeOff) {
        super(enginePowerHorsePower, maxSpeedKmH, massKg, brandModel);
        this.wingspanM = this.wingspanM;
        this.minimumRunwayLengthForTakeOff=minimumRunwayLengthForTakeOff;
    }

    public int getWingspanM() {
        return wingspanM;
    }

    public void setWingspanM(int wingspanM) {
        this.wingspanM = wingspanM;
    }

    public double getMinimumRunwayLengthForTakeOff() {
        return minimumRunwayLengthForTakeOff;
    }

    public void setMinimumRunwayLengthForTakeOff(int minimumRunwayLengthForTakeOff) {
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    public String TransportTypeAerialInfo() {
        return super.TransportInfo() +
                "wing span ,m = " + wingspanM +'\n'+
                "minimum Runway Length For Take Off ,m = "  + minimumRunwayLengthForTakeOff +'\n' ;


    }
}


