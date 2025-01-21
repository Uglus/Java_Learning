package Lecture_23.src.Figures;

import Lecture_23.src.Point;
import Lecture_23.src.Validators.ValidatorOfRectangles;

public class Rectangle extends Figure{


    public Rectangle(double[] sides) {
        super(sides);
        if(!ValidatorOfRectangles.isRectangle(sides[0],sides[1],sides[2],sides[3]) || sides.length != 4 )
            throwInvalidArgumentsForFigure();
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this(new double[] {
                p1.getDistanceTo(p2),
                p2.getDistanceTo(p3),
                p3.getDistanceTo(p4),
                p4.getDistanceTo(p1)
        });
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    double getArea() {
        double square = 0;
        if (sides[0] != sides[1]) {
            square = sides[0] * sides[1];
        } else {
            square = sides[0] * sides[2];
        }
        return square;
    }
}
