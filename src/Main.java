import javax.swing.*;
import java.awt.*;
import java.awt.Panel;

public class Main {

    public static void main(String[] args) {

        //Create buttons
        Buttons button = new Buttons();
        JButton[][] buttonArray = button.buttonArray();


        //Create panel, add buttons
        NewPanel panel = new NewPanel();
        JPanel mainPanel = panel.createPanel(buttonArray);

        //Create JFrame, add panel
        Frame frame = new Frame(mainPanel);






        /*JFrame newFrame = new JFrame();

        JPanel newPanel = new JPanel();
        JButton buttonNew = new JButton("Hi");

        newPanel.setLayout(new GridLayout(4, 4));
        newPanel.add(buttonNew, 0);
        System.out.println(newPanel.getComponentCount());
        */

    }
}
