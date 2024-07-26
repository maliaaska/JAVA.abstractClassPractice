package com.milewskiarkadiuszmodul12abstractTasks;

import java.util.Objects;

public class Engine {
//    public static void main (String[] args) {
//
//    }

   private String type;
   private FuelType fuel;
   public Engine() {};

   public Engine (String type, FuelType fuel) {
       this.type = type;
       this.fuel = fuel;
   }

   public void getDescription() {
       System.out.println("This is very old engine, " + "and it's type is " + type + " and to use it you need " + fuel + " type of gasoline"  );
   }

   public void start() {
       System.out.println("The vehicle is starting");
   }

   public void turnOff() {
       System.out.println("The engine turns off");
   }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine engine)) return false;
        return Objects.equals(getType(), engine.getType()) && getFuel() == engine.getFuel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getFuel());
    }
}
