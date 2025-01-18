package Lecture_20;

import Base.Lecture;
import Lecture_20.src.Point;
import Lecture_20.src.Rectangle;
import Lecture_20.src.Triangle;


public class Lecture20 extends Lecture {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0,3),
                new Point(4,0),
                new Point(0,0)
        );
        System.out.println(triangle.getDescription());


        Rectangle rectangle = new Rectangle(
                new Point(0,0),
                new Point(0,2),
                new Point(2,2),
                new Point(2,0)
        );
        System.out.println(rectangle.getDescription());

    }

}
