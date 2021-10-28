import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {
    public static MyButton[][] buttonArray;
    public static JPanel centerPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JButton newGame = new JButton("New Game");

    //Creation of gamepanels.
    public JPanel createPanel(MyButton[][] buttonArray) {
        GamePanel.buttonArray = buttonArray;
        mainPanel.setLayout(new BorderLayout());
        northPanel.setBackground(Color.blue);
        northPanel.add(newGame);
        newGame.addActionListener(this);
        centerPanel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 4; i++) {

            centerPanel.add(buttonArray[i][0]);

            for (int j = 0; j < 4; j++) {
                centerPanel.add(buttonArray[i][j]);
            }

        }
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.SOUTH);
        return mainPanel;
    }
    //Method which handles updates after button switch.
    public static void updatePanel() {
        GameLogic test = new GameLogic();

        centerPanel.removeAll();
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                centerPanel.add(buttonArray[i][j]);
            }
        }
        centerPanel.revalidate();
        centerPanel.repaint();
        test.calcWin();
    }

    //NewGame-ButtonRefresh.
    @Override
    public void actionPerformed(ActionEvent e) {

        Buttons refresh = new Buttons();
        buttonArray = refresh.buttonArray();
        centerPanel.removeAll();
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                centerPanel.add(buttonArray[i][j]);
            }
        }
        centerPanel.revalidate();
        centerPanel.repaint();
    }
}
