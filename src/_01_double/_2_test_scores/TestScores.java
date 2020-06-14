package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
String scores=JOptionPane.showInputDialog("wHaTS YOuR tEsT SCoRe?");
int score=Integer.parseInt(scores);
if(score>=75) {
	JOptionPane.showMessageDialog(null, "hooray");
}
if(score<=75){
	JOptionPane.showMessageDialog(null, "thats sad");
}
	}
}