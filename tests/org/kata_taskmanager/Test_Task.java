package org.kata_taskmanager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test_Task {
    private String description;

    @BeforeAll
    public void init() {
        description = "Add TODO";
    }

    @Test
    public void testCreationTaskID() {
        Task task = new Task(description);
        assertEquals(task.getId(), 1);

        Task task1 = new Task(description);
        assertEquals(task1.getId(), 2);
    }

    @Test
    public void testGetDescription() {
        Task task = new Task(description);
        assertEquals("Add TODO", task.getDescription());
    }

    @Test
    public void updateStatus() {
        Task task = new Task(description);
        task.taskDone();
        assertTrue(task.getStatus());
        task.taskTodo();
        assertFalse(task.getStatus());
    }
}
