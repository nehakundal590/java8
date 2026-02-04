package com.supplier;


import java.util.function.Supplier;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SupplierObject {
    public static void main(String[] args) {

        Supplier<Employee> empSupplier =
                () -> new Employee(101, "Neha");

        Employee e = empSupplier.get();
        System.out.println(e.id + " " + e.name);
    }
}
