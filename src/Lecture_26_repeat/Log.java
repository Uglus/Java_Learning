package Lecture_26_repeat;

public interface Log {

    void log(String text);

    public class Local implements Log{

        @Override
        public void log(String text) {
            System.out.println(text);
        }
    }

    public class Server implements Log{

        @Override
        public void log(String text) {
            System.out.println("TO SERVER: " + text);
        }
    }



}
