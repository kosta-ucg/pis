public class Main {
    public static void main(String[] args) {
        // Leaf items
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        // File menu
        Menu fileMenu = new Menu("File");
        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(exit);

        // Edit menu
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        Menu editMenu = new Menu("Edit");
        editMenu.add(copy);
        editMenu.add(paste);

        // Main menu
        Menu mainMenu = new Menu("Main");
        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);

        mainMenu.display();
    }
}
