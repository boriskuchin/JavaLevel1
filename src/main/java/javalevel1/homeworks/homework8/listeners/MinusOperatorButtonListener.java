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

        System.out.println("MinusOperatorButtonListener getText -> " + calculatorApplication.getDisplayResultField().getText());

        if (calculatorApplication.getDisplayResultField().getText().equals("")) {
            calculatorApplication.setDisplayResultField("-");
            calculatorApplication.setIsNewNumber(false);

        } else {
            calculatorApplication.setFirstOperand(Integer.parseInt(calculatorApplication.getDisplayResultField().getText()));
            JButton btn = (JButton) actionEvent.getSource();
            calculatorApplication.setOperator(btn.getText());
            calculatorApplication.setIsNewNumber(true);
        }
    }
}
