package todo.repository;

import java.util.Collection;

import todo.entity.TodoEntity;

public interface TodoRepository {

    Collection<TodoEntity> getAll();

    String add(TodoEntity todo);

    String remove(int index);
}
