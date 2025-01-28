package Lecture_26_repeat;

public class Executor {

    public void execute(DataCallback dataCallback){
        try{
            dataCallback.returnSuccess(new DataContainer());
        }catch (Exception e){
            dataCallback.returnError(new ErrorInfo(e.getMessage(), "cause..."));
        }
    }

}
