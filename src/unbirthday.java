import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String name1 = JOptionPane.showInputDialog("What is your birthday (mm/dd)?");
		if(name1.equals("07/16")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday");
		}
	}
}
