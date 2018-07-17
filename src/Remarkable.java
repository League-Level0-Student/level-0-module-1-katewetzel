import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name1 = JOptionPane.showInputDialog("What is your name?");
	if(name1.equals("Ellie")) {
		JOptionPane.showMessageDialog(null, "You are adorable");
	} else if (name1.equals("Rajit")) {
		JOptionPane.showMessageDialog(null, "You're chill");
	} else {
		JOptionPane.showMessageDialog(null, "I like your hair");
	
	}
}
}
