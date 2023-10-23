package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextField;

public class ButtonListener implements ActionListener {

	private JTextField inputField; // Campo de entrada

	public ButtonListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    String command = e.getActionCommand();

	    if (isNumericCommand(command)) {
	        addToInputField(command+" ");
	    } else if (isOperator(command)) {
	        if (command.equals("=")) {
	            performOperation();
	        } else {
	            addToInputField(command+" ");
	        }
	    }
	}


	private boolean isNumericCommand(String command) {
		try {
			Integer.parseInt(command);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private boolean isOperator(String command) {
		return "+-*/=".contains(command);
	}

	private void addToInputField(String text) {
		String currentText = inputField.getText();
		inputField.setText(currentText + text);
	}

	private void performOperation() {
	    String currentText = inputField.getText();

	    if (currentText.isEmpty()) {
	        return;
	    }

	    String[] parts = currentText.split(" ");

	    if (true) {
	    	System.out.println(parts[0]);
	    	System.out.println(parts[1]);
	    	System.out.println(parts[2]);
	    	
	        double operand1 = Double.parseDouble(parts[0]);
	        double operand2 = Double.parseDouble(parts[2]);
	        String operator = parts[1];

	        double result = 0.0;

	        switch (operator) {
	            case "+":
	                result = operand1 + operand2;
	                break;
	            case "-":
	                result = operand1 - operand2;
	                break;
	            case "*":
	                result = operand1 * operand2;
	                break;
	            case "/":
	                if (operand2 != 0) {
	                    result = operand1 / operand2;
	                } else {
	                 
	                    result = Double.NaN;
	                }
	                break;
	        }

	        
	        inputField.setText(Double.toString(result));
	    }
	}




	public JTextField getInputField() {
		return inputField;
	}

	public void setInputField(JTextField inputField) {
		this.inputField = inputField;
	}

	public ButtonListener(JTextField inputField) {
		this.inputField = inputField;
	}
}
