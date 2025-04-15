import javax.swing.*;
import java.awt.*;

class WindowsMenu implements Menu {
    @Override
    public void render(JMenuBar menuBar) {
        JMenu menu = new JMenu("Windows Menu");
        menu.setForeground(Color.BLUE);
        menu.setFont(new Font("Arial", Font.BOLD, 14));
        menuBar.add(menu);
    }
}