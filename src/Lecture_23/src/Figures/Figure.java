package Lecture_23.src.Figures;

public abstract class Figure {

    protected double[] sides;
    final String type;

    public Figure(double[] sides) {
        this.sides = sides;
        this.type = getType();
    }

    abstract double getArea();

    double getPerimeter() {
        double result = 0;
        for (double side : sides) {
            result += side;
        }
        return result;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    protected void throwInvalidArgumentsForFigure() {
        StringBuilder exception = new StringBuilder(
                "Cant create ").append(type)
                .append(" with sides: ");

        for (double side : sides) {
            exception.append(side).append(" ");
        }

        throw new IllegalArgumentException(exception.toString());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Info about figure: " + type + " with sides (");
        for (double side : sides) {
            result.append(" ").append(side);
        }
        result.append(" ), perimeter is ").append(getPerimeter()).append(", area is ").append(getArea());
        return result.toString();
    }
}
