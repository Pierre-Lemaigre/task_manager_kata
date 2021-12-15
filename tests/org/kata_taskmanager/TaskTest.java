package org.kata_taskmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void testCreationTaskID() {
        String description = "Add SQL";
        Task task = new Task(description);
        assertEquals(task.getId(), 1);

        Task task1 = new Task(description);
        assertEquals(task1.getId(), 2);
    }
}
