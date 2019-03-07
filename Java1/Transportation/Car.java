package com.company;

abstract class Car extends Transport {

    String engineType;
    int numberOfDoors;
    int numberOfTires;


    public Car() {
        super();
        engineType = "NA-V8";
        numberOfTires = 4;
        numberOfDoors = 2;

    }

    void printStats() {

        System.out.println("Car: \n" +
                "Engine: " + this.engineType + "\n" +
                "Tires: " + this.numberOfTires + "\n" +
                "Number of doors: " + this.numberOfDoors + "\n" +
                "Max Speed: " + this.maxSpeed() + " mph." + "\n" +
                "Time in ¼ Mile: " + time() + " seconds." + "\n");


    }

    public double time() {
        double distance = 1320;
        return distance / maxSpeed();
    }


}
