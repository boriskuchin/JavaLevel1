package javalevel1.homeworks.homework8;

import javalevel1.homeworks.homework8.components.MyJButton;
import javalevel1.homeworks.homework8.components.MyJTextField;
import javalevel1.homeworks.homework8.listeners.DigitsButtonListener;
import javalevel1.homeworks.homework8.listeners.ClearButtonLestener;
import javalevel1.homeworks.homework8.listeners.OperatorButtonListener;
import javalevel1.homeworks.homework8.listeners.ResultButtonListener;

import javax.swing.*;
import java.awt.*;

public class CalculatorApplication extends JFrame {

    private JTextField displayTextField;
    private int firstOperand;
    private String operator;

    public void setDisplayTextField(String displayText) {
        this.displayTextField.setText(displayText);
    }

    public JTextField getDisplayTextField() {
        return displayTextField;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

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

    private JPanel createDisplayPanel() {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(1,1));

        displayTextField = new MyJTextField();
        displayPanel.add(displayTextField);

        return displayPanel;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public String getOperator() {
        return operator;
    }

    private JPanel createOperatorPanel() {
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(4, 1));
        JButton plusBotton = new MyJButton("+");
        JButton minusBotton = new MyJButton("-");
        JButton myltiplyBotton = new MyJButton("*");
        JButton devisionBotton = new MyJButton("/");

        plusBotton.addActionListener(new OperatorButtonListener(this));
        minusBotton.addActionListener(new OperatorButtonListener(this));
        myltiplyBotton.addActionListener(new OperatorButtonListener(this));
        devisionBotton.addActionListener(new OperatorButtonListener(this));

        operatorPanel.add(plusBotton);
        operatorPanel.add(minusBotton);
        operatorPanel.add(myltiplyBotton);
        operatorPanel.add(devisionBotton);

        return operatorPanel;
    }

    private JPanel createDigitsPanel() {

        JPanel numberPanel = new JPanel();

        numberPanel.setLayout(new GridLayout(4, 3));

        for (int i = 1; i < 10; i++) {
            JButton button = new MyJButton(String.valueOf(i));
            button.addActionListener(new DigitsButtonListener(displayTextField));
            numberPanel.add(button);
        }

        JButton clearButton = new MyJButton("AC");
        clearButton.addActionListener(new ClearButtonLestener(displayTextField));
        numberPanel.add(clearButton);

        JButton zeroButton = new MyJButton("0");
        zeroButton.addActionListener(new DigitsButtonListener(displayTextField));
        numberPanel.add(zeroButton);

        JButton equalButton = new MyJButton("=");
        equalButton.addActionListener(new ResultButtonListener(this));

        numberPanel.add(equalButton);

        return numberPanel;

    }
}
