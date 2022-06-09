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
        calculatorApplication.setIsNewNumber(true);

        if (!calculatorApplication.getDisplayResultField().getText().equals("")) {
            calculatorApplication.setSecondOperand(Integer.parseInt(calculatorApplication.getDisplayResultField().getText()));
        }

        if (!(calculatorApplication.getOperator().equals("")) && calculatorApplication.getSecondOperand() != null) {

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

            calculatorApplication.setOperator("");

            calculatorApplication.setDisplayResultField(String.valueOf(result));
        }


    }
}
