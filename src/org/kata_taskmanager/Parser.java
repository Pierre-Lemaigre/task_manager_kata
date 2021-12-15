package org.kata_taskmanager;

import java.lang.reflect.Array;

public class Parser {

    public static ActionString parseUserInput(String userInput) throws InvalidUserInputException{

        String[] userInputSplited = userInput.split(" ");

         Action action = switch (userInputSplited[0]) {
            case "+" -> Action.ADD_TASK;
            case "-" -> Action.REMOVE_TASK;
            case "x" -> Action.MARK_AS_DONE;
            case "o" -> Action.MARK_AS_TODO;
            case "q" -> Action.EXIT;
            default -> throw new InvalidUserInputException(userInput);
        };

        return new ActionString(action, userInputSplited.length > 1 ? userInputSplited[1] : null);
    }

}
