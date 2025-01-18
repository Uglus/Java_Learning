package Lecture_21.src;

public abstract class Figure {

    final String type;

    protected final double[] sides;

    protected Figure(String type, double[] sides){
        this.sides = sides;
        this.type = type;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for(double side : sides){
            perimeter += side;
        }
        return perimeter;
    };

    public abstract double getArea();

    public String getInfo(){
        return "\nInfo about figure: \n" +
                "  Type: "+ type + "\n" +
                "  Perimeter: " + getPerimeter() + "\n" +
                "  Area: " + getArea();

    }

}
