import javax.swing.*;
import java.awt.*;
import java.awt.Panel;

public class Main {

    public static void main(String[] args) {

        //Create buttons
        Buttons afoa = new Buttons();
        MyButton[][] buttonArray = afoa.buttonArray();
//        for (JButton[] jButtons : buttonArray) {
//            for (JButton jButton : jButtons) {
//                System.out.println(jButton.getText());
//            }
//        }
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
