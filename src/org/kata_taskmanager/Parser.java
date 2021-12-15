package org.kata_taskmanager;

public class Parser {

    public static Action parseUserInput(String userInput) throws InvalidUserInputException{

        String[] userInputSplited = userInput.split(" ");

        return switch (userInputSplited[0]) {
            case "+" -> Action.ADD_TASK;
            case "-" -> Action.REMOVE_TASK;
            case "x" -> Action.MARK_AS_DONE;
            case "o" -> Action.MARK_AS_TODO;
            case "q" -> Action.EXIT;
            default -> throw new InvalidUserInputException(userInput);
        };
    }

}
