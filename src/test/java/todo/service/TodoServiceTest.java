package todo.service;

public class TodoServiceTest {

    private static TodoServiceImpl todoServiceImpl = new TodoServiceImpl();

    public static void main(String[] args) {
        TodoServiceTest.todoServiceImpl.addTodo();
        TodoServiceTest.todoServiceImpl.addTodo();
        TodoServiceTest.todoServiceImpl.addTodo();

        TodoServiceTest.todoServiceImpl.showTodo();

        TodoServiceTest.todoServiceImpl.removeTodo();
        TodoServiceTest.todoServiceImpl.showTodo();

        TodoServiceTest.todoServiceImpl.removeTodo();
        TodoServiceTest.todoServiceImpl.showTodo();
    }
}
