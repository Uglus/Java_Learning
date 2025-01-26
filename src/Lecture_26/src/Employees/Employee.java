package Lecture_26.src.Employees;

import Lecture_26.src.Task;
import Lecture_26.src.TaskHandler;
import Lecture_26.src.TaskProgressCallback;

public abstract class Employee implements TaskHandler {

    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;


    protected Employee(TaskProgressCallback callback, String name, Task.Status taskStatus) {
        this.callback = callback;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    public boolean doTask(Task task) {
        boolean canHandle = taskStatus == task.getStatus();
        if(canHandle) {
            System.out.println(getClass().getSimpleName() + " " + name +
                    " is doing task " + getDetails(task));
            callback.updateTask(getTaskWhenDone(task));
        }
        return canHandle;
    }

    public boolean canHandleTask(Task task) {
        return taskStatus == task.getStatus();
    }

    protected abstract String getDetails(Task task);

    protected abstract Task getTaskWhenDone(Task task);

    public Task.Status getTaskStatus() {
        return taskStatus;
    }

}
