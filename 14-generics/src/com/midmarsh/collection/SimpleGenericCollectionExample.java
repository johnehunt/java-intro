package com.midmarsh.collection;

import java.util.Iterator;
import java.util.List;

public class SimpleGenericCollectionExample {

    public void printPayslips(List<? extends Employee> employees) {
        Iterator<? extends Employee> it = employees.iterator();
        while (it.hasNext()) {
            printPayslip((Employee) it.next());
        }
    }

    private void printPayslip(Employee emp) {
        System.out.println("Payslip: " + emp);
    }

}
