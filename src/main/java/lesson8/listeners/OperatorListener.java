package lesson8.listeners;

import lesson8.ApplicationForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import static lesson8.main.*;

public class OperatorListener implements ActionListener {
    private JTextField inputField;

    public OperatorListener(JTextField inputField) {
        this.inputField = inputField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (operator == "") {
            operator = btn.getText();
            a = Double.parseDouble(inputField.getText());
            inputField.setText(inputField.getText());
        } else {
            switch (operator) {
                case ("*"):
                    a = a * Double.parseDouble(inputField.getText());
                    break;
                case ("/"):
                    a = a / Double.parseDouble(inputField.getText());
                    break;
                case ("+"):
                    a = a + Double.parseDouble(inputField.getText());
                    break;
                case ("-"):
                    a = a - Double.parseDouble(inputField.getText());
                    break;
                case ("^"):
                    a = Math.pow(a, Double.parseDouble(inputField.getText()));
                    break;
                case ("√"):
                    a = Math.pow(a, 1.0 / Double.parseDouble(inputField.getText()));
                    break;
            }
            operator = btn.getText();
            if (operator == "=") {
                operator = "";

            }
            DecimalFormat nf = new DecimalFormat("0.###");
            inputField.setText(String.valueOf(nf.format(a)));
        }
        clear = true;
    }
}
