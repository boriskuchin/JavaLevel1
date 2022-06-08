package javalevel1.homeworks.homework8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitsButtonListener implements ActionListener {

    private JTextField textField;

    public DigitsButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton button = (JButton) actionEvent.getSource();
        textField.setText(textField.getText() + button.getText());
    }
}
