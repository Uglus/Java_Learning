package Lecture_26.src;

import Lecture_26.src.Employees.Employee;

public class EmployeeChain implements TaskHandler{

    private final TaskHandler first;
    private final TaskHandler second;


    public EmployeeChain(TaskHandler first,
                         TaskHandler second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean doTask(Task task) {
        boolean result = false;
        result = first.doTask(task);
        if(!result)
            result = second.doTask(task);
        return result;
    }
}
