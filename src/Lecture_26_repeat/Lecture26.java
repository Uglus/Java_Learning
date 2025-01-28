package Lecture_26_repeat;

import javax.swing.*;

public class Lecture26 {

    public static void main(String[] args) {
        Log log = new Log.Local();
        DataCallback dataCallback = new DataCallback.Base(log);
        Executor executor = new Executor();
        executor.execute(dataCallback);
    }

}
