package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
String score=JOptionPane.showInputDialog("wHaTS YOuR tEsT SCoRe?");
if(score>="75") {
	JOptionPane.showMessageDialog(null, "hooray");
}
else {
	JOptionPane.showMessageDialog(null, "thats sad");
}
	}
}
