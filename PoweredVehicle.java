package com.milewskiarkadiuszmodul12abstractTasks;

public interface PoweredVehicle extends Vehicle {
    void start();
    void turnOff();

    //Using a private method in the interface.
    default double getFuelConsumption(int kilometers) {
        return 0;
    }

    static int getHorsePower ( int rpm, int torque) {
        return (rpm * torque) / 5252;
    };

    static boolean isFast( int speed ) {
        if (speed < 50 ) {
            System.out.println("the car is slow");
            return false;
        }
        return true;
    }



    /*TODO
    Utwórz prywatne metody pomocnicze i wykorzystaj je w implementacji metod z interfejsów.
Koniecznie wykorzystaj pole isSportBike i engine.
     */
}
