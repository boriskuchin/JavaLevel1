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

          if (calculatorApplication.getIsNewNumber() && (calculatorApplication.getDisplayResultField().getText().equals("") || calculatorApplication.getIsOperatorSet())) {
            calculatorApplication.setDisplayResultField("-");
            calculatorApplication.setIsNewNumber(false);
        } else {
            new OperatorButtonListener(calculatorApplication).actionPerformed(actionEvent);
        }
    }
}