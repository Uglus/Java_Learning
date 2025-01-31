package Lecture_28;

import Base.Lecture;
import Lecture_28.src.Employees.Designer;
import Lecture_28.src.Employees.Employee;
import Lecture_28.src.Employees.Programmer;
import Lecture_28.src.Employees.Tester;
import Lecture_28.src.Task.Task;
import Lecture_28.src.Task.TaskProgressCallback;
import Lecture_28.src.TaskFactory;

import java.util.ArrayList;
import java.util.List;

public class Lecture28 extends Lecture {

    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback taskProgressCallback = new TaskProgressCallback.Base(factory);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Designer(taskProgressCallback, "Name_Designer"));
        employeeList.add(new Programmer(new TaskProgressCallback() {
            @Override
            public void updateTask(Task oldTask, Task newTask) {
                System.out.println("Programmer updateTask");
            }
        }, "Programmer_Name"));
        employeeList.add(new Tester(taskProgressCallback, "Tester_Name"));

        factory.addEmployeesToColumns(employeeList);
        factory.initialStart();

    }

}
