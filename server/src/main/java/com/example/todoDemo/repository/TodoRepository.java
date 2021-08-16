package com.example.todoDemo.repository;

import com.example.todoDemo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    Todo findByTitle(String title);
}
