import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Buttons implements ActionListener {

    private MyButton[][] buttonArray = new MyButton[4][4];
    ArrayList<MyButton> buttonsList = new ArrayList<>();

    private MyButton blank;
        //Creation of a button array.
        public MyButton[][] buttonArray() {

        for (int i = 1; i < 16 ; i++) {
            buttonsList.add(new MyButton(String.valueOf(i)));
            buttonsList.get(i-1).setName(String.valueOf(i));
        }
        blank = new MyButton(":)");
        buttonsList.add(blank);
        //Collections.shuffle(buttonsList);


        for (MyButton MyButton : buttonsList) {
            MyButton.addActionListener(this);
        }
        int count1 = 0; int count2 = 0;

        for (MyButton button : buttonsList) {

            if (count2 == 4) {
                count2 = 0;
                count1++;
            }
            button.setYY(count1);
            button.setXX(count2);
            buttonArray[count1][count2] = button;
            count2++;
        }
        return buttonArray;
    }

    //Listener for number and "blank"-buttons.
    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton) e.getSource();
        boolean canChange = GameLogic.checkMovable(b, blank);
        if (canChange){
            buttonArray = GamePanel.buttonArray;
        }

    }
}


