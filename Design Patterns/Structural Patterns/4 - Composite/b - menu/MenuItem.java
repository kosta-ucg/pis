class MenuItem implements MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Item: " + name);
    }
}
