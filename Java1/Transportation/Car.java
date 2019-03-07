package com.company;

class Car extends Transport {

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
                "Number of doors: " + this.numberOfDoors);
                super.printStats();


    }

    public double time() {
        return distance() / maxSpeed();
    }

    @Override
    public double maxSpeed() {
        return 85;
    }


}
