package Lecture_24.src.dz.Programmers;


import Lecture_24.src.dz.ProgrammerLevel;

public abstract class Programmer {
    private final String name;
    private final int experience;
    private final ProgrammerLevel programmerLevel;
    private final int salary;


    public Programmer(String name, int experience, ProgrammerLevel programmerLevel, int salary){
        this.name = name;
        this.experience = experience;
        this.programmerLevel = programmerLevel;
        this.salary = salary;
    }

    public Programmer(Programmer oldProgrammer, int additionalAmountOfMoney){
        this.name = oldProgrammer.name;
        this.experience = oldProgrammer.experience;
        this.programmerLevel = oldProgrammer.programmerLevel;
        this.salary = oldProgrammer.salary + additionalAmountOfMoney;
    }

    public Programmer(Programmer oldProgrammer, ProgrammerLevel newProgrammerLevel){
        this.name = oldProgrammer.name;
        this.experience = oldProgrammer.experience;
        this.programmerLevel = newProgrammerLevel;
        this.salary = oldProgrammer.salary;
    }

    public ProgrammerLevel getProgrammerLevel() {
        return programmerLevel;
    }

    public abstract void work();


    @Override
    public String toString() {
        return "Info about Employee: \n" +
                "Name: " + name +
                " Level: " + programmerLevel +
                " Experience in years: " + experience +
                " Salary: " + salary +". \n";
    }
}
