package Task_1;

import java.util.ArrayList;

public class Main {
    static ArrayList<Customer>customers= new ArrayList<>();
    public static void main(String[] args) {

        customers.add(new Customer("Solomon","Mwesigwa","GOAT21"));
        customers.add(new Customer("Hamza","Elahi","Hamster01"));
        customers.add(new Customer("Joseph","Pierce","Jo99"));
        customers.add(new Customer("Prim","Morgan","Mor29"));
        customers.add(new Customer("Carl","Waterson","Gum42"));
        customers.add(new Customer("Peter","Griffith","quinjet29"));


        static void printCustomers(){
            for (Customer customer:customers) {
                System.out.println(customer.toString());

            }

        }

        printCustomers();





    }
}