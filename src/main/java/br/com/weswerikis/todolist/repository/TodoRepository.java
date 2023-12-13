package br.com.weswerikis.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.weswerikis.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
