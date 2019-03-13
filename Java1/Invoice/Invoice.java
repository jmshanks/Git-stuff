package javaonefinal.invoicestuff;

import com.sun.source.tree.ReturnTree;
import javaonefinal.people.Employee;
import javaonefinal.people.Person;

import java.util.Arrays;

public class Invoice {

    private String description;
    private int itemId;
    private int quantity;
    private int price;
    private void toString;


    public Invoice(String description, int itemId, int quantity, int price) {
        this.description = description;
        this.itemId = itemId;
        this.quantity = 0;
        this.price = price;
    }

    public Invoice(Object customer1, Object employee2) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void print() {
        String s = toString();
        return toString;
        
    }
}



