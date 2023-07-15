package com.crudoperation.crudoperation.service;

import com.crudoperation.crudoperation.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getTodos();

    Todo getTodoById(Long id);

    void SaveorUpdate(Todo todo);

    void update(Todo todo,Long id);


    void deleteTodo(Long todoId);

}
