package Lecture_24.src.dz.Programmers;

import Lecture_24.src.dz.ProgrammerLevel;

public class Senior extends Programmer{

    public Senior(String name, int experience, int salary) {
        super(name, experience, ProgrammerLevel.SENIOR, salary);
    }

    public Senior(Senior senior, int additionalAmountOfMoney) {
        super(senior, additionalAmountOfMoney);
    }


    @Override
    public void work() {
        System.out.println("Working as senior...");
    }
}
