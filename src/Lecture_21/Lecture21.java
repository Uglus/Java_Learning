package Lecture_21;

import Base.Lecture;
import Lecture_21.src.Circle;
import Lecture_21.src.Figure;
import Lecture_21.src.Rectangle;
import Lecture_21.src.Triangle;

public class Lecture21 extends Lecture {

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5,6,5,6);
        figures[2] = new Triangle(3,4,5);

        for(Figure figure : figures){
            print(figure.getInfo());
        }

    }

}
