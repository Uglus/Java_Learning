package Lecture_29.src.Task1_Chain.WithoutInterface;

import Lecture_29.src.Task1_Chain.WithInterface.AreaHandler;

public class Triangle {
    protected final double sideA;
    protected final double sideB;
    protected final double sideC;
    protected Type type = Type.SIMPLE;

    public Triangle(double sideA, double sideB, double sideC, Type type) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = type;
    }

    public void calculateArea(){
        double p = (sideA + sideB + sideC) / 2;
        double result = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Area of triangle is: " + result);
    }

    public Type getType() {
        return type;
    }

    public enum Type{
        EQUAL,ISOSCELES, RIGHT,SIMPLE
    }
}
