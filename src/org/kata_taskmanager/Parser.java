package org.kata_taskmanager;

public class Parser {

    public static Action parseUserInput(String userInput){

        return switch (userInput) {
            case "+ description" -> Action.ADD_TASK;
            case "- 1" -> Action.REMOVE_TASK;
            default -> Action.EXIT;
        };
    }

}
