package Lecture_22;

import Base.Lecture;
import Lecture_22.src.Circle;
import Lecture_22.src.Figure;
import Lecture_22.src.Rectangle;
import Lecture_22.src.Triangle;
import Lecture_22.src.dz.Animal;
import Lecture_22.src.dz.Dog;
import Lecture_22.src.dz.Duck;
import Lecture_22.src.dz.Fish;

public class Lecture22 extends Lecture {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5, 6, 5, 6);
        figures[2] = new Triangle(3, 4, 5);

        for (Figure figure : figures) {
            print(figure.toString());
        }
        print("");

        Animal[] animals = new Animal[]{
                new Dog("Dog1"),
                new Duck("Duck1"),
                new Fish("Fish1")
        };

        for (Animal animal : animals){
            print(animal.toString());
            animal.move();
        }

    }

}
