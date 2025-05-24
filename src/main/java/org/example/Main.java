package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        StartMenu startMenu = new StartMenu(repository);
        startMenu.run();
    }
}