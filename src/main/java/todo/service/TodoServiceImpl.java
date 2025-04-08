package todo.service;

import java.util.Collection;

import todo.entity.TodoEntity;
import todo.repository.TodoRepositoryImpl;
import todo.util.InputUtil;

public class TodoServiceImpl implements TodeService {

    private TodoRepositoryImpl todoRepository = new TodoRepositoryImpl();

    @Override
    public void showTodo() {
        Collection<TodoEntity> todo = this.todoRepository.getAll();

        int iteration = 1;

        System.out.println("TODO: ");

        for (TodoEntity data : todo) {
            System.out.println(iteration + ". " + data.getTodo());
            iteration++;
        }

    }

    @Override
    public void addTodo() {
        String data = InputUtil.input("masukkan data (x untuk batal)");

        if (!data.equals("x") && !data.equals("X")) {
            System.out.println("masuk");
            this.todoRepository.add(new TodoEntity(data));
        }
    }

    @Override
    public void removeTodo() {
        String data = InputUtil.input("masukkan nomor yang dihapus (x untuk batal)");

        if (!data.equals("x") && !data.equals("X")) {
            System.out.println("masuk");

            int index = Integer.parseInt(data);
            String respon = this.todoRepository.remove(index);
            System.out.println(respon);
        }
    }

}
