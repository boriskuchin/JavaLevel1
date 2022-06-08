package javalevel1.homeworks.homework8.listeners;

import javalevel1.homeworks.homework8.CalculatorApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultButtonListener implements ActionListener {

    CalculatorApplication calculatorApplication;

    public ResultButtonListener(CalculatorApplication calculatorApplication) {
        this.calculatorApplication = calculatorApplication;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int result = 0;
        switch (calculatorApplication.getOperator()) {
            case "+":
                result = calculatorApplication.getFirstOperand() + Integer.parseInt(calculatorApplication.getDisplayTextField().getText());
                break;
            case "-":
                result = calculatorApplication.getFirstOperand() - Integer.parseInt(calculatorApplication.getDisplayTextField().getText());
                break;
            case "*":
                result = calculatorApplication.getFirstOperand() * Integer.parseInt(calculatorApplication.getDisplayTextField().getText());
                break;
            case "/":
                result = calculatorApplication.getFirstOperand() / Integer.parseInt(calculatorApplication.getDisplayTextField().getText());
                break;
        }

        calculatorApplication.setDisplayTextField(String.valueOf(result));
    }
}
