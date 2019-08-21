package com.midmarsh.collection;

import java.util.ArrayList;
import java.util.List;

public class SampleGenericCollectionTestApp1 {
    public static void main(String [] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        var example = new SimpleGenericCollectionExample();
        example.printPayslips(employeeList);
        List<Manager> managerList = new ArrayList<Manager>();
        example.printPayslips(managerList);
    }

}
