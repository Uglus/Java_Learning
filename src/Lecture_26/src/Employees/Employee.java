package Lecture_26.src.Employees;

import Lecture_26.src.Task;
import Lecture_26.src.TaskProgressCallback;

public abstract class Employee {

    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;


    protected Employee(TaskProgressCallback callback, String name, Task.Status taskStatus) {
        this.callback = callback;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    public void doTask(Task task) {
        System.out.println(getClass().getSimpleName() + " " + name +
                " is doing task " + getDetails(task));
        callback.updateTask(getTaskWhenDone(task));
    }

    protected abstract String getDetails(Task task);

    protected abstract Task getTaskWhenDone(Task task);


}
