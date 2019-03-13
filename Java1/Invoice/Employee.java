package javaonefinal.people;

public class Employee extends Person {

    static int id;
    static int storeId;

    public Employee(String name, int age, int id, int storeId) {

        super(name, age);
        this.id = id;
        this.storeId = storeId;

    }

    public static int getId() {
        return id;
    }

    public static int getStoreId() {
        return storeId;
    }


}
