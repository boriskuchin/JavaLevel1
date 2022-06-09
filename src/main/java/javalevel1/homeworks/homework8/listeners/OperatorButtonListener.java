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
        if (calculatorApplication.getFirstOperand() == null) {
            calculatorApplication.setFirstOperand(Integer.parseInt(calculatorApplication.getDisplayResultField().getText()));
            JButton btn = (JButton) actionEvent.getSource();
            calculatorApplication.setOperator(btn.getText());
            calculatorApplication.setIsNewNumber(true);
        } else {
            // присвоить второму числу то. что на кране и выполнить вычисления
        }
    }
}
