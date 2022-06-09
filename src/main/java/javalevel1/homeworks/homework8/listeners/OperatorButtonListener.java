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
            calculatorApplication.setSecondOperand(Integer.parseInt(calculatorApplication.getDisplayResultField().getText()));

            int result = 0;
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
        }

    }
}
