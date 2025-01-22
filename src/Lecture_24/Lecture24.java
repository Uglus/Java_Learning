package Lecture_24;

import Base.Lecture;
import Lecture_24.src.FigureFactory;
import Lecture_24.src.Figures.*;

public class Lecture24 extends Lecture {

    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();
        print(
                figureFactory.create(2.0),
                figureFactory.create(5, 6, 5, 6),
                figureFactory.create(3, 4, 5)
        );

        showDescription(figureFactory.create(5, 6, 5, 6));
    }

    private static void print(Figure... figures){
        for (Figure figure : figures) {
            print(figure.toString());
        }
    }

    private static void showDescription(Figure figure) {
        switch (figure.getType()) {
            case FigureType.RECTANGLE -> print("This is Rectangle");
            case FigureType.TRIANGLE -> print("This is Triangle");
            case FigureType.CIRCLE -> print("This is Circle");
            case null, default -> print("Undefined figure");
        }
    }

}
