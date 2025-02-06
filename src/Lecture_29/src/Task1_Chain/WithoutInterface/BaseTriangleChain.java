package Lecture_29.src.Task1_Chain.WithoutInterface;

public class BaseTriangleChain extends TriangleChain{

    @Override
    public boolean isSatisfyCondition(Triangle triangle) {
        return triangle.getSideA() > 0 && triangle.getSideB() > 0 &&
                triangle.getSideC() > 0 &&
                triangle.getSideA() + triangle.getSideB() >
                        triangle.getSideC() &&
                triangle.getSideA() + triangle.getSideC() >
                        triangle.getSideB() &&
                triangle.getSideC() + triangle.getSideB() >
                        triangle.getSideA();
    }

    @Override
    public String getTriangleType() {
        return "Простий трикутник";
    }

    @Override
    public double calc(Triangle triangle) {
        int half = (triangle.getSideA() + triangle.getSideB() +
                triangle.getSideC()) / 2;
        return Math.sqrt(half * (half - triangle.getSideA()) * (half
                - triangle.getSideB()) * (half - triangle.getSideC()));
    }
}
