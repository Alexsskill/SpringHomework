package HomeWork4.Composite.filesystem;

public class File implements FileSystemItem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "📄 Файл: " + name + " (" + size + " КБ)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
