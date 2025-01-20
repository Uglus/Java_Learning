package Lecture_22.src;

import Lecture_22.src.Validators.ValidatorOfRectangles;

public class Rectangle extends Figure {


    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        super(new double[]{sideA, sideB, sideC, sideD});
        if (!ValidatorOfRectangles.isRectangle(sideA, sideB, sideC, sideD))
            throwNotRectangleBySides();
    }

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this(
                pointA.getDistanceTo(pointB),
                pointB.getDistanceTo(pointC),
                pointC.getDistanceTo(pointD),
                pointD.getDistanceTo(pointA)
        );
    }

    @Override
    protected String getType() {
        return "Прямокутник";
    }

    private void throwNotRectangleBySides() {
        throw new IllegalArgumentException("Cannot create instance of Rectangle with this arguments: " + sides[0] + " " + sides[1] + " " + sides[2] + " " + sides[3]);

    }

    private boolean isSquare() {
        return sides[0] == sides[1] &&
                sides[1] == sides[2] &&
                sides[2] == sides[3];
    }


    public void showSides() {
        System.out.println("SideA: " + sides[0] + "; \n" +
                "SideB: " + sides[1] + "; \n" +
                "SideC: " + sides[2] + "; \n" +
                "SideD: " + sides[3] + "; \n");
    }


    @Override
    public double getArea() {
        double square = 0;
        if (sides[0] != sides[1]) {
            square = sides[0] * sides[1];
        } else {
            square = sides[0] * sides[2];
        }
        return square;
    }
}
