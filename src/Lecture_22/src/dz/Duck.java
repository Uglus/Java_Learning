package Lecture_22.src.dz;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getType() + " with name " + name + " is moving on the ground with 2 legs.");
    }
}
