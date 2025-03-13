package com.ducle.springanddocker;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private List<Todo> todos = new ArrayList<>();
    private Long idCounter = 1L;

    @GetMapping
    public List<Todo> getTodos(){
        return this.todos;
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        todo.setId(idCounter++);
        todos.add(todo);
        return todo;
    }

    @DeleteMapping("/{id}")
    public String deleteTodo(@PathVariable Long id){
        todos.removeIf(todo -> todo.getId().equals(id));
        return "Delete todo with id: " + id;
    }

}
