package org.kata_taskmanager;

public class Parser {

    public static Action parseUserInput(String userInput) throws InvalidUserInputException{

        return switch (userInput) {
            case "+ description" -> Action.ADD_TASK;
            case "- 1" -> Action.REMOVE_TASK;
            case "x 1" -> Action.DISPLAY_TASK;
            case "q" -> Action.EXIT;
            default -> throw new InvalidUserInputException(userInput);
        };
    }

}
