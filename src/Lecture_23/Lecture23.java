package Lecture_23;

import Base.Lecture;
import Lecture_23.src.FigureFactory;
import Lecture_23.src.Figures.Figure;


public class Lecture23 extends Lecture {


    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();
        print(
                figureFactory.create(2),
                figureFactory.create(5, 6, 5, 6),
                figureFactory.create(3, 4, 5)
        );
    }

    private static void print(Figure... figures){
        for (Figure figure : figures) {
            print(figure.toString());
        }
    }

}
