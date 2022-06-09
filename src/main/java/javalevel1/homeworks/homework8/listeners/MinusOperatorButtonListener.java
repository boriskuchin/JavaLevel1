package javalevel1.homeworks.homework8.listeners;

import javalevel1.homeworks.homework8.CalculatorApplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinusOperatorButtonListener implements ActionListener {

    CalculatorApplication calculatorApplication;

    public MinusOperatorButtonListener(CalculatorApplication calculatorApplication) {
        this.calculatorApplication = calculatorApplication;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (calculatorApplication.getDisplayTextField().getText().equals("")) {
            calculatorApplication.setDisplayTextField("-");
        } else {
            calculatorApplication.setFirstOperand(Integer.parseInt(calculatorApplication.getDisplayTextField().getText()));
            JButton btn = (JButton) actionEvent.getSource();
            calculatorApplication.setOperator(btn.getText());
            calculatorApplication.setDisplayTextField("");
        }
    }
}
