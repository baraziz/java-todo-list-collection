package todo.entity;

public class TodoEntity {

    private int id;
    private String todo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "TodoEntity [id=" + id + ", todo=" + todo + "]";
    }

}
