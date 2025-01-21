package Lecture_23.src.Validators;

public class TriangleValidator {

    public static boolean isTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC > 0 &&
                sideA + sideB > sideC &&
                sideB + sideC > sideA &&
                sideC + sideA > sideB;
    }

}
