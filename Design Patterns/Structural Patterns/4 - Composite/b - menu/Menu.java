import java.util.*;

class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void display() {
        System.out.println("Menu: " + name);
        for (MenuComponent item : items) {
            item.display();
        }
    }
}
