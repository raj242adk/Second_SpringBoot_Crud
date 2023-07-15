package com.crudoperation.crudoperation.repository;

import com.crudoperation.crudoperation.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {
}
