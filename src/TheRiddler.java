import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer1.equals("a candle")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
	

		// 5. Otherwise, say "wrong" and tell them the answer
} else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is a candle.");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "Score: " + score);		
String answer2 = JOptionPane.showInputDialog("What has hands but can not clap?");
if(answer2.equals("a clock")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
} else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is a clock.");
	
}
JOptionPane.showMessageDialog(null, "Score: " + score);
String answer3 = JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die.");
if(answer3.equals("fire")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
} else {
	JOptionPane.showMessageDialog(null, "Wrong. The correct answer is fire.");
}
JOptionPane.showMessageDialog(null, "Score: " + score);
	}
}

