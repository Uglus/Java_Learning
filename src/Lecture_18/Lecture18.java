package Lecture_18;

import Base.Lecture;
import Lecture_18.src.CommandAndResult;

import java.util.Scanner;

public class Lecture18 extends Lecture {

    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[]{
            new CommandAndResult("/help", ""),
            new CommandAndResult("/start", "Bot started!"),
            new CommandAndResult("/getLocation", "Location in Kyiv"),
            new CommandAndResult("/end", "Bot ended!")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder commands = new StringBuilder("commands available for this bot \n");
        for (CommandAndResult item : COMMAND_AND_RESULTS) {
            commands.append(item.fieldCommand).append("\n");
        }
        COMMAND_AND_RESULTS[0] = new CommandAndResult(COMMAND_AND_RESULTS[0].fieldCommand, commands.toString());

        String input;
        boolean found;
        while (true) {
            input = scanner.nextLine();
            found = false;

            for (int i = 0; i < COMMAND_AND_RESULTS.length; i++) {
                if (COMMAND_AND_RESULTS[i].fieldCommand.equals(input)) {
                    print(COMMAND_AND_RESULTS[i].filedResult);
                    found = true;
                    break;
                }
            }
            if (COMMAND_AND_RESULTS[COMMAND_AND_RESULTS.length - 1].fieldCommand.equals((input))) {
                break;
            }
            if (!found) {
                print("No command found for that input. Try typing " + COMMAND_AND_RESULTS[0].fieldCommand);
            }
        }
    }

}
