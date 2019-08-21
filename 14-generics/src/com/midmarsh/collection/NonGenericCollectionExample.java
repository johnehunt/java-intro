package com.midmarsh.collection;

import java.util.Iterator;
import java.util.List;

public class NonGenericCollectionExample {

    public void printPayslips(List employees) {
        Iterator it = employees.iterator();
        while (it.hasNext()) {
            printPayslip((Employee) it.next());
        }
    }

    private void printPayslip(Employee emp) {
        System.out.println("Payslip: " + emp);
    }

}
