package Lecture_18.src.dz;

public class Person {

    final String name;
    final String surname;
    final int age;
    final int height;
    final double weight;

    public Person(String name, String surname, int age, int height, double weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void showInfo(){
        System.out.println("Information about this person:\n" +
                "Name: "+ name + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n");
    }


}
