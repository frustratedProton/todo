package com.proton.todo.model;

public class Todo {
    private Long id;
    private String task;
    private boolean completed;

    public Todo() {
    }

    public Todo(Long id, String task, boolean isCompleted) {
        this.id = id;
        this.task = task;
        this.completed = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
