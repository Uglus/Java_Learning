package Lecture_24.src.Figures;

import Lecture_24.src.Validators.CircleValidator;

public class Circle extends Figure {

    public Circle(double[] sides, FigureType type) {
        super(sides, type);
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
    public String toString() {
        return "Info about figure: " + getType() + " with radius " + sides[0] +
                ", with perimeter " + getPerimeter() + ", with area " + getArea() + ".\n";
    }
}
