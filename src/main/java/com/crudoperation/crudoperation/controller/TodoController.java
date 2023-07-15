package com.crudoperation.crudoperation.controller;

import com.crudoperation.crudoperation.entity.Todo;
import com.crudoperation.crudoperation.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    //creating a get mapping that retrives all the Todos details from the database
    private List<Todo> getTodos(){
        return todoService.getTodos();
    }
    //Creating a get mapping that retrives the detail of specific todos
    @GetMapping("/todo/{id}")
    private Todo getTodosById(Long id){
        return todoService.getTodoById(id);
    }

    @DeleteMapping("/todo/{id}")
    private void deleteTodo(@PathVariable("id") Long id){
        todoService.deleteTodo(id);
    }

    @PostMapping("/todo")
    private Long saveTodo(@RequestBody Todo todo){
        todoService.SaveorUpdate(todo);
        return todo.getId();

//    }

    }
    @PutMapping("/todo")
    private Todo update(@RequestBody Todo todo){
        todoService.SaveorUpdate(todo);
        return todo;

    }



}
