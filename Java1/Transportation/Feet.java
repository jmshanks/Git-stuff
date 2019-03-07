package com.company;

class Feet extends Transport {

    public Feet() {

    }

    void printStats() {

        System.out.println("Feet:");
        super.printStats();
    }





    public double time() {
         return distance() / maxSpeed();
    }

    @Override
    public double maxSpeed() {
        return 6.68;
    }


}
