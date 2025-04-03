package todo.entity;

public class TodoEntity {

    private String todo;

    public TodoEntity(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "{todo : " + todo + "}";
    }

}
