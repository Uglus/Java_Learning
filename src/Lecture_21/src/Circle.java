package Lecture_21.src;


import Lecture_21.src.Validators.CircleValidator;

public class Circle extends Figure {

    public Circle(double radius) {
        super("Circle", new double[]{radius});
        if (!CircleValidator.isCircle(radius))
            throwInvalidRadius(radius);
    }

    public Circle(Point pointA, Point pointB) {
        this(pointA.getDistanceTo(pointB));
    }

    private void throwInvalidRadius(double radius) {
        throw new IllegalArgumentException("Неможливо створити коло з таким радіусом - " + sides[0]);
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * sides[0];
    }

    @Override
    public double getArea() {
        return 3.14 * sides[0] * sides[0];
    }
}
