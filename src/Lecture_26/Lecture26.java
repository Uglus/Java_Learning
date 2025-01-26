package Lecture_26;

import Base.Lecture;
import Lecture_26.src.EmployeeChain;
import Lecture_26.src.Employees.Designer;
import Lecture_26.src.Employees.Programmer;
import Lecture_26.src.Employees.Tester;
import Lecture_26.src.Task;
import Lecture_26.src.TaskFactory;
import Lecture_26.src.TaskProgressCallback;

public class Lecture26 extends Lecture {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new TaskProgressCallback() {
            @Override
            public void updateTask(Task task) {
                factory.updateTask(task);
            }
        };

        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer(callback, "Designer_name"),
                        new Programmer(callback, "Programmer_name")
                ),
                new Tester(callback, "Tester_name")
        );

        while (true)
            if(!chain.doTask(factory.getTask()))
                break;
    }
}
