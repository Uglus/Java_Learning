package Lecture_24.src.dz;

import Lecture_24.src.dz.Programmers.Junior;
import Lecture_24.src.dz.Programmers.Middle;
import Lecture_24.src.dz.Programmers.Programmer;
import Lecture_24.src.dz.Programmers.Senior;

public class ProgrammersManager {

    private final Programmer[] programmers;

    public ProgrammersManager(Programmer[] programmers){
        this.programmers = programmers;
    }

    public void addSalaryToLevel(ProgrammerLevel level, int amountOfBonus) {
        for(int i = 0; i<programmers.length;i++){
            if(programmers[i].getProgrammerLevel() == level){
                programmers[i] = setAdditionalAmountOfMoney(programmers[i], amountOfBonus);
            }
        }
    }

    private Programmer setAdditionalAmountOfMoney(Programmer programmer, int additionalAmountOfMoney){
        if(programmer.getProgrammerLevel() == ProgrammerLevel.SENIOR)
            return new Senior((Senior) programmer, additionalAmountOfMoney);
        else if(programmer.getProgrammerLevel() == ProgrammerLevel.MIDDLE)
            return new Middle((Middle) programmer, additionalAmountOfMoney);
        else
            return new Junior((Junior) programmer, additionalAmountOfMoney);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("List of programmers: ");
        for(Programmer programmer : programmers){
            result.append(programmer.toString());
        }
        return result.toString();
    }

}
