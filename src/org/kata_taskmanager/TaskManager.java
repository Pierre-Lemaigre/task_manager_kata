package org.kata_taskmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {

    private static final Map<Integer, Task> taskList = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("No tasks yet !");
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String s = br.readLine();
                ActionString action = Parser.parseUserInput(s);
                handle(action, taskList);
                taskList.values().forEach(task -> System.out.println(task.toString()));

            } catch (IOException | InvalidUserInputException e) {
                e.printStackTrace();
            }
        }
    }

    public static void handle(ActionString action, Map<Integer, Task> taskList) {
        switch (action.getAction()) {
            case ADD_TASK -> {
                Task task = new Task(action.getString());
                taskList.put(task.getId(), task);
            }
            case EXIT -> {
                System.out.println("Bye !");
                System.exit(0);
            }
            case MARK_AS_DONE -> taskList.get(Integer.parseInt(action.getString())).taskDone();
            case MARK_AS_TODO -> taskList.get(Integer.parseInt(action.getString())).taskTodo();
            case REMOVE_TASK -> taskList.remove(Integer.parseInt(action.getString()));
            default -> {
            }
        }
    }
}
