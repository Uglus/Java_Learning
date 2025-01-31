package Lecture_28.src.Employees;

import Lecture_28.src.Task.Task;
import Lecture_28.src.Task.TaskProgressCallback;

public class Designer extends Employee {


    public Designer(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.ASSEMBLING_REQUIREMENTS);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_TO_DO,
                task.getDescription(),
                getDesignLinkForTask(task.getId()),
                getTestCaseForTask(task.getDescription()),
                "");
    }

    @Override
    protected String getDetails(Task task) {
        return " with taskId " + task.getBuildLink() +
                " and description " + task.getDescription();
    }

    private String getDesignLinkForTask(int taskId) {
        return "https://designlink.com/id_" + taskId;
    }

    private String getTestCaseForTask(String taskDescription) {
        return "*testcase* when " + taskDescription + " get result " + Math.random();
    }


}
