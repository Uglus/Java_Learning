package Lecture_29.src.Task1_Chain.WithoutInterface;

public class EqualTriangleChain extends TriangleChain{


    public EqualTriangleChain(double side) {
        super(new EqualTriangleChain(side));
    }

    @Override
    boolean satisfyConditions(Triangle triangle) {
        return false;
    }

    @Override
    String getTriangleType() {
        return "";
    }

    @Override
    public double calc(Triangle triangle) {
        return 0;
    }
}
