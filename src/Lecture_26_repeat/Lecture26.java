package Lecture_26_repeat;

public class Lecture26 {

    public static void main(String[] args) {
        Log log = new Log.Local();
        DataCallback<DataContainer,ErrorInfo> dataCallback = new DataCallback.Base(log);
        Executor executor = new Executor();
        executor.execute(dataCallback);
    }

}
