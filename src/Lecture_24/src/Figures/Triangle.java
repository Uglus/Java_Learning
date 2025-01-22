package Lecture_24.src.Figures;


public class Triangle extends Figure {

    public Triangle(double[] sides, FigureType type) {
        super(sides, type);
    }

    @Override
    public double getArea() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

}
