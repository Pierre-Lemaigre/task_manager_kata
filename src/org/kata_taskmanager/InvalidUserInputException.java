package org.kata_taskmanager;

public class InvalidUserInputException extends Exception{

    public InvalidUserInputException(String message) {
        super(message + " is not a valid user input");
    }

}
