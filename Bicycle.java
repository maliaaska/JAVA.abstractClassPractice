package com.milewskiarkadiuszmodul12abstractTasks;

import java.util.Objects;

public class Bicycle implements Vehicle, PoweredVehicle {
    private String make;
    private String name;
    private int numbersOfGears;
    private boolean hasBasket;

    public Bicycle(String make, String name, int numbersOfGears, boolean hasBasket) {
        this.make = make;
        this.name = name;
        this.numbersOfGears = numbersOfGears;
        this.hasBasket = hasBasket;

    }

    //Dodaj publiczne metody, np. adjustGears(int newGears) do zmiany liczby biegów i attachBasket() do dołączania koszyka, aby użytkownik mógł dostosować rower do swoich potrzeb.

    public void adjustGears(int newGears) {
        System.out.println("A gear switched to gear " + newGears);
    }

    public void attachBasket() {
        if (!hasBasket) {
            System.out.println("you have a space to attach basket");
        }
        System.out.println("the basket is already attached");
    }


    // Zaimplementuj metody drive() i stop() dla roweru, dostosowując je do specyfiki tego pojazdu.
    @Override
    public void drive() {
        System.out.println("The " + name +  "i s being pedaled");
    }

    @Override
    public void stop() {
        System.out.println("The " + name +  "is stopping.");
    }

    @Override
    public void start() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicycle bicycle)) return false;
        return numbersOfGears == bicycle.numbersOfGears && hasBasket == bicycle.hasBasket && Objects.equals(make, bicycle.make) && Objects.equals(name, bicycle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, name, numbersOfGears, hasBasket);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", numbersOfGears=" + numbersOfGears +
                ", hasBasket=" + hasBasket +
                '}';
    }
}
