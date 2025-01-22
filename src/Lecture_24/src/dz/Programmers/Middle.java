package Lecture_24.src.dz.Programmers;

import Lecture_24.src.dz.ProgrammerLevel;

public class Middle extends Programmer{

    public Middle(String name, int experience, int salary) {
        super(name, experience, ProgrammerLevel.MIDDLE, salary);
    }

    public Middle(Middle middle, int additionalAmountOfMoney) {
        super(middle, additionalAmountOfMoney);
    }

    @Override
    public void work() {
        System.out.println("Working as middle....");
    }
}
