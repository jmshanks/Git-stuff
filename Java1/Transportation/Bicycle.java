package com.company;

 class Bicycle extends Transport {

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
                "Gears: " + this.numberOfGears);
                super.printStats();


    }

     public double time() {
         return distance() / maxSpeed();
     }


     @Override
     public double maxSpeed() {
         return 25;
     }


 }
