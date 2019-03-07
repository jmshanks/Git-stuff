@@ -0,0 +1,54 @@
package com.company;

public class App {

    public static void main(String[] args) {

        // Feet
        Feet feet = new Feet() {

            @Override
            public double maxSpeed() {
                return 6.68;
            }
        };

        feet.distance(1320);

        feet.printStats();


        // Bicycle
        Bicycle bicycle = new Bicycle() {


            @Override
            public double maxSpeed() {
                return 25;
            }
        };

        bicycle.numberOfGears = 12;
        bicycle.numberOfTires = 2;
        bicycle.distance(1320);

        bicycle.printStats();


        // Car
        Car car = new Car() {
            @Override
            public double maxSpeed() {
                return 85;
            }
        };
        car.engineType = "NA-V8";
        car.numberOfDoors = 2;
        car.numberOfTires = 4;
        car.distance(1320);

        car.printStats();


    }
}
