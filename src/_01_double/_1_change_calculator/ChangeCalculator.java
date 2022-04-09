package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
		double nickleCalculation = 0;
		double dimeCalculation = 0;
		double quarterCalculation = 0;
		
		String nickle = JOptionPane.showInputDialog("Hello, input your nickel count here: ");
		int nickleCount = Integer.parseInt(nickle);
		
		String dime = JOptionPane.showInputDialog("Now input your dime count here: ");
		int dimeCount = Integer.parseInt(dime);
		
		String quarter = JOptionPane.showInputDialog("Now input your dime count here: ");
		int quarterCount = Integer.parseInt(quarter);
		
		nickleCalculation = nickleCount * 0.05;
		dimeCalculation = dimeCount * 0.1;
		quarterCalculation = quarterCount * 0.25;
		double total = nickleCalculation + dimeCalculation + quarterCalculation;

		
		JOptionPane.showMessageDialog(null, "In total, you have: $" + total );
		JOptionPane.showMessageDialog(null, "Goodbye.");
		
	}
}

//Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)