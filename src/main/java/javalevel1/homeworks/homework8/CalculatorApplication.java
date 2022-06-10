package javalevel1.homeworks.homework8;

import javalevel1.homeworks.homework8.components.MyJButton;
import javalevel1.homeworks.homework8.components.MyJTextField;
import javalevel1.homeworks.homework8.listeners.*;

import javax.swing.*;
import java.awt.*;

public class CalculatorApplication extends JFrame {

    private JTextField displayResultField;
    private Double firstOperand = null;
    private Double secondOperand = null;
    private String operator = "";
    private boolean isNewNumber = true;

    private boolean isOperatorSet = false;

    private JTextField displayFormulaField;

    public CalculatorApplication(){
        super();
        this.setTitle("Калькулятор v 0.1");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 320, 400);
        this.add(createDisplayPanel(), BorderLayout.NORTH);
        this.add(createDigitsPanel(), BorderLayout.CENTER);
        this.add(createOperatorPanel(), BorderLayout.WEST);
        this.setVisible(true);

    }

    public boolean getIsOperatorSet() {
        return isOperatorSet;
    }

    public void setIsOperatorSet(boolean operatorSet) {
        isOperatorSet = operatorSet;
    }

    public void setDisplayFormulaField(String text) {
        this.displayFormulaField.setText(text);
    }

    public void setSecondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public Double getSecondOperand() {
        return secondOperand;
    }


    public void setDisplayResultField(String displayText) {
        this.displayResultField.setText(displayText);
    }

    public JTextField getDisplayResultField() {
        return displayResultField;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setFirstOperand(Double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Double getFirstOperand() {
        return firstOperand;
    }

    public boolean getIsNewNumber() {
        return this.isNewNumber;
    }

    public void setIsNewNumber(boolean isNewNumber) {
        this.isNewNumber = isNewNumber;
    }

    private JPanel createOperatorPanel() {
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(4, 1));
        JButton plusButton = new MyJButton("+");
        JButton minusButton = new MyJButton("-");
        JButton multiplyButton = new MyJButton("*");
        JButton devideButton = new MyJButton("/");

        plusButton.addActionListener(new OperatorButtonListener(this));
        minusButton.addActionListener(new MinusOperatorButtonListener(this));
        multiplyButton.addActionListener(new OperatorButtonListener(this));
        devideButton.addActionListener(new OperatorButtonListener(this));

        operatorPanel.add(plusButton);
        operatorPanel.add(minusButton);
        operatorPanel.add(multiplyButton);
        operatorPanel.add(devideButton);

        return operatorPanel;
    }

    private JPanel createDisplayPanel() {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(2,1));

        displayFormulaField = new JTextField();
        displayFormulaField.setEditable(false);

        displayResultField = new MyJTextField();


        displayPanel.add(displayFormulaField);
        displayPanel.add(displayResultField);

        return displayPanel;
    }

    private JPanel createDigitsPanel() {

        JPanel numberPanel = new JPanel();

        numberPanel.setLayout(new GridLayout(4, 3));

        for (int i = 1; i < 10; i++) {
            JButton button = new MyJButton(String.valueOf(i));
            button.addActionListener(new DigitsButtonListener(this));
            numberPanel.add(button);
        }

        JButton clearButton = new MyJButton("AC");
        clearButton.addActionListener(new ClearButtonListener(this));
        numberPanel.add(clearButton);

        JButton zeroButton = new MyJButton("0");
        zeroButton.addActionListener(new DigitsButtonListener(this));
        numberPanel.add(zeroButton);

        JButton equalButton = new MyJButton("=");
        equalButton.addActionListener(new ResultButtonListener(this));

        numberPanel.add(equalButton);

        return numberPanel;

    }
}
