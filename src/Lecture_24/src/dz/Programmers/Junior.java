package Lecture_24.src.dz.Programmers;

import Lecture_24.src.dz.ProgrammerLevel;

public class Junior  extends  Programmer{

    public Junior(String name, int experience, int salary) {
        super(name, experience, ProgrammerLevel.JUNIOR, salary);
    }

    public Junior(Junior junior, int additionalAmountOfMoney) {
        super(junior,additionalAmountOfMoney);
    }


    @Override
    public void work() {
        System.out.println("Working as junior...");
    }
}
