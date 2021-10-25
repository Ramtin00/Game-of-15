import javax.swing.*;
import java.awt.*;

public class NewPanel {

    JPanel mainPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    JButton newGame = new JButton("New Game");

    public JPanel createPanel(JButton[][] buttonArray) {

        northPanel.setBackground(Color.blue);
        northPanel.setPreferredSize(new Dimension(500, 100));
        northPanel.add(newGame);

        centerPanel.setBackground(Color.lightGray);
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


        buttonArray[0][0].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[0][1].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[0][2].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[0][3].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[1][0].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[1][1].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[1][2].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[1][3].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[2][0].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[2][1].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[2][2].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[2][3].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[3][0].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[3][1].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[3][2].setFont(new Font("Arial", Font.PLAIN, 50));
        buttonArray[3][3].setFont(new Font("Arial", Font.PLAIN, 50));

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        return mainPanel;
    }

}
