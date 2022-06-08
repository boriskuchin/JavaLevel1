package javalevel1.homeworks.homework8.components;

import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JTextField {

    public MyJTextField() {
        this.setEditable(false);
        this.setFont(new Font("Arial", Font.PLAIN, 40));
    }
}
