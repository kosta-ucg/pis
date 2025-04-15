import javax.swing.*;
import java.awt.*;

class MacOSMenuItem implements MenuItem {
    @Override
    public JMenuItem createMenuItem() {
        JMenuItem item = new JMenuItem("MacOS Item");
        item.setForeground(Color.DARK_GRAY);
        return item;
    }
}
