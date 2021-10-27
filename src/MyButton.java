import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    private int xx;
    private int yy;

    public MyButton(String name) {
        super(name);
        setFont(new Font("Arial", Font.PLAIN, 50));

    }

    public int getXX() {
        return xx;
    }

    public void setXX(int x) {
        this.xx = x;
    }

    public int getYY() {
        return yy;
    }

    public void setYY(int y) {
        this.yy = y;
    }
}
