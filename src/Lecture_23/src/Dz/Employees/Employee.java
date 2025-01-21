package Lecture_23.src.Dz.Employees;

public abstract class Employee {

    protected final String name;
    protected final String level;
    protected final int age;
    protected final int experience;
    protected final int salary;
    protected final int amountOfTechnologies;

    Employee(String name, int age, int experience, int salary, int amountOfTechnologies) {
        this.name = name;
        this.level = getLevel();
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.amountOfTechnologies = amountOfTechnologies;
    }

    public void work() {
        System.out.println("Working as " + level);
    }

    public String getLevel(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Info about Employee: \n" +
                "Name: " + name +
                " Level: " + level +
                " Age: " + age +
                " Experience in years: " + experience +
                " Salary: " + salary +
                " Amount of technologies: " + amountOfTechnologies + ". \n";
    }
}
