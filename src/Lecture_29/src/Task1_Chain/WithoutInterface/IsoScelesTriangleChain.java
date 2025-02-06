package Lecture_29.src.Task1_Chain.WithoutInterface;

public class IsoScelesTriangleChain extends TriangleChain{

    @Override
    public boolean isSatisfyCondition(Triangle triangle) {
        return triangle.getSideA() == triangle.getSideB() ||
                triangle.getSideB() == triangle.getSideC() ||
                triangle.getSideC() == triangle.getSideA();
    }

    @Override
    public String getTriangleType() {
        return "Рівнобедрений трикутник";
    }

    @Override
    public double calc(Triangle triangle) {
        int base = triangle.getSideA();
        int side = triangle.getSideB();
        if(triangle.getSideA() == triangle.getSideB()){
            base = triangle.getSideC();
            side = triangle.getSideA();
        } else if(triangle.getSideA() == triangle.getSideC()){
            base = triangle.getSideB();
            side = triangle.getSideC();
        }
        double half = 0.5 * base;
        double height = Math.sqrt(side*side-half*half);
        return half*height;
    }
}
