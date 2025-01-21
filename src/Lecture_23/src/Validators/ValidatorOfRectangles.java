package Lecture_23.src.Validators;

public class ValidatorOfRectangles {

    public static boolean isRectangle(double sideA, double sideB, double sideC, double sideD) {
        return sideA == sideC && sideB == sideD ||
                sideA == sideB && sideC == sideD ||
                sideA == sideD && sideB == sideC;
    }

    public static boolean isRectangle(int sideA, int sideB) {
       //TODO
        return false;
    }

}
