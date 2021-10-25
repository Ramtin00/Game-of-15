import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(JPanel panel) {
        setTitle("Game of 15");
        add(panel);
        setVisible(true);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

