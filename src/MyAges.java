import java.nio.charset.MalformedInputException;

import javax.swing.JOptionPane;

public class MyAges { 
	public static void main(String[] args) {
		
	String answer1 = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(answer1);
	for(int i=age; i>=0;i--) {
		System.out.println(2018-i);
	}
	
}
}
