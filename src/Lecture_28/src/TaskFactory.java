package Lecture_28.src;

import Lecture_28.src.Employees.Employee;
import Lecture_28.src.Task.Column;
import Lecture_28.src.Task.Task;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {
    private static final int SIZE = 10;
    private final Task[] tasks;
    private final List<Column> columns;

    public TaskFactory() {
        this.tasks = new Task[SIZE];
        for(int i = 0;i<tasks.length;i++){
            tasks[i] = new Task(i, Task.Status.ASSEMBLING_REQUIREMENTS,
                    "description_"+i,"","","");
        }

        columns = new ArrayList<>();
        columns.add(new Column(Task.Status.ASSEMBLING_REQUIREMENTS));
        columns.add(new Column(Task.Status.READY_TO_DO));
        columns.add(new Column(Task.Status.READY_FOR_TESTING));
        columns.add(new Column(Task.Status.DONE));

    }

    //All tasks to designers
    public void initialStart() {
        for (Task task: tasks){
            columns.getFirst().addTask(task);
        }
    }

    public void addEmployeesToColumns(List<Employee> employees) {
        for(Employee employee: employees)
            for(Column column:columns)
                if(employee.canBeObserverForColumn(column))
                    column.registerObserver(employee);
    }

    @NotNull
    public Task getNotFinishedTask(){
        Task result = null;
        for(Task task : tasks){
            if(task.getStatus() != Task.Status.DONE){
                result = task;
                break;
            }
        }

        if(result == null)
            result = tasks[0];

        return result;
    }

    public void updateTask(Task oldTask, Task newTask){
        for(Column column:columns) {
            if (column.isTaskBelongToColumn(oldTask.getStatus()))
                column.removeTask(oldTask);
            if(column.isTaskBelongToColumn(newTask.getStatus()))
                column.addTask(newTask);
        }

    }

}
