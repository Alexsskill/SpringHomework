package org.example;

import java.util.Scanner;

public class StartMenu {
    private final Repository repository;
    Scanner scanner = new Scanner(System.in);

    public StartMenu(Repository repository) {
        this.repository = repository;
    }

    public void run() {
        while (true) {
            System.out.println("""
                    >>>> Выберите пункт меню <<<<
                    1) Работа с группой
                    2) Работа с преподавателем
                    3) Работа с дисциплиной
                    0) Выход из программы""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> runGroup();
                case 2 -> runTeacher();
                case 3 -> runSubject();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Неправильный выбор");
            }
        }
    }

    private void runGroup() {
        while (true) {
            System.out.println("""
                    >>>> Выберите операцию <<<<
                    1) Создать группу
                    2) Обновить группу
                    3) Удалить группу
                    0) Назад""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> repository.createGroup();
                case 2 -> repository.updateGroup();
                case 3 -> repository.deleteGroup();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Неправильный выбор");
            }
        }
    }

    private void runTeacher() {
        while (true) {
            System.out.println("""
                    >>>> Выберите операцию <<<<
                    1) Создать преподавателя
                    2) Обновить преподавателя
                    3) Удалить преподавателя
                    0) Назад""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> repository.createTeacher();
                case 2 -> repository.updateTeacher();
                case 3 -> repository.deleteTeacher();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Неправильный выбор");
            }
        }
    }

    private void runSubject() {
        while (true) {
            System.out.println("""
                    >>>> Выберите операцию <<<<
                    1) Создать дисциплину
                    2) Обновить дисциплину
                    3) Удалить дисциплину
                    0) Назад""");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> repository.createSubject();
                case 2 -> repository.updateSubject();
                case 3 -> repository.deleteSubject();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Неправильный выбор");
            }
        }
    }
}
