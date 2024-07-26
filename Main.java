package com.milewskiarkadiuszmodul12abstractTasks;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Sedan", FuelType.PETROL, "This is a racing car", "Maluch", 4, 5.25);
//        car.getFuelConsumption(326);
//        System.out.println(car);
//
//
//        Motorcycle motorcycle = new Motorcycle("good", "Kawasaki", true, 4.5, new Engine("This Moto has 2 strokes", FuelType.LPG));
//        System.out.println(motorcycle);
//        Engine engine1 = new Engine("3 strokes", FuelType.PETROL);
//        motorcycle.petrolCheck(engine1);
//
//        PoweredVehicle checkSpeed = new Motorcycle("I think quick", "CBR", true, 2.4, new Engine("3 strokes", FuelType.PETROL));
//        checkSpeed.drive();
        Engine carEngine = new Engine("V8", FuelType.DIESEL);
        Car car1 = new Car("Opel", "Astra", 4, 9.78, carEngine);
        System.out.println(car1);


        Engine motoEngine = new Engine("V2", FuelType.PETROL);
        Motorcycle motorcycle = new Motorcycle("152", "Yamaha", true, 4.5, motoEngine);
        System.out.println(motorcycle);

        Bicycle bicycle = new Bicycle("24", "Giant", 5, true);
        System.out.println(bicycle);

        // Tworzenie tablicy pojazdów
        PoweredVehicle[] vehicles = {car1, motorcycle };

        // Tworzenie obiektu RacingTeam
        RacingTeam team = new RacingTeam(vehicles);

        // Sprawdzanie, czy zespół może pokonać daną trasę z dostępną ilością paliwa
        int distance = 100;
        double fuelAmount = 25.0;
        if (team.canRace(distance, fuelAmount)) {
            System.out.println("The racing team can complete the race.");
        } else {
            System.out.println("The racing team cannot complete the race.");
        }

        // Uruchamianie wszystkich pojazdów w zespole
        team.startAllVehicles();

        // Włączanie alarmu we wszystkich pojazdach w zespole
        team.turnOnAllAlarms();

        // Wyłączanie alarmu we wszystkich pojazdach w zespole
        team.turnOffAllAlarms();
    }


    }

}