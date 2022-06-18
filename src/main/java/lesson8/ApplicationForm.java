package lesson8;

import lesson8.Components.NumberJButton;
import lesson8.Components.OperatorJButton;
import lesson8.listeners.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm(String title) throws HeadlessException {
        super(title);
        setBounds(100,100, 250,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setLayout(new BorderLayout());
        add(createTopPanel(), BorderLayout.NORTH);
        add(createCenterPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout((new BorderLayout()));

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin((new Insets(3,3,3,0)));
        inputField.setBackground(new Color(206,236,242));

        inputField.setText("");

        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);
        ActionListener operatorListener = new OperatorListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(operatorListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(5,3));

        JButton step = new OperatorJButton("^");
        digitsPanel.add(step);
        step.addActionListener(new OperatorListener(inputField));

        JButton coren = new OperatorJButton("√");
        digitsPanel.add(coren);
        coren.addActionListener(new OperatorListener(inputField));

        JButton calc = new OperatorJButton("=");
        digitsPanel.add(calc);
        calc.addActionListener(new OperatorListener(inputField));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf((i + 1));
            JButton btn = new NumberJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton clear = new OperatorJButton("C");
        digitsPanel.add(clear);
        clear.addActionListener(new ClearButtonActionListener(inputField));

        JButton bs = new OperatorJButton("bs");
        digitsPanel.add(bs);
        bs.addActionListener(new BackspaceListener(inputField));

        return digitsPanel;
    }


    private  JPanel createOperatorsPanel(ActionListener operatorListener) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(operatorListener);
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(operatorListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("*");
        multiply.addActionListener(operatorListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(operatorListener);
        panel.add(divide);

        JButton dot = new OperatorJButton(",");
        dot.addActionListener(new ButtonListener(inputField));
        panel.add(dot);

        return panel;
    }
}
