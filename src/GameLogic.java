import javax.swing.*;
import java.util.Arrays;

public class GameLogic {
    static int clickY;
    static int clickX;
    static int smileyY;
    static int smileyX;
    static MyButton smiley;
    static MyButton clickedButton;

    public static boolean checkSmiley(MyButton clickedButton, MyButton smiley) {
        clickY = clickedButton.getYY();
        clickX = clickedButton.getXX();
        smileyY = smiley.getYY();
        smileyX = smiley.getXX();
        GameLogic.smiley = smiley;
        GameLogic.clickedButton = clickedButton;

        if (clickY == smileyY) {
            if (clickX == smileyX + 1 || clickX == smileyX - 1) {
                calcCord();
                return true;
            }
        } else if (clickX == smileyX) {
            if (clickY == smileyY - 1 || clickY == smileyY + 1) {
                calcCord();
                return true;
            }
        }
        return false;
    }

    private static void calcCord() {

        smiley.setYY(clickY);
        smiley.setXX(clickX);

        clickedButton.setYY(smileyY);
        clickedButton.setXX(smileyX);
        NewPanel.buttonArray[clickY][clickX] = smiley;
        NewPanel.buttonArray[smileyY][smileyX] = clickedButton;
        NewPanel.updatePanel();
    }

    public boolean calcWin() {
    int count = 1;
        for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == 3 && j == 3){
                        break;
                    }
                    if (!NewPanel.buttonArray[i][j].getText().equals(String.valueOf(count))) {
                        return false;
                    } count++;
                }
            }
        JOptionPane.showMessageDialog(null, "Grattis - du är ett ägg!");
        return true;
    }
}

