package com.company;

abstract class Feet extends Transport {

    public Feet() {

    }

    void printStats() {

        System.out.println("Feet: \n" +
                "Max Speed: " + this.maxSpeed() + " mph." + "\n" +
                "Time in ¼ Mile: " + time() + " seconds." + "\n");


    }

    public double time() {
        double distance = 1320;
        return distance / maxSpeed();
    }


}
