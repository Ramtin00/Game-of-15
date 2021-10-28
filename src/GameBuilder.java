import javax.swing.*;

public class GameBuilder {

    void startGame() {

        //Create buttons
        Buttons buttons = new Buttons();
        MyButton[][] buttonArray = buttons.buttonArray();

        //Create panel, add buttons
        GamePanel panel = new GamePanel();
        JPanel mainPanel = panel.createPanel(buttonArray);

        //Create JFrame, add panel
        Frame frame = new Frame(mainPanel);
    }
}
