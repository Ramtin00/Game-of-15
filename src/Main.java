import javax.swing.*;
import java.awt.*;
import java.awt.Panel;

public class Main {

    public static void main(String[] args) {

        //Create buttons
        Buttons afoa = new Buttons();
        MyButton[][] buttonArray = afoa.buttonArray();

        //Create panel, add buttons
        NewPanel panel = new NewPanel();
        JPanel mainPanel = panel.createPanel(buttonArray);

        //Create JFrame, add panel
        Frame frame = new Frame(mainPanel);

    }
}