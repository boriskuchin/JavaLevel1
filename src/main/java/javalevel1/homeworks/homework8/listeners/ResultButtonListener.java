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
            calculatorApplication.setSecondOperand(Double.parseDouble(calculatorApplication.getDisplayResultField().getText()));
        }

        if (!(calculatorApplication.getOperator().equals("")) && calculatorApplication.getSecondOperand() != null) {

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

            calculatorApplication.setDisplayFormulaField(String.format("%.4f %s %.4f = ", calculatorApplication.getFirstOperand(), calculatorApplication.getOperator(), calculatorApplication.getSecondOperand()));

            calculatorApplication.setOperator("");
            calculatorApplication.setIsOperatorSet(false);
            calculatorApplication.setFirstOperand(null);
            calculatorApplication.setSecondOperand(null);
            calculatorApplication.setIsNewNumber(true);

            calculatorApplication.setDisplayResultField(String.format("%.4f", result));
        }


    }
}
