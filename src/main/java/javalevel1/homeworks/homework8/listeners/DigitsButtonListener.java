package javalevel1.homeworks.homework8.listeners;

import javalevel1.homeworks.homework8.CalculatorApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitsButtonListener implements ActionListener {

    CalculatorApplication calculatorApplication;


    public DigitsButtonListener(CalculatorApplication calculatorApplication) {
        this.calculatorApplication = calculatorApplication;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton button = (JButton) actionEvent.getSource();
        calculatorApplication.setDisplayTextField(calculatorApplication.getDisplayTextField().getText() + button.getText());
    }
}
