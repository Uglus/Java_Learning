package Lecture_28.src.Employees;

import Lecture_28.src.Task.Task;
import Lecture_28.src.Task.TaskProgressCallback;

public class Tester extends Employee{
    public Tester(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_FOR_TESTING);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.DONE,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                task.getBuildLink());
    }

    @Override
    protected String getDetails(Task task) {
        return "with id " + task.getId() + "and testcase " + task.getTestcase();
    }
}
