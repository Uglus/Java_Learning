package Lecture_28.src;

import Lecture_28.src.Employees.Employee;
import Lecture_28.src.Task.Task;

public class EmployeeChain {
    private final Employee employee;
    private EmployeeChain nextEmployeeChain;


    public EmployeeChain(Employee employee) {
        this.employee = employee;
    }

    public boolean doTask(Task task) {
        boolean result = false;
        if(employee.canHandleTask(task)){
            employee.doTask(task);
            result = true;
        }
        else if (nextEmployeeChain != null) {
            result = nextEmployeeChain.doTask(task);
        }
        return result;
    }

    public void setNextEmployeeChain(EmployeeChain nextEmployeeChain) {
        this.nextEmployeeChain = nextEmployeeChain;
    }
}
