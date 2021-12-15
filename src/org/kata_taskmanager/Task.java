package org.kata_taskmanager;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private final int id;
    private final String description;
    private boolean status;

    Task(String description) {
        id = nextId.addAndGet(1);
        this.description = description;
        status = false;
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void taskDone() {
        status = true;
    }

    public void taskTodo() {
        status = false;
    }
}
