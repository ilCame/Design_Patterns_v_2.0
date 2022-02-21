package composite.project;

import composite.ToDoList;

import java.util.List;

public class Project implements ToDoList {
    private String title;
    private List<ToDoList> ToDoList;

    public Project(String title, List<composite.ToDoList> toDoList) {
        this.title = title;
        ToDoList = toDoList;
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder();

        html.append("<h1>")
                .append("\n")
                .append(this.title)
                .append("\n")
                .append("</h1><ul>");

        for (ToDoList toDos:ToDoList) {
            html.append("<li>")
                    .append(toDos.getHtml())
                    .append("</li>")
                    .append("\n");
        }

        html.append("</ul></li></ul>");

        return html.toString();
    }
}
