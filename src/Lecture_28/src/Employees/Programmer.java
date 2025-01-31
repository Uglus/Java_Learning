package Lecture_28.src.Employees;

import Lecture_28.src.Task.Task;
import Lecture_28.src.Task.TaskProgressCallback;

public class Programmer extends Employee{
    public Programmer(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_TO_DO);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestcase(),
                getBuildLink(task));
    }

    @Override
    protected String getDetails(Task task) {
        return " with task id " + task.getId() +
                " and buildLink " + task.getDesignLink() +
                "\n and testcase " + task.getTestcase();
    }

    private String getBuildLink(Task task) {
        return "https://buildLink.com/id_"+task.getId();
    }

}
