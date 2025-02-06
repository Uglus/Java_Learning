package Lecture_29;

import Base.Lecture;
import Lecture_29.src.Task1_Chain.WithoutInterface.*;

import java.util.ArrayList;
import java.util.List;

public class Lecture29 extends Lecture {

    public static void main(String[] args) {
        task1();
    }

    private static void task1(){
        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle(4, 4, 4));
        triangleList.add(new Triangle(4, 6, 6));
        triangleList.add(new Triangle(3, 4, 5));
        triangleList.add(new Triangle(4, 5, 6));
        triangleList.add(new Triangle(4, 1, 6));

        EquiliteralTriangleChain chain0 = new EquiliteralTriangleChain();
        IsoScelesTriangleChain chain1 = new IsoScelesTriangleChain();
        RightTriangleChain chain2 = new RightTriangleChain();
        BaseTriangleChain chainLast = new BaseTriangleChain();
        chain2.setNext(chainLast);
        chain1.setNext(chain2);
        chain0.setNext(chain1);

        for(Triangle triangle : triangleList)
            System.out.println(chain0.getArea(triangle));
    }

}
