import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(JPanel panel) {
        setTitle("Game of 15");
        add(panel);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

