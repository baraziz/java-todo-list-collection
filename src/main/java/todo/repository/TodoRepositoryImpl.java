package todo.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import todo.entity.TodoEntity;

public class TodoRepositoryImpl implements TodoRepository {

    private List<TodoEntity> todo = new ArrayList<TodoEntity>();

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
            try {
                this.todo.remove(index - 1);
                return index + " BERHASIL DIHAPUS";
            } catch (Exception e) {
                return index + " GAGAL DIHAPUS: " + e.getMessage();
            }
        } catch (Exception e) {
            return "GAGAL DIHAPUS KARENA: " + e.getMessage();
        }
    }

}
