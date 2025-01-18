package Lecture_19.src;

public class Triangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (!isTriangle(sideA, sideB, sideC)) {
            throwNotTriangleBySides(sideA, sideB, sideC);
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC > 0 &&
                sideA + sideB > sideC &&
                sideB + sideC > sideA &&
                sideC + sideA > sideB;
    }

    private void throwNotTriangleBySides(int sideA, int sideB, int sideC) {
        throw new IllegalArgumentException(
                "wrong arguments to create triangle with sides " +
                        sideA + " " + sideB + " " + sideC);
    }


    public boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB ||
                this.sideC * this.sideC + this.sideB * this.sideB == this.sideA * this.sideA;
    }

}
