import javax.swing.*;
import java.awt.*;

class WindowsButtonFactory extends ButtonFactory {
    @Override
    public JButton createButton() {
        JButton button = new JButton("Windows Button");
        button.setBackground(Color.LIGHT_GRAY);
        return button;
    }
}