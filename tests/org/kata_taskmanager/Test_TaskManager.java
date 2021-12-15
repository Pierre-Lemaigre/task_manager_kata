package org.kata_taskmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_TaskManager {

    @Test
    public void test_parseUserInput_ADD_TASK() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "+ description";

        // Act
        Action action = Parser.parseUserInput(actionUserInput).getAction();

        // Assert
        assert action == Action.ADD_TASK;
    }

    @Test
    public void test_parseUserInput_REMOVE_TASK() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "- 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput).getAction();

        // Assert
        assert action == Action.REMOVE_TASK;
    }

    @Test
    public void test_parseUserInput_MARK_AS_DONE() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "x 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput).getAction();

        // Assert
        assert action == Action.MARK_AS_DONE;
    }

    @Test
    public void test_parseUserInput_MARK_AS_TODO() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "o 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput).getAction();

        // Assert
        assert action == Action.MARK_AS_TODO;
    }

    @Test
    public void test_parseUserInput_EXIT() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "q";

        // Act
        Action action = Parser.parseUserInput(actionUserInput).getAction();

        // Assert
        assert action == Action.EXIT;
    }

    @Test
    public void test_parseUserInput_InvalidUserInputException() {
        // Arrange
        String actionUserInput = "u";
        String expectedMessage = actionUserInput + " is not a valid user input";

        // Act
        Exception exception = assertThrows(InvalidUserInputException.class, () -> Parser.parseUserInput(actionUserInput));
        String actualMessage = exception.getMessage();

        // Assert
        assertTrue(actualMessage.contains(expectedMessage));
    }


}
