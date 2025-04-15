class MacOSFactory implements GUIFactory {
    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }

    @Override
    public MenuItem createMenuItem() {
        return new MacOSMenuItem();
    }
}