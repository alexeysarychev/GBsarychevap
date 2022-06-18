package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static lesson8.main.clear;

public class ButtonListener implements ActionListener {
    private JTextField inputField;

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        String btnText = btn.getText();
        if (btn.getText() == ",") {
            btnText = ".";
        }
        if (clear == true) {
            inputField.setText(btnText);
            clear = false;
        } else {
            inputField.setText(inputField.getText() + btnText);
        }
    }
}
