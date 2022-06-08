package javalevel1.homeworks.homework8;

import javalevel1.homeworks.homework8.components.MyJButton;

import javax.swing.*;
import java.awt.*;

public class CalculatorApplication extends JFrame {



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

        JTextField displayText = new JTextField();
        displayText.setEditable(false);

        displayText.setText("Test");

        displayText.setFont(new Font("Arial", Font.PLAIN, 40));
        displayPanel.add(displayText);
        return displayPanel;
    }

    private JPanel createOperatorPanel() {
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(4, 1));
        JButton plusBotton = new MyJButton("+");
        JButton minusBotton = new MyJButton("-");
        JButton myltiplyBotton = new MyJButton("*");
        JButton devisionBotton = new MyJButton("/");

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
            numberPanel.add(button);
        }

        JButton clearButton = new MyJButton("AC");
        numberPanel.add(clearButton);

        JButton zeroButton = new MyJButton("0");
        numberPanel.add(zeroButton);

        JButton equalButton = new MyJButton("=");
        numberPanel.add(equalButton);

        return numberPanel;

    }
}
