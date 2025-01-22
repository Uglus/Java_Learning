package Lecture_24.src;

import Lecture_24.src.Figures.*;
import Lecture_24.src.Validators.CircleValidator;
import Lecture_24.src.Validators.TriangleValidator;
import Lecture_24.src.Validators.ValidatorOfRectangles;

public class FigureFactory {

    public Figure create(double... sides) {
        switch (sides.length) {
            case 1:
                return createCircle(sides);
            case 3:
                return createTriangle(sides);
            case 4:
                return createRectangle(sides);

            default: {
                StringBuilder exception = new StringBuilder("Cant create figure");

                if (sides.length == 0) {
                    exception.append(" with no sides.");
                } else {
                    exception.append(" with sides: ");
                    for (double side : sides) {
                        exception.append(side).append(" ");
                    }
                }
                exception.append("\n Please check arguments");

                throw new IllegalArgumentException(exception.toString());
            }
        }
    }


    private Circle createCircle(double[] sides) {
        if (CircleValidator.isCircle(sides[0]))
            return new Circle(sides, FigureType.CIRCLE);
        else
            throw new IllegalArgumentException("Cant create circle with this radius " + sides[0]);
    }

    private Triangle createTriangle(double[] sides) {
        if (TriangleValidator.isTriangle(sides[0], sides[1], sides[2]))
            return new Triangle(sides, FigureType.TRIANGLE);
        else
            throw new IllegalArgumentException("Cant create triangle with this sides ");
    }

    private Rectangle createRectangle(double[] sides) {
        if (ValidatorOfRectangles.isRectangle(sides[0], sides[1], sides[2], sides[3]))
            return new Rectangle(sides, FigureType.RECTANGLE);
        else
            throw new IllegalArgumentException("Cant create rectangle with this sides");
    }

}
