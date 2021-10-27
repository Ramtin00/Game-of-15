import javax.swing.*;
import java.awt.*;

public class NewPanel extends JPanel {

    JPanel mainPanel = new JPanel();
    JPanel northPanel = new JPanel();
   public static JPanel centerPanel = new JPanel();

    JButton newGame = new JButton("New Game");

    public static MyButton[][] buttonArray;

    public JPanel createPanel(MyButton[][] buttonArray) {
        NewPanel.buttonArray = buttonArray;

        northPanel.setBackground(Color.blue);
        northPanel.setPreferredSize(new Dimension(500, 100));
        northPanel.add(newGame);

//        centerPanel.setBackground(Color.lightGray);
        centerPanel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 4; i++) {

            centerPanel.add(buttonArray[i][0]);

            for (int j = 0; j < 4; j++) {
                centerPanel.add(buttonArray[i][j]);
            }

        }


        mainPanel.add(centerPanel, BorderLayout.CENTER);
        centerPanel.revalidate();
        centerPanel.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
        return mainPanel;
    }
    public static void updatePanel (){

        centerPanel.removeAll();
        for (int i = 0; i < 4; i++) {

            centerPanel.add(buttonArray[i][0]);

            for (int j = 0; j < 4; j++) {
                centerPanel.add(buttonArray[i][j]);
            }

        }
        centerPanel.revalidate();
        centerPanel.repaint();
    }

}
