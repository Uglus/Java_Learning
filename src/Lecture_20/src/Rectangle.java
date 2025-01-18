package Lecture_20.src;

import Lecture_19.src.ValidatorOfRectangles;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;


    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        if (!ValidatorOfRectangles.isRectangle(sideA, sideB, sideC, sideD))
            throwNotRectangleBySides(sideA, sideB, sideC, sideD);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this (
                pointA.getDistanceTo(pointB),
                pointB.getDistanceTo(pointC),
                pointC.getDistanceTo(pointD),
                pointD.getDistanceTo(pointA)
        );
    }

    public String getDescription(){
        return isSquare()
                ? "Квадрат зі сторнами довжиною в : " + sideA + "см. і площиною в " + getSquare() + " см."
                : "Прямокутник зі сторонами: " + sideA + " " + sideB + " " +
                sideC + " " + sideD  + " і площиною в " + getSquare() + " см.";
    }

    private void throwNotRectangleBySides(int sideA, int sideB, int sideC, int sideD) {
        throw new IllegalArgumentException("Cannot create instance of Rectangle with this arguments: " + sideA + " " + sideB + " " + sideC + " " + sideD);

    }

    private boolean isSquare(){
        return this.sideA == this.sideB &&
                this.sideB == this.sideC &&
                this.sideC == this.sideD;
    }

    private double getSquare(){
        double square = 0;
        if(sideA != sideB){
            square = sideA*sideB;
        } else {
            square = sideA*sideC;
        }
        return square;
    }

    public void show() {
        System.out.println("SideA: " + sideA + "; \n" +
                "SideB: " + sideB + "; \n" +
                "SideC: " + sideC + "; \n" +
                "SideD: " + sideD + "; \n");
    }


}
