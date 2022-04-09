package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("Hello, input your test scores in here: ");
		double result = Integer.parseInt(score);
		if(result <= 1.00 && result >= 0.90) {
			JOptionPane.showMessageDialog(null, "Poggg, thats an A");
		}else if(result < 0.90 && result >= 0.80) {
			JOptionPane.showMessageDialog(null, "Nice job,thats a B");
		}else if(result < 0.80 && result >= 0.70) {
			JOptionPane.showMessageDialog(null, "eh Not too bad, You recieve an C");
		}else if(result < 0.70 && result >= 0.60) {
			JOptionPane.showMessageDialog(null, "I think you should work a bit more harder, you get a D");
		}else{
			JOptionPane.showMessageDialog(null, "I expected so much, I think too much.... (F) (L bozo + cope + ratio)");
		}
		JOptionPane.showMessageDialog(null, "Goodbye :D");
	}
}
