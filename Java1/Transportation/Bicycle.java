package com.company;

abstract class Bicycle extends Transport {

    int numberOfTires;
    int numberOfGears;


    public Bicycle() {
        super();

        numberOfTires = 4;
        numberOfGears = 2;
    }

    void printStats() {

        System.out.println("Bicycle: \n" +
                "Tires: " + this.numberOfTires + "\n" +
                "Gears: " + this.numberOfGears + "\n" +
                "Max Speed: " + this.maxSpeed() + " mph." + "\n" +
                "Time in ¼ Mile: " + time() + " seconds." + "\n");


    }

    public double time() {
        double distance = 1320;
        return distance / maxSpeed();
    }


}
