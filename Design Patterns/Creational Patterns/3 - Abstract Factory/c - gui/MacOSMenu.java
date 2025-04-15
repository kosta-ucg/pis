import javax.swing.*;
import java.awt.*;

class MacOSMenu implements Menu {
    @Override
    public void render(JMenuBar menuBar) {
        JMenu menu = new JMenu("MacOS Menu");
        menu.setForeground(Color.DARK_GRAY);
        menu.setFont(new Font("San Francisco", Font.BOLD, 14));
        menuBar.add(menu);
    }
}