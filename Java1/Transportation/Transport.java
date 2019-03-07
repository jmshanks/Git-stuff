package com.company;

public abstract class Transport {

    public abstract double time();

    public abstract double maxSpeed();

    protected int distance() {
        int i = 1320;
        return i;
    }

    void printStats() {

        System.out.println("Max Speed: " + this.maxSpeed() + " mph." + "\n" +
                "Time in ¼ Mile: " + time() + " seconds." + "\n");
    }


}
