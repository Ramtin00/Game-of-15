import javax.swing.*;
import java.awt.*;

public class NewPanel extends JPanel {

    public static MyButton[][] buttonArray;
    public static JPanel centerPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JButton newGame = new JButton("New Game");

    public JPanel createPanel(MyButton[][] buttonArray) {
        NewPanel.buttonArray = buttonArray;

        northPanel.setBackground(Color.blue);
        northPanel.setPreferredSize(new Dimension(500, 100));
        northPanel.add(newGame);
        centerPanel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 4; i++) {

            centerPanel.add(buttonArray[i][0]);

            for (int j = 0; j < 4; j++) {
                centerPanel.add(buttonArray[i][j]);
            }

        }

        mainPanel.add(centerPanel, BorderLayout.SOUTH);
        centerPanel.revalidate();
        centerPanel.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
        return mainPanel;
    }

    public static void updatePanel() {

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

    /*public void calcWin(){
    boolean win;
    for (int i = 0; i < 4; i++) {
        if (buttonArray[][] = )*/
}

