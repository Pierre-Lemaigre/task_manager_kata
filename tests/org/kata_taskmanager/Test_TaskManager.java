package org.kata_taskmanager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.kata_taskmanager.TaskManager.handle;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test_TaskManager {
    private Map<Integer, Task> taskList;
    private String description;
    private ActionString actionString;

    @BeforeAll
    public void init() {
        taskList = new HashMap<>();
        description = "Add SQL";
        actionString = new ActionString(Action.ADD_TASK, description);
    }

    @Test
    public void addTaskCorrectly() {
        handle(actionString, taskList);
        assertEquals(1, taskList.size());
    }

    @Test
    public void deleteTaskCorrectly() {
        taskList.remove(1);
        assertEquals(0, taskList.size());
    }

    @Test
    public void updateStatusCorrectly() {
        handle(actionString, taskList);
        taskList.get(1).taskDone();
        assertTrue(taskList.get(1).getStatus());
        taskList.get(1).taskTodo();
        assertFalse(taskList.get(1).getStatus());
    }
}
