import javax.swing.*;
import java.awt.*;

class WindowsMenuItem implements MenuItem {
    @Override
    public JMenuItem createMenuItem() {
        JMenuItem item = new JMenuItem("Windows Item");
        item.setForeground(Color.BLUE);
        return item;
    }
}
