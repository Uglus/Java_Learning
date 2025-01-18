package Lecture_21.src.Validators;

public class TriangleValidator {

    public static boolean isTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC > 0 &&
                sideA + sideB > sideC &&
                sideB + sideC > sideA &&
                sideC + sideA > sideB;
    }

}
