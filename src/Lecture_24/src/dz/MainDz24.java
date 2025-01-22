package Lecture_24.src.dz;

import Lecture_24.src.dz.Programmers.Programmer;

public class MainDz24 {
    public static void main(String[] args) {
        ProgrammerFactory factory = new ProgrammerFactory();
        Programmer[] programmers = new Programmer[] {
                factory.create("Name1", 3, 3000),
                factory.create("Name2", 2, 2500),
                factory.create("Name3", 1, 2000),
                factory.create("Name4", 3, 3000),
                factory.create("Name5", 2, 2000),
                factory.create("Name6", 1, 1000),
                factory.create("Name7", 3, 3000),
                factory.create("Name8", 2, 1000),
                factory.create("Name9", 1, 600),
                factory.create("Name10", 3, 5000)
        };

        ProgrammersManager programmersManager = new ProgrammersManager(programmers);

        print(programmersManager.toString());
        programmersManager.addSalaryToLevel(ProgrammerLevel.SENIOR, 600);
        programmersManager.addSalaryToLevel(ProgrammerLevel.MIDDLE, 400);

        print(programmersManager.toString());


    }


    private static void print(String text){
        System.out.println(text);
    }



}
