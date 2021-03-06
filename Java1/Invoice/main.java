package main

import javaone.invoicestuff.Invoice;
import javaone.invoicestuff.LineItem;
import javaone.people.*;

public class JavaOne {

    public static void main(String[] args) {
        easyMode();
        
        
    }
    
    public static void easyMode() {
        // Create three customers. One will use a default constructor.
        Person customer1 = new Person("Susan Rodriguez", 33);
        Person customer2 = new Person();
        Person customer3 = new Person("Mark Johnson", 67);
        
        //Create 2 employees...
        
        //This one will use a constructor where I give it the base rate and commission
        //                                          Pay,  Comm, ID,  StoreID, Name, Age
        Employee employee2 = new CommissionEmployee(3.00, 0.13, 002, 1, "Chirstie", 42);
        
        //This one will use the default base rate and commission.
        System.out.println("Default Base Commission Pay: " + CommissionEmployee.STARTING_RATE);
        System.out.println("Default Commisison Percent: " + CommissionEmployee.STARTING_COMMISSION);
        //                                          ID, StId, Name, Age
        Employee employee3 = new CommissionEmployee(003, 1, "Carol", 22);
        
        //Create the invoices.
        Invoice invoice1 = new Invoice(customer1, employee2);
        Invoice invoice2 = new Invoice(customer2, employee2);
        Invoice invoice3 = new Invoice(customer3, employee3);
        
        //Create a bunch of line items.
        //                                      ID, Description,      Qty, Price
        LineItem pencilSharpener = new LineItem(2, "Pencil Sharpener", 1, 3.00);
        LineItem pens = new LineItem(3, "Pen", 3, 1.50);
        LineItem notepads = new LineItem(4, "Notepad", 2, 4.00);
        LineItem records = new LineItem(1, "Vinyl Record", 2, 10.00);
        LineItem marbles = new LineItem(5, "Bag of Marbles", 1, 5.00);
        LineItem tuna = new LineItem(6, "Chunk of Tuna", 1, 18.00);
        LineItem moon = new LineItem(7, "1/16 Scale Replica of the Moon", 1, 150000);
        LineItem soda = new LineItem(8, "Generic Brand Soda", 3, 1.50);
        LineItem popcorn = new LineItem(9, "Popcorn", 1, 5.00);
        LineItem twizzlers = new LineItem(10, "Twizzlers, king size", 1, 4.50);
        
        //Printing out all the customers.
        System.out.println("Customers: ");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println("\n\n");
        
        //Printing out all the employees.
        System.out.println("Employees: ");
        System.out.println(employee2);
        System.out.println("");
        System.out.println(employee3);
        System.out.println("\n\n");
        
        //Adding line items to the invoice.
        invoice1.addLineItem(pencilSharpener);
        invoice1.addLineItem(pens);
        invoice1.addLineItem(notepads);
        
        invoice2.addLineItem(records);
        invoice2.addLineItem(marbles);
        invoice2.addLineItem(tuna);
        invoice2.addLineItem(moon);
        
        invoice3.addLineItem(soda);
        invoice3.addLineItem(popcorn);
        invoice3.addLineItem(twizzlers);
        
        //Printing out the invoices.
        System.out.println("Invoices");
        System.out.println("********\n");
        invoice1.print();
        System.out.println("\n");
        
        invoice2.print();
        System.out.println("\n");
        
        invoice3.print();
        System.out.println("\n");
        
        //Printing out total commission earned across all employees.
        // Personally, I add to the totalCommission when I print the invoice. 
        // You can do yours elsewhere, like when adding LineItems (that's actually better)
        // ...but Podbody's Nerfect.
        System.out.println("Total Commission Earned: " + CommissionEmployee.getAllEmployeesTotalCommission());
    }
    
    
    }
}
