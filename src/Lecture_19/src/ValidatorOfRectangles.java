package Lecture_19.src;

public class ValidatorOfRectangles {

    public static boolean isRectangle(int sideA, int sideB, int sideC, int sideD) {
        return sideA == sideC && sideB == sideD ||
                sideA == sideB && sideC == sideD ||
                sideA == sideD && sideB == sideC;
    }



}
