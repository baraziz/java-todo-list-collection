package todo.repository;

import java.util.Collection;

import todo.entity.TodoEntity;

public interface TodoRepository {

    Collection<TodoEntity> getAll();

    String add();

    String remove();
}
