class WindowsFactory implements GUIFactory {
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public MenuItem createMenuItem() {
        return new WindowsMenuItem();
    }
}
