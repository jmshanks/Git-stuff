package com.company;



public class App {

    public static void main(String[] args) {

        // Feet
        Feet feet = new Feet() {

        };

        feet.distance();

        feet.printStats();


        // Bicycle
        Bicycle bicycle = new Bicycle() {

        };

        bicycle.numberOfGears = 12;
        bicycle.numberOfTires = 2;
        bicycle.distance();
        bicycle.printStats();


        // Car
        Car car = new Car() {
        };

        car.engineType = "NA-V8";
        car.numberOfDoors = 2;
        car.numberOfTires = 4;
        car.distance();

        car.printStats();


    }
}
