package org.kata_taskmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskManager {

    private static Map<Integer, Task> taskList = new HashMap<Integer, Task>();

    public static void main(String[] args) {
        System.out.println("No tasks yet !");
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String s = br.readLine();
                ActionString action = Parser.parseUserInput(s);

                switch(action.getAction()) {
                    case ADD_TASK:
                        Task task = new Task(action.getString());
                        taskList.put(task.getId(), task);
                        break;
                    case DISPLAY_TASK:
                        break;
                    case EXIT:
                        System.out.println("Bye !");
                        System.exit(0);
                        break;
                    case MARK_AS_DONE:
                        taskList.get(Integer.parseInt(action.getString())).taskDone();
                        break;
                    case MARK_AS_TODO:
                        taskList.get(Integer.parseInt(action.getString())).taskTodo();
                        break;
                    case REMOVE_TASK:
                        taskList.remove(Integer.parseInt(action.getString()));
                        break;
                    default:
                        break;
                }

                taskList.values().forEach(task -> System.out.println(task.toString()));
                
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InvalidUserInputException e) {
                e.printStackTrace();
            }
        }
    }

}
