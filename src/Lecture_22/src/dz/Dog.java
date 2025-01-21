package Lecture_22.src.dz;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getType() + " with name " + name + " is moving on the ground with 4 legs.");
    }
}
