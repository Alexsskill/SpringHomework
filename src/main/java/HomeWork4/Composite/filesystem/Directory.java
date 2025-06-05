package HomeWork4.Composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "📁 Папка: " + name);
        for (FileSystemItem item : items) {
            item.print(indent + "   ");
        }
    }

    @Override
    public int getSize() {
        return items.stream().mapToInt(FileSystemItem::getSize).sum();
    }
}
