package Lecture_29.src.Task1_Chain.WithoutInterface;

public class RightTriangle extends Triangle{
    public RightTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC, Type.RIGHT);
    }

    @Override
    public void calculateArea() {
        double result = (sideA*sideB)/2.0;
        System.out.println("Area of right triangle is: " + result);
    }
}
