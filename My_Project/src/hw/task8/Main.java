package com.itacademy.lesson11.hw.task8;

public class Main {
    public static void main(String[] args) {

        var cl1 = new CustomerList(5);
        printList(cl1);

        try{
            CustomerList cl2 = new CustomerList(cl1.getByCardNo(1,9));
            printList(cl2);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }


        CustomerList cl3 = new CustomerList(cl1.sortListByName());
        printList(cl3);

    }

    public static void printList(CustomerList cl){
        for (Customer customer : cl.getCustomers()) {
            System.out.println(customer.toString());
        }
        System.out.println();
    }

}
