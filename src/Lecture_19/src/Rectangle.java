package Lecture_19.src;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;


    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        if(!ValidatorOfRectangles.isRectangle(sideA, sideB, sideC, sideD))
            throwNotRectangleBySides(sideA, sideB, sideC, sideD);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    private void throwNotRectangleBySides(int sideA, int sideB, int sideC, int sideD) {
        throw new IllegalArgumentException("Cannot create instance of Rectangle with this arguments: " + sideA + " " + sideB + " " + sideC + " " + sideD);

    }

    public void show(){
        System.out.println("SideA: " + sideA + "; \n" +
                "SideB: " + sideB + "; \n" +
                "SideC: " + sideC + "; \n" +
                "SideD: " + sideD + "; \n" );
    }



}
