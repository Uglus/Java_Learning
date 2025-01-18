package Lecture_18.src.dz;

public class Lesson {

    final int numberOfLesson;
    final boolean isDone;

    public Lesson(int numberOfLesson, boolean isDone){
        this.numberOfLesson = numberOfLesson;
        this.isDone = isDone;
    }

    public Lesson(Lesson oldLesson, boolean isDone){
        this.numberOfLesson = oldLesson.numberOfLesson;
        this.isDone = isDone;
    }

    public void showInfo(){
        System.out.println("Lesson: " + numberOfLesson +"\n" +
                "isDone: " + isDone + "\n");
    }

}
