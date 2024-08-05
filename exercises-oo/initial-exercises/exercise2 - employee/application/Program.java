package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Tell us the name of the Employee: ");
        employee.name = sc.nextLine();

        System.out.print("Tell us the Gross Salary of the Employee: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tell us the Tax of the Company: ");
        employee.tax = sc.nextDouble();

        System.out.println("Name: " + employee.name);
        System.out.println("Gross Salary: " + employee.grossSalary);
        System.out.println("Tax: " + employee.tax);

        System.out.println(employee.name + " , " + employee.netSalary());

        System.out.print("Tell us the percentage of adicional in Gross Salary of the Employee: ");
        employee.percentage = sc.nextDouble();

        System.out.print(employee.name + " , " + employee.increaseSalary());
    }
}
