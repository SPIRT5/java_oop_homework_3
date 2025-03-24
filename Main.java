import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.println("5. Удалить дела по ключевому слову");
            System.out.print("Ваш выбор: ");

            String input = scanner.nextLine();

            switch (input) {
                case "0":
                    System.out.println("Программа завершена!");
                    scanner.close();
                    return;
                case "1":
                    System.out.print("Введите название задачи: ");
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                    break;
                case "2":
                    todoList.showTodos();
                    break;
                case "3":
                    System.out.print("Введите номер для удаления: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine());
                        todoList.remove(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: введите корректное число.");
                    }
                    break;
                case "4":
                    System.out.print("Введите задачу для удаления: ");
                    String task = scanner.nextLine();
                    todoList.remove(task);
                    break;
                case "5":
                    System.out.print("Введите ключевое слово для удаления: ");
                    String keyword = scanner.nextLine();
                    todoList.removeByKeyword(keyword);
                    break;
                default:
                    System.out.println("Ошибка: такой операции нет.");
            }
        }
    }
}