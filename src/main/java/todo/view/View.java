package todo.view;

import todo.service.TodoServiceImpl;
import todo.util.InputUtil;

public class View {

    private TodoServiceImpl TodoServiceImpl = new TodoServiceImpl();

    public void showMenu() {

        while (true) {
            System.out.println("TODO LIST MENU");
            System.out.println("1. Menampilkan Todo");
            System.out.println("2. Menambah Todo");
            System.out.println("3. menghapus Todo");

            String option = InputUtil.input("Masukkan pilihan (x untuk keluar)");

            System.out.println("");

            if (option.equals("x") && option.equals("x")) {
                break;
            }

            switch (option) {
                case "1":
                    this.showTodo();
                    break;
                case "2":
                    this.addTodo();
                    break;
                case "3":
                    this.removeTodo();
                    break;
            }
        }
    }

    void showTodo() {
        this.TodoServiceImpl.showTodo();
    }

    void addTodo() {
        this.TodoServiceImpl.addTodo();
    }

    void removeTodo() {
        this.TodoServiceImpl.removeTodo();
    }

}
