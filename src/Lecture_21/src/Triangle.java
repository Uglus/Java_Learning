package Lecture_21.src;

import Lecture_21.src.Validators.TriangleValidator;

public class Triangle extends Figure {


    public Triangle(int sideA, int sideB, int sideC) {
        super("Triangle", new double[]{sideA, sideB, sideC});
        if (!TriangleValidator.isTriangle(sideA, sideB, sideC)) {
            throwNotTriangleBySides(sideA, sideB, sideC);
        }
    }

    public Triangle(Point a, Point b, Point c) {
        this(a.getDistanceTo(b), b.getDistanceTo(c), c.getDistanceTo(a));
    }

    /*public String getDescription() {
        return isRightTriangle()
                ? "Прямокутний трикутник зі сторонами: " + sides[0] + " " + sides[1] + " " + sides[2]
                : "Простий трикутник зі сторонами: " + sides[0] + " " + sides[1] + " " + sides[2];
    }*/

    private void throwNotTriangleBySides(int sideA, int sideB, int sideC) {
        throw new IllegalArgumentException(
                "wrong arguments to create triangle with sides " +
                        sideA + " " + sideB + " " + sideC);
    }


    private boolean isRightTriangle() {
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2] ||
                sides[0] * sides[0] + sides[2] * sides[2] == sides[1] * sides[1] ||
                sides[2] * sides[2] + sides[1] * sides[1] == sides[0] * sides[0];
    }

    @Override
    public double getArea() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}
