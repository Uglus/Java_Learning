package Lecture_28.src;

import Lecture_28.src.Employees.Employee;
import Lecture_28.src.Task.Task;

public class EmployeeChain {
    private final Employee employee;
    private EmployeeChain nextEmployeeChain;


    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public void doTask(Task task) {
        if(task.getStatus() == employee.getTaskStatus())
            employee.doTask(task);
        else if (nextEmployeeChain != null)
            nextEmployeeChain.doTask(task);
        else
            throw new IllegalArgumentException("task can`t be handled");
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain) {
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
