package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackspaceListener implements ActionListener {


        private final JTextField inputField;
        public BackspaceListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (inputField.getText() == null || inputField.getText().length() == 0) {
                inputField.setText("");
            } else {
                inputField.setText(inputField.getText().substring(0, inputField.getText().length() - 1));
            }
        }
}

