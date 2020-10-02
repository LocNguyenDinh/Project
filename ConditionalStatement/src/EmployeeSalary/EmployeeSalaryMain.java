package EmployeeSalary;

import java.util.Scanner;

public class EmployeeSalaryMain {

    public static void main(String[] args) {
        double coefficientsSalary = 1;
        int year = 1;
        Scanner sc = new Scanner(System.in);
        double salary = (coefficientsSalary * 4000000) + (double) (year * 500000);
        do {
            System.out.println("Input CoefficientsSalary: ");
            coefficientsSalary = sc.nextDouble();
            System.out.println("Input year: ");
            year = sc.nextInt();
            if (coefficientsSalary < 1 || year < 0) {
                System.out.println("Enter incorrect, re-enter");
            }
        } while (coefficientsSalary < 1 || year < 0);

        System.out.println("Employee salary = " + salary);

    }
}
