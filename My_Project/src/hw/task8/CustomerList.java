package com.itacademy.lesson11.hw.task8;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    private List<Customer> customers;

    public CustomerList(){
        List<Customer> cl = new ArrayList<>();
        Customer cdefault = new Customer();
        cl.add(cdefault);
    }

    public CustomerList(int n){
        List<Customer> cl = new ArrayList<>();
        for (int i = 0; i < n; i++){
            Customer c = new Customer();
            cl.add(c);
            customers = cl;
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public CustomerList(List<Customer> cl){
        this.customers = cl;
    }

    public void append(Customer c){
        customers.add(c);
    }

    public List<Customer> sortListByName(){
        List<Customer> to_sort = customers;
        int min;
        Customer temp;
        for (int i = 0; i < to_sort.size() - 1; i++) {

            min = i;
            for (int j = i + 1; j < to_sort.size(); j++) {
                if (to_sort.get(j).getSurname().compareTo(to_sort.get(min).getSurname()) < 0) {
                    min = j;
                } else if (to_sort.get(j).getSurname().compareTo(to_sort.get(min).getSurname()) == 0) {
                    if (to_sort.get(j).getName().compareTo(to_sort.get(min).getName()) < 0) {
                        min = j;
                    } else if (to_sort.get(j).getName().compareTo(to_sort.get(min).getName()) == 0){
                        if (to_sort.get(j).getFname().compareTo(to_sort.get(min).getFname()) < 0){
                            min = j;
                        }
                    }
                }
            }
            temp = to_sort.get(i);
            to_sort.set(i, to_sort.get(min));
            to_sort.set(min, temp);
        }
        return to_sort;
    }

    public List<Customer> getByCardNo(int min, int max) {
        List<Customer> bycardno = new ArrayList<>();

        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getCard_no() <= max && customers.get(i).getCard_no() >= min){
                bycardno.add(customers.get(i));
            }
        }
        if(bycardno.size() > 0){
            return bycardno;
        } else {
            throw new RuntimeException("No customers found");
        }
    }


}
