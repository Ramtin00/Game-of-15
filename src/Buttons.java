import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Buttons implements ActionListener {

    MyButton[][] buttonArray = new MyButton[4][4];

    ArrayList<MyButton> buttonsList = new ArrayList<>();

    MyButton button1 = new MyButton("1");
    MyButton button2 = new MyButton("2");
    MyButton button3 = new MyButton("3");
    MyButton button4 = new MyButton("4");
    MyButton button5 = new MyButton("5");
    MyButton button6 = new MyButton("6");
    MyButton button7 = new MyButton("7");
    MyButton button8 = new MyButton("8");
    MyButton button9 = new MyButton("9");
    MyButton button10 = new MyButton("10");
    MyButton button11 = new MyButton("11");
    MyButton button12 = new MyButton("12");
    MyButton button13 = new MyButton("13");
    MyButton button14 = new MyButton("14");
    MyButton button15 = new MyButton("15");
    MyButton blank = new MyButton(":)");

    public MyButton[][] buttonArray() {


        buttonsList.add(button1);
        buttonsList.add(button2);
        buttonsList.add(button3);
        buttonsList.add(button4);
        buttonsList.add(button5);
        buttonsList.add(button6);
        buttonsList.add(button7);
        buttonsList.add(button8);
        buttonsList.add(button9);
        buttonsList.add(button10);
        buttonsList.add(button11);
        buttonsList.add(button12);
        buttonsList.add(button13);
        buttonsList.add(button14);
        buttonsList.add(button15);


        Collections.shuffle(buttonsList);
        buttonsList.add(blank);

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


    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton) e.getSource();
        boolean canChange = GameLogic.checkSmiley(b, blank);
        if (canChange){
            buttonArray = NewPanel.buttonArray;
        }

    }
}


