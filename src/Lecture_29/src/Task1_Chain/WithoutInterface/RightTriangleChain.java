package Lecture_29.src.Task1_Chain.WithoutInterface;

public class RightTriangleChain extends TriangleChain {
    @Override
    public boolean isSatisfyCondition(Triangle t) {
        return t.getSideA() * t.getSideA() + t.getSideB() * t.getSideB() == t.getSideC() ||
                t.getSideB() * t.getSideB() + t.getSideC() * t.getSideC() == t.getSideA() ||
                t.getSideC() * t.getSideC() + t.getSideA() * t.getSideA() == t.getSideB();
    }

    @Override
    public String getTriangleType() {
        return "Прямокутний трикутник";
    }

    @Override
    public double calc(Triangle triangle) {
        int biggest = findMax(triangle.getSideA(),
                triangle.getSideB(), triangle.getSideC());
        double result;
        if (biggest == triangle.getSideA()) {
            result = triangle.getSideB() * triangle.getSideC();
        } else if (biggest == triangle.getSideB()) {
            result = triangle.getSideB() * triangle.getSideA();
        } else {
            result = triangle.getSideA() * triangle.getSideC();
        }
        return 0.5 * result;
    }

    private int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}

