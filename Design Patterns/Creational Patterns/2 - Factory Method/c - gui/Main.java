import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Factory Method GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLayout(new FlowLayout());

            ButtonFactory factory;
            if (System.getProperty("os.name").contains("Windows")) {
                factory = new WindowsButtonFactory();
            } else {
                factory = new MacOSButtonFactory();
            }

            // Kreiramo dugme preko Factory Method-a
            JButton button = factory.createButton();
            frame.add(button);

            frame.setVisible(true);
        });
    }
}

/**
 * Lako bismo mogli dodati podršku za Linux, Android, itd.
 * Ako kasnije poželimo da pravimo i menije, moramo dodati novi Factory Method u svaku fabriku.
 * Rešenje? Abstract Factory!
 */