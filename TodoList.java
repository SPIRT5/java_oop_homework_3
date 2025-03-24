import java.util.ArrayList;

class TodoList {
    private ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        if (!todoList.contains(todo)) {
            todoList.add(todo);
            System.out.println("Добавлено!");
        } else {
            System.out.println("Такое дело уже есть в списке.");
        }
        showTodos();
    }

    public void remove(int index) {
        if (index >= 1 && index <= todoList.size()) {
            todoList.remove(index - 1);
            System.out.println("Удалено!");
        } else {
            System.out.println("Ошибка: некорректный номер.");
        }
        showTodos();
    }

    public void remove(String todo) {
        if (todoList.contains(todo)) {
            todoList.removeIf(task -> task.equals(todo));
            System.out.println("Удалено!");
        } else {
            System.out.println("Ошибка: дело не найдено.");
        }
        showTodos();
    }

    public void removeByKeyword(String keyword) {
        boolean removed = todoList.removeIf(task -> task.contains(keyword));
        if (removed) {
            System.out.println("Удалены все задачи, содержащие: " + keyword);
        } else {
            System.out.println("Ошибка: не найдено задач с таким ключевым словом.");
        }
        showTodos();
    }

    public void showTodos() {
        if (todoList.isEmpty()) {
            System.out.println("Список дел пуст.");
        } else {
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }
}
