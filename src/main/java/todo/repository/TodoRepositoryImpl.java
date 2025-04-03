package todo.repository;

import java.util.ArrayList;
import java.util.Collection;

import todo.entity.TodoEntity;

public class TodoRepositoryImpl implements TodoRepository {

    private Collection<TodoEntity> todo = new ArrayList<TodoEntity>();

    @Override
    public Collection<TodoEntity> getAll() {
        return this.todo;
    }

    @Override
    public String add(TodoEntity todo) {
        this.todo.add(todo);
        return todo.toString();
    }

    @Override
    public String remove(int index) {
        try {
            if (this.todo.remove(index)) {
                return index + " BERHASIL DIHAPUS";
            }
            return index + " GAGAL DIHAPUS";
        } catch (Exception e) {
            return "GAGAL DIHAPUS KARENA: " + e.getMessage();
        }
    }

}
