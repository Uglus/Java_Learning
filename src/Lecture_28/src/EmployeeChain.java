package Lecture_28.src;

import Lecture_28.src.Employees.Employee;
import Lecture_28.src.Task.Task;
import Lecture_28.src.Task.TaskHandler;

public class EmployeeChain implements TaskHandler {
    private final TaskHandler first;
    private final TaskHandler second;


    public EmployeeChain(TaskHandler first, TaskHandler second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean doTask(Task task) {
        boolean result = first.doTask(task);
        if(!result)
            result = second.doTask(task);
        return result;
    }
}
