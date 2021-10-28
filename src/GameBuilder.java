import javax.swing.*;

public class GameBuilder {

    void startGame() {
        Buttons buttons = new Buttons();
        MyButton[][] buttonArray = buttons.buttonArray();

        //Create panel, add buttons.
        NewPanel panel = new NewPanel();
        JPanel mainPanel = panel.createPanel(buttonArray);

        //Create JFrame, add panel
        Frame frame = new Frame(mainPanel);
    }
}
