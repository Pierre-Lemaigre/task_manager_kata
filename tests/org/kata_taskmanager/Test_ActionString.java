package org.kata_taskmanager;

import org.junit.jupiter.api.Test;

public class Test_ActionString {

    @Test
    public void test_ActionString_constructor(){
        // Arrange
        Action action = Action.ADD_TASK;
        String string = "description";

        // Act
        ActionString actionString = new ActionString(action, string);

        // Assert
        assert actionString.getAction() == action;
        assert actionString.getString().equals(string);
    }

}
