package HomeWork4.Composite;

import HomeWork4.Composite.filesystem.Directory;
import HomeWork4.Composite.filesystem.File;
import HomeWork4.Composite.filesystem.FileSystemItem;

public class Client {
    public static void main(String[] args) {
        FileSystemItem file1 = new File("report.txt", 100);
        FileSystemItem file2 = new File("photo.jpg", 250);
        FileSystemItem file3 = new File("notes.docx", 50);

        Directory subFolder = new Directory("Документы");
        subFolder.add(file1);
        subFolder.add(file3);

        Directory root = new Directory("Главная папка");
        root.add(subFolder);
        root.add(file2);

        System.out.println("Структура файлов:");
        root.print("");

        System.out.println("\nОбщий размер: " + root.getSize() + " КБ");
    }
}
