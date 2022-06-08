package javalevel1.homeworks.homework8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonLestener implements ActionListener {
    JTextField textField;

    public ClearButtonLestener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        textField.setText("");
    }
}
