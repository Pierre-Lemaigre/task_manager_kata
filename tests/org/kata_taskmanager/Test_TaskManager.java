package org.kata_taskmanager;

import org.junit.jupiter.api.Test;

public class Test_TaskManager {

    @Test
    public void test_parseUserInput_ADD_TASK() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "+ description";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.ADD_TASK;
    }

    @Test
    public void test_parseUserInput_REMOVE_TASK() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "- 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.REMOVE_TASK;
    }

    @Test
    public void test_parseUserInput_DISPLAY_TASK() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "x 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.DISPLAY_TASK;
    }

    @Test
    public void test_parseUserInput_MARK_AS_DONE() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "o 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.MARK_AS_DONE;
    }

    @Test
    public void test_parseUserInput_EXIT() throws InvalidUserInputException {
        // Arrange
        String actionUserInput = "q";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.EXIT;
    }

}
