package Lecture_21.src.Validators;

public class ValidatorOfRectangles {

    public static boolean isRectangle(int sideA, int sideB, int sideC, int sideD) {
        return sideA == sideC && sideB == sideD ||
                sideA == sideB && sideC == sideD ||
                sideA == sideD && sideB == sideC;
    }



}
