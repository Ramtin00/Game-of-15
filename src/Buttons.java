import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Buttons {

    JButton[][] buttonArray = new JButton[4][4];

    ArrayList<JButton> buttonsList = new ArrayList<>();

    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");
    JButton button11 = new JButton("11");
    JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");
    JButton button14 = new JButton("14");
    JButton button15 = new JButton("15");
    JButton blank = new JButton(":)");

    public JButton[][] buttonArray() {

        button1.setName("1");
        buttonsList.add(button1);
        button1.setName("2");
        buttonsList.add(button2);
        button1.setName("3");
        buttonsList.add(button3);
        button1.setName("4");
        buttonsList.add(button4);
        button1.setName("5");
        buttonsList.add(button5);
        button1.setName("6");
        buttonsList.add(button6);
        button1.setName("7");
        buttonsList.add(button7);
        button1.setName("8");
        buttonsList.add(button8);
        button1.setName("9");
        buttonsList.add(button9);
        button1.setName("10");
        buttonsList.add(button10);
        button1.setName("11");
        buttonsList.add(button11);
        button1.setName("12");
        buttonsList.add(button12);
        button1.setName("13");
        buttonsList.add(button13);
        button1.setName("14");
        buttonsList.add(button14);
        button1.setName("15");
        buttonsList.add(button15);
        button1.setName("blank");
        buttonsList.add(blank);


        Collections.shuffle(buttonsList);

        int count1 = 0; int count2 = 0;

        for (JButton button : buttonsList) {

            if (count2 == 4) {
                count2 = 0;
                count1++;
            }
            buttonArray[count1][count2] = button;
            count2++;
        }
        return buttonArray;
    }


}


