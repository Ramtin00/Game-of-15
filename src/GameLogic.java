import javax.swing.*;

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
        } else if(clickX == smileyX) {
            if (clickY == smileyY - 1 || clickY == smileyY + 1) {
                calcCord();
                return true;
            }
        }
        return false;
    }
    private static void calcCord(){

        smiley.setYY(clickY);
        smiley.setXX(clickX);

        clickedButton.setYY(smileyY);
        clickedButton.setXX(smileyX);
        NewPanel.buttonArray[clickY][clickX] = smiley;
        NewPanel.buttonArray[smileyY][smileyX] = clickedButton;
        NewPanel.updatePanel();
    }
}
