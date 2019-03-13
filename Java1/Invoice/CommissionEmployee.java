package javaonefinal.people;

public class CommissionEmployee extends Employee {

    public static final double STARTING_RATE = 7.15;
    public static final double STARTING_COMMISSION = 0.075;


    public CommissionEmployee(int id, int storeId, String name, int age) {
        super(name, id, age, storeId);

    }


    public CommissionEmployee(double STARTING_RATE, double STARTING_COMMISSION, int id , int storeId, String name, int age) {

        super(name, age, id, storeId);

    }

    public static double getStartingRate() {
        return STARTING_RATE;
    }

    public static double getStartingCommission() {
        return STARTING_COMMISSION;
    }




    }

