package com.over.quest1;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter designation (Manager, Programmer, Director): ");
            String designation = scanner.nextLine();

            employees[i] = new Employee(name, designation);
        }

        for (Employee employee : employees) {
            System.out.print("Enter basic allowance for " + employee.getDesignation() + ": ");
            double basicAllowance = scanner.nextDouble();

            double bonus = 0;
            if (employee.getDesignation().equalsIgnoreCase("Programmer")) {
                bonus = employee.calcBonus(basicAllowance);
            } else if (employee.getDesignation().equalsIgnoreCase("Manager")) {
                System.out.print("Enter car allowance for Manager: ");
                double carAllowance = scanner.nextDouble();
                bonus = employee.calcBonus(basicAllowance, carAllowance);
            } else if (employee.getDesignation().equalsIgnoreCase("Director")) {
                System.out.print("Enter car allowance for Director: ");
                double carAllowance = scanner.nextDouble();
                System.out.print("Enter housing allowance for Director: ");
                double housingAllowance = scanner.nextDouble();
                bonus = employee.calcBonus(basicAllowance, carAllowance, housingAllowance);
            }

            System.out.println("Bonus for " + employee.getDesignation() + ": " + bonus);
            scanner.nextLine();
        }

        scanner.close();
    }
}


