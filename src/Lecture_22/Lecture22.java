package Lecture_22;

import Base.Lecture;
import Lecture_22.src.Circle;
import Lecture_22.src.Figure;
import Lecture_22.src.Rectangle;
import Lecture_22.src.Triangle;

public class Lecture22 extends Lecture {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5, 6, 5, 6);
        figures[2] = new Triangle(3, 4, 5);

        for (Figure figure : figures) {
            print(figure.toString());
        }
    }

}
