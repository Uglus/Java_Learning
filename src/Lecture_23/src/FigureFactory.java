package Lecture_23.src;

import Lecture_23.src.Figures.Circle;
import Lecture_23.src.Figures.Figure;
import Lecture_23.src.Figures.Rectangle;
import Lecture_23.src.Figures.Triangle;

public class FigureFactory {

    public Figure create(double... sides) {
        switch (sides.length) {
            case 1 : return new Circle(1);
            case 3 : return new Triangle(sides);
            case 4 : return new Rectangle(sides);
            default : {
                StringBuilder exception = new StringBuilder("Cant create figure");

                if(sides.length == 0){
                    exception.append(" with no sides.");
                } else{
                    exception.append(" with sides: ");
                    for (double side : sides) {
                        exception.append(side).append(" ");
                    }
                }
                exception.append("\n Please check arguments");

                throw new IllegalArgumentException(exception.toString());
            }
        }

    }
}
