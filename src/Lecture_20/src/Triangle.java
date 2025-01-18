package Lecture_20.src;

import Lecture_20.src.Validators.TriangleValidator;

public class Triangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (!TriangleValidator.isTriangle(sideA, sideB, sideC)) {
            throwNotTriangleBySides(sideA, sideB, sideC);
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(Point a, Point b, Point c) {
        this(a.getDistanceTo(b),b.getDistanceTo(c),c.getDistanceTo(a));
    }

    public String getDescription(){
        return isRightTriangle()
                ? "Прямокутний трикутник зі сторонами: "  + sideA + " " + sideB + " " + sideC
                : "Простий трикутник зі сторонами: " + sideA + " " + sideB + " " + sideC;
    }

    private void throwNotTriangleBySides(int sideA, int sideB, int sideC) {
        throw new IllegalArgumentException(
                "wrong arguments to create triangle with sides " +
                        sideA + " " + sideB + " " + sideC);
    }


    private boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB ||
                this.sideC * this.sideC + this.sideB * this.sideB == this.sideA * this.sideA;
    }

}
