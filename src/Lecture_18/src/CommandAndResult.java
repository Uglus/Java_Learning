package Lecture_18.src;

public class CommandAndResult {

    final public String fieldCommand;
    final public String filedResult;

    public CommandAndResult(String command, String result){
        this.fieldCommand = command;
        this.filedResult = result;
        System.out.println("command: "+fieldCommand+", result: "+filedResult);
    }

}
