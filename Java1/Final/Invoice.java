package javaonefinal.invoicestuff;
import javaonefinal.people.Employee;
import javaonefinal.people.Person;

public class Invoice {

    String[] lineItem = new String [15];
    Object Customer1;
    Object Customer2;
    Object Customer3;
    Object LineItem;

    public Invoice(Person customer1, Employee employee2) {

    }


    public Object getLineItem() {
        return LineItem;
    }

    public Object getCustomer1() {
        return Customer1;
    }

    public Object getCustomer2() {
        return Customer2;
    }
    public Object getCustomer3() {
        return Customer3;
    }


    public void addLineItem(String[] lineItem) {
        this.lineItem = lineItem;
    }

    public void addLineItem(javaonefinal.invoicestuff.LineItem description) {
    }



    public void print() {
        System.out.println();
    }
}
