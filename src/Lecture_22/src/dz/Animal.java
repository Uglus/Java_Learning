package Lecture_22.src.dz;

public abstract class Animal {

    public final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void move();

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "This is a " + getType() + " with name " + name+ ".";
    }
}
