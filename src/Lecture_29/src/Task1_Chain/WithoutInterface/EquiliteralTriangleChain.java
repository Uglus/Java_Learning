package Lecture_29.src.Task1_Chain.WithoutInterface;

public class EquiliteralTriangleChain extends TriangleChain{
    @Override
    public boolean isSatisfyCondition(Triangle triangle) {
          return triangle.getSideA() == triangle.getSideB() &&
                  triangle.getSideB() == triangle.getSideC() &&
                  triangle.getSideA() == triangle.getSideC();
    }

    @Override
    public String getTriangleType() {
        return "Рівносторонінй трикутник";
    }

    @Override
    public double calc(Triangle triangle) {
        return triangle.getSideA() * triangle.getSideB() *
                Math.sqrt(3) * 0.25;
    }
}
