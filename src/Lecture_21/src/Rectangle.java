package Lecture_21.src;

import Lecture_21.src.Validators.ValidatorOfRectangles;

public class Rectangle extends Figure{


    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        super("Rectangle",new double[]{sideA,sideB,sideC,sideD});
        if (!ValidatorOfRectangles.isRectangle(sideA, sideB, sideC, sideD))
            throwNotRectangleBySides(sideA, sideB, sideC, sideD);
    }

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this (
                pointA.getDistanceTo(pointB),
                pointB.getDistanceTo(pointC),
                pointC.getDistanceTo(pointD),
                pointD.getDistanceTo(pointA)
        );
    }

    /*@Override
    public String getInfo(){
        return isSquare()
                ? "Квадрат зі сторнами довжиною в : " + sides[0] + "см. і площиною в " + getArea() + " см."
                : "Прямокутник зі сторонами: " + sides[0] + " " + sides[1] + " " +
                sides[2] + " " + sides[3]  + " і площиною в " + getArea() + " см.";
    }*/

    private void throwNotRectangleBySides(int sideA, int sideB, int sideC, int sideD) {
        throw new IllegalArgumentException("Cannot create instance of Rectangle with this arguments: " + sideA + " " + sideB + " " + sideC + " " + sideD);

    }

    private boolean isSquare(){
        return sides[0] == sides[1] &&
                sides[1] == sides[2] &&
                sides[2]== sides[3];
    }


    public void show() {
        System.out.println("SideA: " + sides[1] + "; \n" +
                "SideB: " + sides[1] + "; \n" +
                "SideC: " + sides[2] + "; \n" +
                "SideD: " + sides[3] + "; \n");
    }


    @Override
    public double getArea() {
        double square = 0;
        if(sides[0] != sides[1]){
            square = sides[0]*sides[1];
        } else {
            square = sides[0]*sides[2];
        }
        return square;
    }
}
