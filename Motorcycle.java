package com.milewskiarkadiuszmodul12abstractTasks;

import java.util.Objects;

public class Motorcycle extends Engine implements PoweredVehicle {

    private String make;
    private String name;
    private boolean isSportBike;
    private double consumption;

    private Engine engine;

    //Zaimplementuj konstruktor dla klasy Car, inicjalizujący pola specyficzne dla samochodu i pole engine.
    public Motorcycle (String make, String name, boolean isSportBike, double consumption, Engine engine) {
        this.make = make;
        this.name = name;
        this.isSportBike = isSportBike;
        this.consumption = consumption;
        this.engine = engine;
    }



    //Dodaj dodatkowy konstruktor, który oprócz parametrów z klasy Motorcycle, przyjmuje też parametry z klasy Engine i tworzy obiekt silnika, przypisując go do pola engine.
    public Motorcycle(String type, FuelType fuel, String make, String name, boolean isSportBike, double consumption, String engineType, FuelType fuelType){
        super( engineType, fuelType);
        this.make = make;
        this.name = name;
        this.isSportBike = isSportBike;
        this.consumption = consumption;
        //TODO Dodaj dodatkowy konstruktor, który oprócz parametrów z klasy Motorcycle, przyjmuje też parametry z klasy Engine i tworzy obiekt silnika, przypisując go do pola engine.
    }

    public boolean petrolCheck(Engine engine) {
        if (engine.getFuel().equals(FuelType.PETROL)) {
            System.out.println("This is the quickest Motorcycle.");
        }
        return true;
    }

    public boolean SportBike(boolean isSportBike) {
        if (!isSportBike) {
            System.out.println("The motorcycle is not sportive.");
        }
        System.out.println("The is very sporting bike");
        return true;

    }

    @Override
    public void start() {
        System.out.println("The motocycle turns on an engine.");
    }

    @Override
    public void turnOff() {
        System.out.println("The motocycle stops running");
    }

    @Override
    public void drive() {
        System.out.println("the Moto drives very fast. ");
    }

    @Override
    public void stop() {
        System.out.println("The motocycle stops rapidly.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle that)) return false;
        if (!super.equals(o)) return false;
        return isSportBike == that.isSportBike && Double.compare(consumption, that.consumption) == 0 && Objects.equals(make, that.make) && Objects.equals(name, that.name) && Objects.equals(engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), make, name, isSportBike, consumption, engine);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", isSportBike=" + isSportBike +
                ", consumption=" + consumption +
                ", engine=" + engine +
                "} " + super.toString();
    }
}
