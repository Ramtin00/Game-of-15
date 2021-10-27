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

        centerPanel.add(buttonArray[0][0]);
        centerPanel.add(buttonArray[0][1]);
        centerPanel.add(buttonArray[0][2]);
        centerPanel.add(buttonArray[0][3]);
        centerPanel.add(buttonArray[1][0]);
        centerPanel.add(buttonArray[1][1]);
        centerPanel.add(buttonArray[1][2]);
        centerPanel.add(buttonArray[1][3]);
        centerPanel.add(buttonArray[2][0]);
        centerPanel.add(buttonArray[2][1]);
        centerPanel.add(buttonArray[2][2]);
        centerPanel.add(buttonArray[2][3]);
        centerPanel.add(buttonArray[3][0]);
        centerPanel.add(buttonArray[3][1]);
        centerPanel.add(buttonArray[3][2]);
        centerPanel.add(buttonArray[3][3]);


        mainPanel.add(centerPanel, BorderLayout.CENTER);
        centerPanel.revalidate();
        centerPanel.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
        return mainPanel;
    }
    public static void updatePanel (){

        centerPanel.removeAll();
        centerPanel.add(buttonArray[0][0]);
        centerPanel.add(buttonArray[0][1]);
        centerPanel.add(buttonArray[0][2]);
        centerPanel.add(buttonArray[0][3]);
        centerPanel.add(buttonArray[1][0]);
        centerPanel.add(buttonArray[1][1]);
        centerPanel.add(buttonArray[1][2]);
        centerPanel.add(buttonArray[1][3]);
        centerPanel.add(buttonArray[2][0]);
        centerPanel.add(buttonArray[2][1]);
        centerPanel.add(buttonArray[2][2]);
        centerPanel.add(buttonArray[2][3]);
        centerPanel.add(buttonArray[3][0]);
        centerPanel.add(buttonArray[3][1]);
        centerPanel.add(buttonArray[3][2]);
        centerPanel.add(buttonArray[3][3]);
        centerPanel.revalidate();
        centerPanel.repaint();
    }

}
