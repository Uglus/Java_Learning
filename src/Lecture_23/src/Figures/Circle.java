package Lecture_23.src.Figures;


import Lecture_23.src.Point;
import Lecture_23.src.Validators.CircleValidator;

public class Circle extends Figure{

    public Circle(double radius) {
        super(new double[] {radius});
        if (!CircleValidator.isCircle(radius))
            throwInvalidArgumentsForFigure();
    }

    public Circle(Point p1, Point p2){
        this(p1.getDistanceTo(p2));
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * sides[0];
    }

    @Override
    public double getArea() {
        return 3.14 * sides[0] * sides[0];
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Info about figure: " + type + " with radius " + sides[0] +
                ", with perimeter " + getPerimeter() + ", with area " + getArea() + ".";

    }
}
