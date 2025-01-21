package Lecture_23.src.Dz;

import Lecture_23.src.Dz.Employees.Employee;

public class DZ23 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        EmployeeFactory employeeFactory = new EmployeeFactory();

        employees[0] = employeeFactory.create(
                "Emp1", 25, 3,
                3000,10);
        employees[1] = employeeFactory.create(
                "Emp2", 30, 2,
                1000,8);
        employees[2] = employeeFactory.create(
                "Emp3", 35, 15,
                8000,20);
        employees[3] = employeeFactory.create(
                "Emp4", 19, 0,
                600,2);
        employees[4] = employeeFactory.create(
                "Emp5", 25, 10,
                1299,2);

        for (Employee employee : employees)
            System.out.println(employee);
    }
}
