package Lecture_22.src.dz;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getType() + " with name " + name + " is moving in the water");
    }
}
