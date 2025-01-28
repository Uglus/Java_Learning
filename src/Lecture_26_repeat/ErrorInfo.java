package Lecture_26_repeat;

public class ErrorInfo implements Failure{
    private final String errorMessage;
    private final String causeMessage;


    public ErrorInfo(String errorMessage, String causeMessage) {
        this.errorMessage = errorMessage;
        this.causeMessage = causeMessage;
    }

    public void log(Log logger){
        logger.log("Message " + errorMessage + " \ncause: " + causeMessage);
    }

}
