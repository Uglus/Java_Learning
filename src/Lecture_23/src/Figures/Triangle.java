package Lecture_23.src.Figures;

import Lecture_23.src.Point;
import Lecture_23.src.Validators.TriangleValidator;

public class Triangle extends Figure {


    public Triangle(double[] sides) {
        super(sides);
        if (!TriangleValidator.isTriangle(sides[0], sides[1], sides[2]) || sides.length != 3)
            throwInvalidArgumentsForFigure();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this(new double[]{
                p1.getDistanceTo(p2),
                p2.getDistanceTo(p3),
                p3.getDistanceTo(p1)}
        );
    }

    @Override
    double getArea() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String getType() {
        return "Triangle";
    }


}
