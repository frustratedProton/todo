package com.proton.todo.service;

import com.proton.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public Todo addTodo(Todo todo) {
        todo.setId((long) (todos.size() + 1));
        todos.add(todo);
        return todo;
    }

    public Todo updateTodo(Long id, Todo todo) {
        Todo existingTodo = todos.stream().filter(t -> todo.getId().equals(id))
                                            .findFirst()
                                            .orElse(null);
        if (existingTodo != null) {
            existingTodo.setTask(todo.getTask());
            existingTodo.setCompleted(todo.isCompleted());
        }

        return existingTodo;
    }

    public void deleteTodo(Long id) {
        todos.removeIf(todo -> todo.getId().equals(id));
    };
}
