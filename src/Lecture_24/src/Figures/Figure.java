package Lecture_24.src.Figures;

public abstract class Figure {

    private final FigureType type;
    protected final double[] sides;

    public Figure(double[] sides, FigureType type) {
        this.sides = sides;
        this.type = type;
    }

    public abstract double getArea();

    public double getPerimeter() {
        double result = 0;
        for (double side : sides) {
            result += side;
        }
        return result;
    }

    public FigureType getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Info about figure: Type-");
        result.append(type).append(", Sides-");
        for (double side : sides) {
            result.append(side).append(" ");
        }
        result.append(", Perimeter-").append(getPerimeter());
        result.append(", Area-").append(getArea());
        result.append("\n");
        return result.toString();
    }


}
