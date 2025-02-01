package Lecture_29.src.Task1_Chain.WithoutInterface;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double sideA, double sideC) {
        super(sideA, sideA, sideC, Type.ISOSCELES);
    }


    public void calculateArea() {
        double h = Math.sqrt(Math.pow(sideA,2)-Math.pow(sideC/2.0,2));
        double result = 0.5*sideA*h;
        System.out.println("Area if Isosceles Triangle is: " + result);
    }
}
