package Lecture_26.src.Employees;

import Lecture_26.src.Task;
import Lecture_26.src.TaskProgressCallback;

public class Programmer extends Employee {
    protected Programmer(TaskProgressCallback callback, String name) {
        super(callback, name, Task.Status.READY_TO_DO);
    }


    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestCase(),
                getBuildLinkForTask(task.getId())
        );
    }


    @Override
    protected String getDetails(Task task) {
        return " with task id" + task.getId() +
                " and buildLink" + task.getBuildLink() +
                "\nand testcase" + task.getTestCase();
    }

    private String getBuildLinkForTask(int taskId) {
        return "https://link.com/buildLink_with_id_" + taskId;
    }
}
