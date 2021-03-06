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

        if (calculatorApplication.getDisplayResultField().getText().equals("") || calculatorApplication.getDisplayResultField().getText().equals("-")) {
            return;
        }

        if (calculatorApplication.getFirstOperand() == null || calculatorApplication.getOperator().equals("")) {
            calculatorApplication.setFirstOperand(Double.parseDouble(calculatorApplication.getDisplayResultField().getText()));
            JButton btn = (JButton) actionEvent.getSource();
            calculatorApplication.setOperator(btn.getText());
            calculatorApplication.setIsOperatorSet(true);
            calculatorApplication.setIsNewNumber(true);

        } else {
            calculatorApplication.setSecondOperand(Double.parseDouble(calculatorApplication.getDisplayResultField().getText()));

            double result = 0;
            switch (calculatorApplication.getOperator()) {
                case "+":
                    result = calculatorApplication.getFirstOperand() + calculatorApplication.getSecondOperand();
                    break;
                case "-":
                    result = calculatorApplication.getFirstOperand() - calculatorApplication.getSecondOperand();
                    break;
                case "*":
                    result = calculatorApplication.getFirstOperand() * calculatorApplication.getSecondOperand();
                    break;
                case "/":
                    result = calculatorApplication.getFirstOperand() / calculatorApplication.getSecondOperand();
                    break;
            }

            calculatorApplication.setDisplayFormulaField(String.format("%s %s %s = ", calculatorApplication.getFirstOperand(), calculatorApplication.getOperator(), calculatorApplication.getSecondOperand()));


            calculatorApplication.setDisplayResultField(String.valueOf(result));
            calculatorApplication.setFirstOperand(result);

            JButton btn = (JButton) actionEvent.getSource();
            calculatorApplication.setOperator(btn.getText());
            calculatorApplication.setIsNewNumber(true);
            calculatorApplication.setIsOperatorSet(true);
        }

    }
}
