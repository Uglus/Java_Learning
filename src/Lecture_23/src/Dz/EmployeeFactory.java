package Lecture_23.src.Dz;

import Lecture_23.src.Dz.Employees.Employee;
import Lecture_23.src.Dz.Employees.Junior;
import Lecture_23.src.Dz.Employees.Middle;
import Lecture_23.src.Dz.Employees.Senior;

public class EmployeeFactory {

    public Employee create(String name, int age, int experience, int salary, int amountOfTechnologies){

        if( (experience>=5 || salary>=3000) && amountOfTechnologies>=10 )
            return new Senior(name,age,experience,salary,amountOfTechnologies);
        else if((experience>=2 || salary>=1500) && amountOfTechnologies<10)
            return new Middle(name,age,experience,salary,amountOfTechnologies);
        else
            return new Junior(name,age,experience,salary,amountOfTechnologies);

    }

}
