package org.kata_taskmanager;

import org.junit.jupiter.api.Test;

public class Test_TaskManager {

    @Test
    public void test_parseUserInput_ADD_TASK() {
        // Arrange
        String actionUserInput = "+ description";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.ADD_TASK;
    }

    @Test
    public void test_parseUserInput_REMOVE_TASK() {
        // Arrange
        String actionUserInput = "- 1";

        // Act
        Action action = Parser.parseUserInput(actionUserInput);

        // Assert
        assert action == Action.REMOVE_TASK;
    }

}
