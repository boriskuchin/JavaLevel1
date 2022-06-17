package javalevel1.homeworks.homework8.components;

import javax.swing.*;
import java.awt.*;

public class MyJButton extends JButton {

    public MyJButton(String title) {
        super();
        this.setFont(new Font("Arial", Font.PLAIN, 40));
        this.setText(String.valueOf(title));
    }
}
