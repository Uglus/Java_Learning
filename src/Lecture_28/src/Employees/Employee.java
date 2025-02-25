package Lecture_28.src.Employees;

import Lecture_28.src.Observer;
import Lecture_28.src.Task.Column;
import Lecture_28.src.Task.Task;
import Lecture_28.src.Task.TaskProgressCallback;

public abstract class Employee implements Observer {
    private final TaskProgressCallback callback;
    private final String name;
    private final Task.Status taskStatus;


    protected Employee(TaskProgressCallback callback, String name, Task.Status taskStatus) {
        this.callback = callback;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    @Override
    public void handleTask(Task task) {
        /*System.out.println(getClass().getSimpleName() + " " +
                name + " is doing task " + getDetails(task));*/
        callback.updateTask(task,getTaskWhenDone(task));
    }

    public final boolean canBeObserverForColumn(Column column) {
        return column.isTaskBelongToColumn(taskStatus);
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected abstract String getDetails(Task task);

}
