package Lecture_29.src.Task1_Chain.WithoutInterface;

import Lecture_29.src.Task1_Chain.WithInterface.AreaHandler;

public abstract class TriangleChain implements Area{

    private TriangleChain nextTriangleChain;

    public TriangleChain(TriangleChain nextTriangleChain) {
        this.nextTriangleChain = nextTriangleChain;
    }

    public double getArea(Triangle triangle){
        if(satisfyConditions(triangle)){
            System.out.println("Трикутник визначено, це: "+ getTriangleType());
            return calc(triangle);

        } else if(nextTriangleChain != null){
            return nextTriangleChain.getArea(triangle);
        } else
            throw new IllegalArgumentException("Площа не була визначена");
    }

    abstract boolean satisfyConditions(Triangle triangle);

    abstract String getTriangleType();

}
