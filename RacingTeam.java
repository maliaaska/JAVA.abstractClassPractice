package com.milewskiarkadiuszmodul12abstractTasks;

public class RacingTeam implements PoweredVehicle {
    private  PoweredVehicle[] vehicles;

    //Dodaj konstruktor przyjmujący tablicę pojazdów i inicjalizujący pole w klasie.
    public RacingTeam(PoweredVehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public boolean canRace(int distance, double fuelAmount) {
        double totalFuelConsumption = 0.0;
        for ( PoweredVehicle vehicle : vehicles ) {
            totalFuelConsumption += vehicle.getFuelConsumption(distance);
        }
        return totalFuelConsumption <= fuelAmount;
    }

    // Dodatkowa metoda do uruchamiania wszystkich pojazdów w zespole
    public void startAllVehicles() {
        for (PoweredVehicle vehicle : vehicles) {
            vehicle.start();
        }
    }

    // Dodatkowa metoda do włączania alarmu we wszystkich pojazdach w zespole
    public void turnOnAllAlarms() {
        for (PoweredVehicle vehicle : vehicles) {
            if (vehicle instanceof Alarm) {
                ((Alarm) vehicle).turnAlarmOn();
            }
        }
    }

    // Dodatkowa metoda do wyłączania alarmu we wszystkich pojazdach w zespole
    public void turnOffAllAlarms() {
        for (PoweredVehicle vehicle : vehicles) {
            if (vehicle instanceof Alarm) {
                ((Alarm) vehicle).turnAlarmOff();
            }
        }
    }

    public PoweredVehicle[] getVehicle() {
        return vehicles;
    }

    public void setPoweredVehicle(Vehicle[] vehicle) {
        this.vehicles = vehicles;
    }

    @Override
    public void start() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {
    }

}
