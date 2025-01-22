package Lecture_24.src.dz;

import Lecture_24.src.dz.Programmers.Junior;
import Lecture_24.src.dz.Programmers.Middle;
import Lecture_24.src.dz.Programmers.Programmer;
import Lecture_24.src.dz.Programmers.Senior;

public class ProgrammerFactory {

    public Programmer create(String name, int experience, int salary){
        if(salary >= 3000 && experience>=3) {
            return new Senior(name, experience, salary);
        } else if(salary>=1500 && experience>=2){
            return new Middle(name, experience, salary);
        } else
            return new Junior(name, experience, salary);
    }



}
