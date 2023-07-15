package com.crudoperation.crudoperation.service.impl;

import com.crudoperation.crudoperation.entity.Todo;
import com.crudoperation.crudoperation.repository.TodoRepository;
import com.crudoperation.crudoperation.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;


    @Override
    public List<Todo> getTodos() {
        List<Todo> todos =new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public void SaveorUpdate(Todo todo) {
        todoRepository.save(todo);

    }


    @Override
    public void update(Todo todo, Long id) {
        todoRepository.save(todo);

    }


    @Override
    public void deleteTodo(Long todoId) {
        todoRepository.deleteById(todoId);
    }
}
