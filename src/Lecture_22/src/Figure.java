package Lecture_22.src;

public abstract class Figure {

    final String type;

    protected final double[] sides;

    protected Figure(double[] sides) {
        this.sides = sides;
        this.type = getType();
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }


    public abstract double getArea();

    @Override
    public String toString() {
        return "\nInfo about figure: \n" +
                "  Type: " + getType() + "\n" +
                "  Perimeter: " + getPerimeter() + "\n" +
                "  Area: " + getArea();
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

}
