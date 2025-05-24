package org.example;

import java.sql.*;
import java.util.Scanner;

public class Repository {
    private final String url = "jdbc:postgresql://localhost:5432/SpringHomework";
    private final String user = "postgres";
    private final String password = "postgres";

    Scanner scanner = new Scanner(System.in);

    private void createTableTeacher() {
        String sqlQuery = "CREATE TABLE IF NOT EXISTS teachers (\n" +
                "    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,\n" +
                "    name VARCHAR(50) NOT NULL CHECK (TRIM(name) <> ''),\n" +
                "    salary INTEGER NOT NULL CHECK (salary > 0),\n" +
                "    surname VARCHAR(50) NOT NULL CHECK (TRIM(surname) <> '')\n" +
                ");\n";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTableGroup() {
        String sqlQuery = "CREATE TABLE IF NOT EXISTS groups (\n" +
                "    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,\n" +
                "    name VARCHAR(10) NOT NULL UNIQUE CHECK (TRIM(name) <> ''),\n" +
                "    year INTEGER NOT NULL CHECK (year BETWEEN 1 AND 5)\n" +
                ");\n";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTableSubject() {
        String sqlQuery = "CREATE TABLE IF NOT EXISTS subjects (\n" +
                "    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,\n" +
                "    name VARCHAR(100) NOT NULL UNIQUE CHECK (TRIM(name) <> '')\n" +
                ");\n";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createGroup() {
        createTableGroup();
        System.out.print("Введите имя - ");
        String name = scanner.nextLine();
        System.out.print("Введите курс - ");
        int year = scanner.nextInt();
        scanner.nextLine();

        String sqlQuery = "INSERT INTO groups (name, year) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, year);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Группа создана");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateGroup() {
        createTableGroup();
        System.out.print("Введите id - ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Введите имя - ");
        String name = scanner.nextLine();
        System.out.print("Введите курс - ");
        int year = scanner.nextInt();
        scanner.nextLine();

        String sqlQuery = "UPDATE groups SET name = ?, year = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, year);
            preparedStatement.setLong(3, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Группа обновлена");
            } else {
                System.out.println("Группа с таким id не найдена.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteGroup() {
        createTableGroup();
        System.out.print("Введите id - ");
        long id = scanner.nextLong();
        scanner.nextLine();
        String sqlQuery = "DELETE FROM groups WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setLong(1, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Группа удалена");
            } else {
                System.out.println("Группа с таким id не найдена.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTeacher() {
        createTableTeacher();
        System.out.print("Введите имя - ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию - ");
        String surname = scanner.nextLine();
        System.out.print("Введите ставку - ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        String sqlQuery = "INSERT INTO teachers (name, surname, salary) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, salary);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Преподаватель создан");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateTeacher() {
        createTableTeacher();
        System.out.print("Введите id - ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Введите имя - ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию - ");
        String surname = scanner.nextLine();
        System.out.print("Введите ставку - ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        String sqlQuery = "UPDATE teachers SET name = ?, surname = ?, salary = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, salary);
            preparedStatement.setLong(4, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Преподаватель обновлен - ");
            } else {
                System.out.println("Преподаватель с таким id не найден.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteTeacher() {
        createTableTeacher();
        System.out.print("Введите id - ");
        long id = scanner.nextLong();
        scanner.nextLine();
        String sqlQuery = "DELETE FROM teachers WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setLong(1, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Преподаватель удален");
            } else {
                System.out.println("Преподаватель с таким id не найден.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createSubject() {
        createTableSubject();
        System.out.print("Введите имя - ");
        String name = scanner.nextLine();

        String sqlQuery = "INSERT INTO subjects (name) VALUES (?)";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, name);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Дисциплина создана");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateSubject() {
        createTableSubject();
        System.out.print("Введите id - ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Введите имя - ");
        String name = scanner.nextLine();

        String sqlQuery = "UPDATE subjects SET name = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setLong(2, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Дисциплина обновлена");
            } else {
                System.out.println("Дисциплина с таким id не найдена.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteSubject() {
        createTableSubject();
        System.out.print("Введите id - ");
        long id = scanner.nextLong();
        scanner.nextLine();
        String sqlQuery = "DELETE FROM subjects WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setLong(1, id);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Дисциплина удалена");
            } else {
                System.out.println("Дисциплина с таким id не найдена.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
