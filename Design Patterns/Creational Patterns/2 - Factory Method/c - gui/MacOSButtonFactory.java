import javax.swing.*;
import java.awt.*;

class MacOSButtonFactory extends ButtonFactory {
    @Override
    public JButton createButton() {
        JButton button = new JButton("MacOS Button");
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        return button;
    }
}