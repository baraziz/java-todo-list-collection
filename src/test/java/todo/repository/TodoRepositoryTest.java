package todo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import todo.entity.TodoEntity;

public class TodoRepositoryTest {

    @Test
    void getAll() {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        Collection<TodoEntity> todo = new ArrayList<TodoEntity>();

        todo.add(new TodoEntity("Test 1"));

        // test add and getAll
        assertEquals(todoRepository.add(new TodoEntity("Test 1")), (new TodoEntity("Test 1")).toString());
        assertEquals(todoRepository.getAll().toString(), todo.toString());

        // test add and getAll second
        todo.add(new TodoEntity("Test 2"));
        assertEquals(todoRepository.add(new TodoEntity("Test 2")), (new TodoEntity("Test 2")).toString());

        todoRepository.getAll().forEach(data -> System.out.println(data.toString()));
    }

    @Test
    void addTest() {
        TodoRepository todoRepository = new TodoRepositoryImpl();

        assertEquals(todoRepository.add(new TodoEntity("Test 1")), (new TodoEntity("Test 1")).toString());
        assertEquals(todoRepository.add(new TodoEntity("Test 2")), (new TodoEntity("Test 2")).toString());
    }

    @Test
    void removeTest() {
        TodoRepository todoRepository = new TodoRepositoryImpl();
        Collection<TodoEntity> todo = new ArrayList<TodoEntity>();

        assertEquals(
                todoRepository.add(new TodoEntity("Test 1")),
                (new TodoEntity("Test 1")).toString());

        assertEquals(
                todoRepository.add(new TodoEntity("Test 2")),
                (new TodoEntity("Test 2")).toString());

        todo.add(new TodoEntity("Test 1"));
        todo.add(new TodoEntity("Test 2"));

        todo.remove(0);
        todoRepository.remove(0);

        assertEquals(todoRepository.getAll().toString(), todo.toString());

    }
}
