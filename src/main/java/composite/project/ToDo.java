package composite.project;

import composite.ToDoList;

public class ToDo implements ToDoList {

    private String text;

    public ToDo(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        return this.text;
    }
}
