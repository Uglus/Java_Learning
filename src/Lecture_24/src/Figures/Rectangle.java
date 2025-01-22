package Lecture_24.src.Figures;

public class Rectangle extends Figure {
    public Rectangle(double[] sides, FigureType type) {
        super(sides,type);
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
