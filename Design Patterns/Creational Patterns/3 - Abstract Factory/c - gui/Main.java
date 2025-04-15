import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Odredjivanje OS i odabir fabrike
            GUIFactory factory;
            if (System.getProperty("os.name").contains("Windows")) {
                factory = new WindowsFactory();
            } else {
                factory = new MacOSFactory();
            }

            // Kreiranje UI elemenata koriscenjem Abstract Factory-a
            Menu menu = factory.createMenu();
            MenuItem menuItem = factory.createMenuItem();

            JFrame frame = new JFrame("Abstract Factory GUI Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JMenuBar menuBar = new JMenuBar();
            menu.render(menuBar);

            JMenu firstMenu = menuBar.getMenu(0);
            if (firstMenu != null) {
                firstMenu.add(menuItem.createMenuItem());
            }

            frame.setJMenuBar(menuBar);
            frame.setVisible(true);
        });
    }
}
