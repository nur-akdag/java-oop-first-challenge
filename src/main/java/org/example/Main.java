package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Healthplan healthPlan1 = new Healthplan(1, "X SİGORTA", Plan.BASIC);
        String[] healthPlans = new String[2];
        Employee employee1 = new Employee(1, "Ahmet Başıbüyük", "ahmetb@test.com", "cVth12", healthPlans);
        String[] developers = new String[3];
        Company company1 = new Company(1, "XRT", 5000000, developers);

        employee1.addHealthPlan(0, healthPlan1.getName());
        employee1.addHealthPlan(1, "X SİGORTA");
        employee1.addHealthPlan(5, "A SİGORTA");

        company1.addEmployee(0, employee1.getFullName());
        company1.addEmployee(1, "Jane Doe");
        company1.addEmployee(0, "Ali");
        company1.addEmployee(5, "Veli");

        System.out.println(healthPlan1);
        System.out.println(employee1);
        System.out.println(company1);

    }

}