package Lecture_29.src.Task1_Chain.WithoutInterface;

public abstract class TriangleChain implements Area{

    private TriangleChain next = null;

    public void setNext(TriangleChain chain) {
        next = chain;
    }

    public double getArea(Triangle triangle) {
        if(isSatisfyCondition(triangle)) {
            System.out.println("Тип трикутника визначено " + getTriangleType());
            return calc(triangle);
        } else if(next != null){
            return next.calc(triangle);
        } else {
            throw new IllegalArgumentException("Помилка,неможливо вирахувати площу ");
        }
    }

    public abstract boolean isSatisfyCondition(Triangle triangle);
    public abstract String getTriangleType();


}
