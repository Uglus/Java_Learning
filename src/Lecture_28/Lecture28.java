package Lecture_28;

import Base.Lecture;
import Lecture_28.src.EmployeeChain;
import Lecture_28.src.Employees.Designer;
import Lecture_28.src.Employees.Programmer;
import Lecture_28.src.Employees.Tester;
import Lecture_28.src.Task.TaskProgressCallback;
import Lecture_28.src.TaskFactory;

public class Lecture28 extends Lecture {

    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback taskProgressCallback = new TaskProgressCallback.Base(factory);

        EmployeeChain chain = new EmployeeChain(new Designer(taskProgressCallback, "Name_Designer"));
        EmployeeChain next = new EmployeeChain(new Programmer(taskProgressCallback, "Programmer_Name"));
        EmployeeChain last = new EmployeeChain(new Tester(taskProgressCallback, "Tester_Name"));
        chain.setNextEmployeeChain(next);
        next.setNextEmployeeChain(last);

        while (true) {
            if (!chain.doTask(factory.getNotFinishedTask()))
                break;
        }

    }

}
