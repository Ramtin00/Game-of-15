import javax.swing.*;

public class GameLogic {
    static int clickY;
    static int clickX;
    static int smileyY;
    static int smileyX;
    static MyButton smiley;
    static MyButton clickedButton;

    //Method to check where blank/smiley is located in grid.
    public static boolean checkSmiley(MyButton clickedButton, MyButton smiley) {
        clickY = clickedButton.getYY();
        clickX = clickedButton.getXX();
        smileyY = smiley.getYY();
        smileyX = smiley.getXX();
        GameLogic.smiley = smiley;
        GameLogic.clickedButton = clickedButton;

        if (clickY == smileyY) {
            if (clickX == smileyX + 1 || clickX == smileyX - 1) {
                buttonSwitch();
                return true;
            }
        } else if (clickX == smileyX) {
            if (clickY == smileyY - 1 || clickY == smileyY + 1) {
                buttonSwitch();
                return true;
            }
        }
        return false;
    }
    //Method to switch blank with moved number.
    private static void buttonSwitch() {

        smiley.setYY(clickY);
        smiley.setXX(clickX);

        clickedButton.setYY(smileyY);
        clickedButton.setXX(smileyX);
        GamePanel.buttonArray[clickY][clickX] = smiley;
        GamePanel.buttonArray[smileyY][smileyX] = clickedButton;
        GamePanel.updatePanel();
    }
    //Method to calculate if winning formation or not.
    public boolean calcWin() {
    int count = 1;
        for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == 3 && j == 3){
                        break;
                    }
                    if (!GamePanel.buttonArray[i][j].getText().equals(String.valueOf(count))) {
                        return false;
                    } count++;
                }
            }
        JOptionPane.showMessageDialog(null, "Grattis - du är ett ägg!");
        return true;
    }
}

