package javaonefinal.people;

public class CommissionEmployee extends Employee {

    public static final double STARTING_RATE = 2.50;
    public static double STARTING_COMMISSION = 0.10;
    static double commissionRate = 0.10;
    static double baseRate = 2.50;


    public CommissionEmployee(int id, int storeId, String name, int age) {
        super(name, id, age, storeId);
        STARTING_RATE();
        STARTING_COMMISSION();
    }


    public CommissionEmployee(double baseRate, double commissionRate, int id , int storeId, String name, int age) {

        super(name, age, id, storeId);
        this.commissionRate = commissionRate;
        this.baseRate = baseRate;

    }

    private static double STARTING_COMMISSION () {
        double commissionRate = STARTING_COMMISSION;
        return commissionRate;
    }

    private static double STARTING_RATE () {
        final double baseRate = STARTING_RATE;
        return baseRate;
    }

    public static double getBaseRate() {
        return baseRate;
    }

    public static double getCommissionRate() {
        return commissionRate;
    }
}
