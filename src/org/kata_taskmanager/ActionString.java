package org.kata_taskmanager;

public class ActionString {

    private Action action;
    private String string;

    public ActionString(Action action, String string) {
        this.action = action;
        this.string = string;
    }

    public Action getAction() {
        return this.action;
    }

    public String getString() {
        return this.string;
    }
}
