package javalevel1.homeworks.homework8.listeners;

import javalevel1.homeworks.homework8.CalculatorApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorButtonListener implements ActionListener {

    CalculatorApplication calculatorApplication;

    public OperatorButtonListener(CalculatorApplication calculatorApplication) {
        this.calculatorApplication = calculatorApplication;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        calculatorApplication.setFirstOperand(Integer.parseInt(calculatorApplication.getDisplayTextField().getText()));
        JButton btn = (JButton) actionEvent.getSource();
        calculatorApplication.setOperator(btn.getText());
        calculatorApplication.setDisplayTextField("");

    }
}
