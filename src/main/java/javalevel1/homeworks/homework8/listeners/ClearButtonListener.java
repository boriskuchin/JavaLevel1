package javalevel1.homeworks.homework8.listeners;

import javalevel1.homeworks.homework8.CalculatorApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {
    CalculatorApplication calculatorApplication;

    public ClearButtonListener(CalculatorApplication calculatorApplication) {
        this.calculatorApplication = calculatorApplication;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        calculatorApplication.setDisplayResultField("");
        calculatorApplication.setDisplayFormulaField("");
        calculatorApplication.setFirstOperand(null);
        calculatorApplication.setSecondOperand(null);
        calculatorApplication.setOperator("");
        calculatorApplication.setIsOperatorSet(false);
        calculatorApplication.setIsNewNumber(true);
    }
}
